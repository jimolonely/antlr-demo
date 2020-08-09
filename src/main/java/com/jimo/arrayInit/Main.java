package com.jimo.arrayInit;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/8/9 10:51
 */
public class Main {
    public static void main(String[] args) throws IOException {

        final CharStream charStream = CharStreams.fromStream(System.in);

        final ArrayInitLexer lexer = new ArrayInitLexer(charStream);

        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        final ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));

        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeStringListener(), tree);
        System.out.println();
    }
}