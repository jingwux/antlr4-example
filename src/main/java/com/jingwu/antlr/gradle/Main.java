package com.jingwu.antlr.gradle;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * @author yuanqing
 * @since 2020/11/20
 */

public class Main {

    public static void main(String[] args) throws IOException {
        GradleLexer lexer = new GradleLexer(CharStreams.fromFileName("E:\\Projects\\Examples\\demo\\build.gradle"));
        GradleParser parser = new GradleParser(new CommonTokenStream(lexer));

        GradleParser.LineContext context = parser.line();

//        System.out.println("context = " + context.getText());
        GradleBaseVisitor<String> visitor = new GradleBaseVisitor<String>() {
            @Override
            public String visitLine(GradleParser.LineContext ctx) {
                System.out.println("ctx.getChild(0) = " + ctx.getChild(0));
                return super.visitLine(ctx);
            }
        };
        String line = visitor.visitLine(context);
        System.out.println("line = " + line);
    }

}
