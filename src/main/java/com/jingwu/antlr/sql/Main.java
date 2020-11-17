package com.jingwu.antlr.sql;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author yuanqing
 * @since 2020/11/17
 */

public class Main {
    public static void main(String[] args) {
        String len = "load json.`F:\\tmp\\user` as temp;";
        SqlLexer lexer = new SqlLexer(CharStreams.fromString(len));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        SqlParser.SqlContext tree = parser.sql();
        BaseSqlListener listener = new BaseSqlListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);  //规则树遍历

        SqlBaseVisitor<String> visitor = new SqlBaseVisitor<String>() {
            @Override
            public String visitTableName(SqlParser.TableNameContext ctx) {

                return "super.visitTableName(ctx)";
            }
        };
        SqlParser.TableNameContext tableNameContext = parser.tableName();
        String tableName = visitor.visitTableName(tableNameContext);
        System.out.println("tableName = " + tableName);
    }

    public static class Info{
        private String name;
        private String version;
        private String language;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }

}
