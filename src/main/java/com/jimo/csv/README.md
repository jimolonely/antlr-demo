# 解析CSV

```antlrv4
grammar CSV;

file: header row+;
header: row;
row: field (',' field)* '\r'? '\n';
field: TEXT
    | STRING
    |
    ;

// 任意文本
TEXT: ~[,\n\r"]+;
STRING: '"' ('""'|~'"')* '"'; // 两个双引号是对双引号的转义
```

代码：
```java
        String csv = "Details,Month,Amount\n" +
                "Mid Bonus,June,\"$2,000\"\n" +
                ",January,\"\"\"zippo\"\"\"\n" +
                "Total Bonuses,\"\",\"$5,000\"";
        final CodePointCharStream charStream = CharStreams.fromString(csv);

        final CSVLexer csvLexer = new CSVLexer(charStream);

        final CommonTokenStream tokens = new CommonTokenStream(csvLexer);

        final CSVParser parser = new CSVParser(tokens);

        System.out.println(parser.file().toStringTree());
```

结果：

```antlrv4
([] ([8] ([14 8] ([16 14 8] Details) , ([18 14 8] Month) , ([18 14 8] Amount) \n)) ([9] ([16 9] Mid Bonus) , ([18 9] June) , ([18 9] "$2,000") \n) ([9] [16 9] , ([18 9] January) , ([18 9] """zippo""") \n) ([9] ([16 9] Total Bonuses) , ([18 9] "") , ([18 9] "$5,000") <missing '\n'>))
```
