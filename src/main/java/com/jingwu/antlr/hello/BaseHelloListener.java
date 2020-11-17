package com.jingwu.antlr.hello;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author yuanqing
 * @since 2020/11/17
 */

public class BaseHelloListener implements HelloListener {
    @Override
    public void enterStart(HelloParser.StartContext ctx) {
        System.out.println("ctx = " + ctx);
    }

    @Override
    public void exitStart(HelloParser.StartContext ctx) {

    }

    @Override
    public void enterExpression(HelloParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(HelloParser.ExpressionContext ctx) {

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
