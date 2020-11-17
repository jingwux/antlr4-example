// Generated from D:/Projects/Java/Other/antlr-example/src\Sql.g4 by ANTLR 4.8
package com.jingwu.antlr.sql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#sta}.
	 * @param ctx the parse tree
	 */
	void enterSta(SqlParser.StaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sta}.
	 * @param ctx the parse tree
	 */
	void exitSta(SqlParser.StaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ender}.
	 * @param ctx the parse tree
	 */
	void enterEnder(SqlParser.EnderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ender}.
	 * @param ctx the parse tree
	 */
	void exitEnder(SqlParser.EnderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(SqlParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(SqlParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(SqlParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(SqlParser.AsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(SqlParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(SqlParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(SqlParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(SqlParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx);
}