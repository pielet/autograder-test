// Generated from XPath.g4 by ANTLR 4.13.2

package main.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ChildrenAP}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterChildrenAP(XPathParser.ChildrenAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildrenAP}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitChildrenAP(XPathParser.ChildrenAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescendantsAP}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDescendantsAP(XPathParser.DescendantsAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescendantsAP}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDescendantsAP(XPathParser.DescendantsAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DocName}
	 * labeled alternative in {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDocName(XPathParser.DocNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocName}
	 * labeled alternative in {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDocName(XPathParser.DocNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesRP(XPathParser.ParenthesesRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesRP(XPathParser.ParenthesesRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildrenRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChildrenRP(XPathParser.ChildrenRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildrenRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChildrenRP(XPathParser.ChildrenRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilteredRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilteredRP(XPathParser.FilteredRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilteredRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilteredRP(XPathParser.FilteredRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTextRP(XPathParser.TextRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTextRP(XPathParser.TextRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescendantsRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDescendantsRP(XPathParser.DescendantsRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescendantsRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDescendantsRP(XPathParser.DescendantsRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WildcardRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterWildcardRP(XPathParser.WildcardRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WildcardRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitWildcardRP(XPathParser.WildcardRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterConcatRP(XPathParser.ConcatRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitConcatRP(XPathParser.ConcatRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttributeRP(XPathParser.AttributeRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttributeRP(XPathParser.AttributeRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentRP(XPathParser.ParentRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentRP(XPathParser.ParentRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelfRP(XPathParser.SelfRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelfRP(XPathParser.SelfRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagNameRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagNameRP(XPathParser.TagNameRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagNameRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagNameRP(XPathParser.TagNameRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterAndFilter(XPathParser.AndFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitAndFilter(XPathParser.AndFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterIsFilter(XPathParser.IsFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitIsFilter(XPathParser.IsFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(XPathParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(XPathParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterEqualFilter(XPathParser.EqualFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitEqualFilter(XPathParser.EqualFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterOrFilter(XPathParser.OrFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitOrFilter(XPathParser.OrFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(XPathParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(XPathParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringEqualFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterStringEqualFilter(XPathParser.StringEqualFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringEqualFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitStringEqualFilter(XPathParser.StringEqualFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesFilter(XPathParser.ParenthesesFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesFilter(XPathParser.ParenthesesFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(XPathParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(XPathParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XPathParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XPathParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(XPathParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(XPathParser.StringConstantContext ctx);
}