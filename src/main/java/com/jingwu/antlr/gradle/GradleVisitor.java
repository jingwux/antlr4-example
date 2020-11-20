// Generated from E:/DEEPEXI/Other/antlr4-example/src\Gradle.g4 by ANTLR 4.8
package com.jingwu.antlr.gradle;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GradleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GradleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GradleParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(GradleParser.LineContext ctx);
}