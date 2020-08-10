package com.jimo.rows;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/8/10 8:12
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int col = 1;
        System.out.println("输入列：");
        final Scanner scanner = new Scanner(System.in);
        col = scanner.nextInt();
        System.out.println("输出数据：");
        final CharStream charStream = CharStreams.fromStream(System.in);
        final RowsLexer rowsLexer = new RowsLexer(charStream);

        final CommonTokenStream tokens = new CommonTokenStream(rowsLexer);

        final RowsParser parser = new RowsParser(tokens, col);
        // 无需浪费时间生成语法树
        parser.setBuildParseTree(false);
        parser.file();// 直接解析
    }
}
