package com.jimo.csv;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/8/13 21:48
 */
public class Main {

    public static void main(String[] args) {

        String csv = "Details,Month,Amount\n" +
                "Mid Bonus,June,\"$2,000\"\n" +
                ",January,\"\"\"zippo\"\"\"\n" +
                "Total Bonuses,\"\",\"$5,000\"";
        final CodePointCharStream charStream = CharStreams.fromString(csv);

        final CSVLexer csvLexer = new CSVLexer(charStream);

        final CommonTokenStream tokens = new CommonTokenStream(csvLexer);

        final CSVParser parser = new CSVParser(tokens);

        System.out.println(parser.file().toStringTree());
    }
}
