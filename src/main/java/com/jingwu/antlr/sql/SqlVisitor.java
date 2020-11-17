// Generated from D:/Projects/Java/Other/antlr-example/src\Sql.g4 by ANTLR 4.8
package com.jingwu.antlr.sql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSta(SqlParser.StaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ender}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnder(SqlParser.EnderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(SqlParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs(SqlParser.AsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(SqlParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(SqlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx);
}