package com.jimo.groupNumber;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/8/10 8:12
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("输入列表：");
        final CharStream charStream = CharStreams.fromStream(System.in);
        final GroupLexer lexer = new GroupLexer(charStream);

        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        final GroupParser parser = new GroupParser(tokens);
        System.out.println(parser.file().toStringTree());
    }
}
