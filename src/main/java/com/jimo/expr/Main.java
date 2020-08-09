package com.jimo.expr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/8/9 11:03
 */
public class Main {

    public static void main(String[] args) throws IOException {
        final CharStream charStream = CharStreams.fromStream(System.in);

        final ExprLexer exprLexer = new ExprLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(exprLexer);
        final ExprParser parser = new ExprParser(tokens);

        final ExprParser.ProgContext tree = parser.prog();
        System.out.println(tree.toStringTree());
    }
}
