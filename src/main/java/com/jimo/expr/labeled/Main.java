package com.jimo.expr.labeled;

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

        final LabeledExprLexer exprLexer = new LabeledExprLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(exprLexer);

        final LabeledExprParser parser = new LabeledExprParser(tokens);

        final LabeledExprParser.ProgContext prog = parser.prog();

        final EvalVisitor visitor = new EvalVisitor();
        final Integer res = visitor.visit(prog);
        System.out.println("结果：" + res);
    }
}
