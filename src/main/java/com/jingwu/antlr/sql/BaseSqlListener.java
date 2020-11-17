package com.jingwu.antlr.sql;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author yuanqing
 * @since 2020/11/17
 */

public class BaseSqlListener implements SqlListener {
    @Override
    public void enterSta(SqlParser.StaContext ctx) {

    }

    @Override
    public void exitSta(SqlParser.StaContext ctx) {

    }

    @Override
    public void enterEnder(SqlParser.EnderContext ctx) {

    }

    @Override
    public void exitEnder(SqlParser.EnderContext ctx) {

    }

    @Override
    public void enterSql(SqlParser.SqlContext ctx) {
        String keyword = ctx.children.get(0).getText();  //获取sql规则的第一个元素，为select或者load
        if ("select".equalsIgnoreCase(keyword)) {
            execSelect(ctx);   //第一个元素为selece的时候执行select
        } else if ("load".equalsIgnoreCase(keyword)) {
            execLoad(ctx);  //第一个元素为load的时候执行load
        }
    }

    public void execLoad(SqlParser.SqlContext ctx) {
        List<ParseTree> children = ctx.children;   //获取该规则树的所有子节点
        String format = "";
        String path = "";
        String tableName = "";
        for (ParseTree c : children) {
            if (c instanceof SqlParser.FormatContext) {
                format = c.getText();
            } else if (c instanceof SqlParser.PathContext) {
                path = c.getText().substring(1, c.getText().length() - 1);
            } else if (c instanceof SqlParser.TableNameContext) {
                tableName = c.getText();
            }
        }
        System.out.println(format);
        System.out.println(path);
        System.out.println(tableName);
        // spark load实现，省略
    }

    public void execSelect(SqlParser.SqlContext ctx) {

    }


    @Override
    public void exitSql(SqlParser.SqlContext ctx) {

    }

    @Override
    public void enterAs(SqlParser.AsContext ctx) {

    }

    @Override
    public void exitAs(SqlParser.AsContext ctx) {

    }

    @Override
    public void enterTableName(SqlParser.TableNameContext ctx) {

    }

    @Override
    public void exitTableName(SqlParser.TableNameContext ctx) {

    }

    @Override
    public void enterFormat(SqlParser.FormatContext ctx) {

    }

    @Override
    public void exitFormat(SqlParser.FormatContext ctx) {

    }

    @Override
    public void enterPath(SqlParser.PathContext ctx) {

    }

    @Override
    public void exitPath(SqlParser.PathContext ctx) {

    }

    @Override
    public void enterIdentifier(SqlParser.IdentifierContext ctx) {

    }

    @Override
    public void exitIdentifier(SqlParser.IdentifierContext ctx) {

    }

    @Override
    public void enterQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx) {

    }

    @Override
    public void exitQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
