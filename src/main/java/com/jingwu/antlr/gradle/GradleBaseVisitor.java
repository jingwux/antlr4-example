// Generated from E:/DEEPEXI/Other/antlr4-example/src\Gradle.g4 by ANTLR 4.8
package com.jingwu.antlr.gradle;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link GradleVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class GradleBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements GradleVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLine(GradleParser.LineContext ctx) { return visitChildren(ctx); }
}