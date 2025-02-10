// Generated from XPath.g4 by ANTLR 4.13.2

package main.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ChildrenAP}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenAP(XPathParser.ChildrenAPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescendantsAP}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendantsAP(XPathParser.DescendantsAPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DocName}
	 * labeled alternative in {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocName(XPathParser.DocNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesRP(XPathParser.ParenthesesRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChildrenRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenRP(XPathParser.ChildrenRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilteredRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilteredRP(XPathParser.FilteredRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextRP(XPathParser.TextRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescendantsRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendantsRP(XPathParser.DescendantsRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WildcardRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardRP(XPathParser.WildcardRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatRP(XPathParser.ConcatRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeRP(XPathParser.AttributeRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentRP(XPathParser.ParentRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfRP(XPathParser.SelfRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagNameRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagNameRP(XPathParser.TagNameRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndFilter(XPathParser.AndFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsFilter(XPathParser.IsFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(XPathParser.NotFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualFilter(XPathParser.EqualFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrFilter(XPathParser.OrFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(XPathParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringEqualFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEqualFilter(XPathParser.StringEqualFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesFilter(XPathParser.ParenthesesFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(XPathParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(XPathParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(XPathParser.StringConstantContext ctx);
}