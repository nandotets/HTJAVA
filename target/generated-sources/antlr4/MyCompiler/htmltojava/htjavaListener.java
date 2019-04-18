// Generated from MyCompiler\htmltojava\htjava.g4 by ANTLR 4.5.1
package MyCompiler.htmltojava;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.ArrayList;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import MyCompiler.htmltojava.astnode.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link htjavaParser}.
 */
public interface htjavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link htjavaParser#htjava}.
	 * @param ctx the parse tree
	 */
	void enterHtjava(htjavaParser.HtjavaContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#htjava}.
	 * @param ctx the parse tree
	 */
	void exitHtjava(htjavaParser.HtjavaContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(htjavaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(htjavaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(htjavaParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(htjavaParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(htjavaParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(htjavaParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(htjavaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(htjavaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(htjavaParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(htjavaParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(htjavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(htjavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(htjavaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(htjavaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link htjavaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(htjavaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link htjavaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(htjavaParser.TermContext ctx);
}