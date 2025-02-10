package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;

import main.antlr.XPathLexer;
import main.antlr.XPathParser;

import org.w3c.dom.Node;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Usage: java Main <input xml file> <input query file> <output file>");
            System.exit(1);
        }

        String inputQueryPath = args[1];
        String outputFilePath = args[2];

        try {
            CharStream input = CharStreams.fromFileName(inputQueryPath);
            XPathLexer lexer = new XPathLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XPathParser parser = new XPathParser(tokens);
            ParseTree tree = parser.ap();
            Engine engine = new Engine();
            List<Node> queryResult = engine.visit(tree);

            XMLHelper.saveNodesToXML(queryResult, outputFilePath);

            System.out.println("Results saved to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Failed to read input file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}