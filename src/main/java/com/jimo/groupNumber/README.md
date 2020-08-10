# 嵌入代码

分组例子：

```antlrv4
grammar Group;

file : group+ ;

group: INT sequence[$INT.int] ;

sequence[int n]
locals [int i = 1;]
     : ( {$i<=$n}? INT {$i++;} )* // match n integers
     ;

INT :   [0-9]+ ;             // match integers
WS  :   [ \t\n\r]+ -> skip ; // toss out all whitespace
```

测试：
必须要生成代码来测，直接在idea的antlr preview里看不到效果

```java
System.out.println("输入列表：");
final CharStream charStream = CharStreams.fromStream(System.in);
final GroupLexer lexer = new GroupLexer(charStream);

final CommonTokenStream tokens = new CommonTokenStream(lexer);

final GroupParser parser = new GroupParser(tokens);
System.out.println(parser.file().toStringTree());
```
结果：可以看到分成了2组
```java
输入列表：
2 1 3 3 4 5 6
^D
([] ([6] 2 ([12 6] 1 3)) ([6] 3 ([12 6] 4 5 6)))
```
