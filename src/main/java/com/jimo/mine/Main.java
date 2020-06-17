package com.jimo.mine;

import com.jimo.CalLexer;
import com.jimo.CalParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String expr = "(1+3)* 9 /3";

        final CalLexer lexer = new CalLexer(CharStreams.fromString(expr));
        final CalParser parser = new CalParser(new CommonTokenStream(lexer));

        final MyCalVisitor myCalVisitor = new MyCalVisitor();
        System.out.println(myCalVisitor.visit(parser.expr()));
    }
}
