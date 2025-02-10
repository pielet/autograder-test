package main;

import main.antlr.XPathParser;
import main.antlr.XPathBaseVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.nio.file.Paths;

public class Engine extends XPathBaseVisitor<List<Node>> {

    private List<Node> nodeList = new ArrayList<>();

    @Override
    public List<Node> visitChildrenAP(XPathParser.ChildrenAPContext ctx) {
        visit(ctx.doc());
        return visit(ctx.rp());
    }

    @Override
    public List<Node> visitDescendantsAP(XPathParser.DescendantsAPContext ctx) {
        visit(ctx.doc());
        nodeList.addAll(getDescendants(nodeList));
        return visit(ctx.rp());
    }

    @Override
    public List<Node> visitDocName(XPathParser.DocNameContext ctx) {
        List<Node> result = new ArrayList<>();
        String basePath = "/autograder/source/data/";
        String fileName = ctx.fileName().getText();
        String filePath = basePath + fileName;

        Node rootNode = XMLHelper.loadXMLDocument(filePath);
        if (rootNode != null) {
            result.add(rootNode);
        } else {
            System.out.println("Failed to load XML document from: " + filePath);
        }
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitParenthesesRP(XPathParser.ParenthesesRPContext ctx) {
        return visit(ctx.rp());
    }

    @Override
    public List<Node> visitChildrenRP(XPathParser.ChildrenRPContext ctx) {
        visit(ctx.rp(0));
        List<Node> result = unique(visit(ctx.rp(1)));
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitFilteredRP(XPathParser.FilteredRPContext ctx) {
        List<Node> candidates = visit(ctx.rp());
        List<Node> result = new ArrayList<>();
        for (Node node : candidates) {
            List<Node> curr = new ArrayList<>();
            curr.add(node);
            nodeList = curr;
            if (!visit(ctx.f()).isEmpty())
                result.add(node);
        }
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitTextRP(XPathParser.TextRPContext ctx) {
        List<Node> result = new ArrayList<>();
        for (Node node : nodeList) {
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                if (children.item(i).getNodeType() == Node.TEXT_NODE)
                    result.add(children.item(i));
            }
        }
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitDescendantsRP(XPathParser.DescendantsRPContext ctx) {
        visit(ctx.rp(0));
        nodeList.addAll(getDescendants(nodeList));
        List<Node> result = unique(visit(ctx.rp(1)));
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitWildcardRP(XPathParser.WildcardRPContext ctx) {
        List<Node> result = new ArrayList<>();
        for (Node node : nodeList) {
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                result.add(children.item(i));
            }
        }
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitConcatRP(XPathParser.ConcatRPContext ctx) {
        List<Node> oldNodeList = new ArrayList<>(nodeList);
        List<Node> result = visit(ctx.rp(0));
        nodeList = oldNodeList;
        result.addAll(visit(ctx.rp(1)));
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitAttributeRP(XPathParser.AttributeRPContext ctx) {
        List<Node> result = new ArrayList<>();
        for (Node node : nodeList) {
            NamedNodeMap nodeMap = node.getAttributes();
            if (nodeMap != null && nodeMap.getNamedItem(ctx.attName().getText()) != null) {
                result.add(node);
            }
        }
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitParentRP(XPathParser.ParentRPContext ctx) {
        List<Node> result = new ArrayList<>();
        for (Node node : nodeList) {
            result.add(node.getParentNode());
        }
        result = unique(result);
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitSelfRP(XPathParser.SelfRPContext ctx) {
        List<Node> result = new ArrayList<>(nodeList);

        return result;
    }

    @Override
    public List<Node> visitTagNameRP(XPathParser.TagNameRPContext ctx) {
        String tagName = ctx.tagName().getText();
        List<Node> result = new ArrayList<>();
        for (Node node : nodeList) {
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                if (children.item(i).getNodeType() == Node.ELEMENT_NODE && children.item(i).getNodeName().equals(tagName))
                    result.add(children.item(i));
            }
        }
        nodeList = result;

        return result;
    }

    @Override
    public List<Node> visitAndFilter(XPathParser.AndFilterContext ctx) {
        List<Node> oldNodeList = new ArrayList<>(nodeList);
        List<Node> nodesA = visit(ctx.f(0));
        nodeList = oldNodeList;
        List<Node> nodesB = visit(ctx.f(1));
        nodeList = oldNodeList;
        if (nodesA.isEmpty() || nodesB.isEmpty()) {
            return new ArrayList<>();
        }
        return nodeList;
    }

    @Override
    public List<Node> visitIsFilter(XPathParser.IsFilterContext ctx) {
        List<Node> oldNodeList = new ArrayList<>(nodeList);
        List<Node> nodesA = visit(ctx.rp(0));
        nodeList = oldNodeList;
        List<Node> nodesB = visit(ctx.rp(1));
        nodeList = oldNodeList;
        for (Node nodeA : nodesA) {
            for (Node nodeB : nodesB) {
                if (nodeA.isSameNode(nodeB)) {
                    return nodeList;
                }
            }
        }

        return new ArrayList<>();
    }

    @Override
    public List<Node> visitNotFilter(XPathParser.NotFilterContext ctx) {
        if (visit(ctx.f()).isEmpty()) {
            return nodeList;
        }

        return new ArrayList<>();
    }

    @Override
    public List<Node> visitEqualFilter(XPathParser.EqualFilterContext ctx) {
        List<Node> oldNodeList = new ArrayList<>(nodeList);
        List<Node> nodesA = visit(ctx.rp(0));
        nodeList = oldNodeList;
        List<Node> nodesB = visit(ctx.rp(1));
        nodeList = oldNodeList;
        for (Node nodeA : nodesA) {
            for (Node nodeB : nodesB) {
                if (nodeA.isEqualNode(nodeB)) {
                    return nodeList;
                }
            }
        }

        return new ArrayList<>();
    }

    @Override
    public List<Node> visitOrFilter(XPathParser.OrFilterContext ctx) {
        List<Node> oldNodeList = new ArrayList<>(nodeList);
        List<Node> nodesA = visit(ctx.f(0));
        nodeList = oldNodeList;
        List<Node> nodesB = visit(ctx.f(1));
        nodeList = oldNodeList;
        if (nodesA.isEmpty() && nodesB.isEmpty()) {
            return new ArrayList<>();
        }

        return nodeList;
    }

    @Override
    public List<Node> visitRpFilter(XPathParser.RpFilterContext ctx) {
        List<Node> oldNodeList = new ArrayList<>(nodeList);
        List<Node> nodes = visit(ctx.rp());
        nodeList = oldNodeList; 
        if (nodes.isEmpty()) {
            return new ArrayList<>();
        }

        return nodeList;
    }

    @Override
    public List<Node> visitParenthesesFilter(XPathParser.ParenthesesFilterContext ctx) {
        return visit(ctx.f());
    }

    @Override
    public List<Node> visitStringEqualFilter(XPathParser.StringEqualFilterContext ctx) {
        List<Node> oldNodeList = new ArrayList<>(nodeList);
        List<Node> nodes = visit(ctx.rp());
        nodeList = oldNodeList;
        String stringConstant = ctx.stringConstant().getText().replace("\"", "").replace("'", "");
        for (Node node : nodes) {
            if (node.getNodeType() == Node.TEXT_NODE && node.getTextContent().equals(stringConstant)) {
                return nodeList;
            }
        }

        return new ArrayList<>();
    }

    private List<Node> getDescendants(List<Node> nodes) {
        List<Node> result = new ArrayList<>();
        for (Node node : nodes) {
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                List<Node> child = new ArrayList<>();
                child.add(children.item(i));
                result.add(children.item(i));
                result.addAll(getDescendants(child));
            }
        }

        return unique(result);
    }

    private List<Node> unique(List<Node> nodes) {
        Set<Node> nodeSet = new LinkedHashSet<>(nodes);
        return new ArrayList<>(nodeSet);
    }
}