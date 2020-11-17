package com.jingwu.antlr.hello;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author yuanqing
 * @since 2020/11/17
 */

public class Main {
    public static void main(String[] args) {
        String epx = "1+2+3+10";
        HelloLexer lexer = new HelloLexer(CharStreams.fromString(epx));
        HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
        HelloParser.StartContext context = parser.start();
        BaseHelloListener listener = new BaseHelloListener();
        ParseTreeWalker.DEFAULT.walk(listener, context);

    }

}
