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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link htjavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface htjavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link htjavaParser#htjava}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtjava(htjavaParser.HtjavaContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(htjavaParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(htjavaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(htjavaParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(htjavaParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(htjavaParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(htjavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(htjavaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link htjavaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(htjavaParser.TermContext ctx);
}