// Generated from E:/DEEPEXI/Other/antlr4-example/src\Gradle.g4 by ANTLR 4.8
package com.jingwu.antlr.gradle;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GradleParser}.
 */
public interface GradleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GradleParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GradleParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GradleParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GradleParser.LineContext ctx);
}