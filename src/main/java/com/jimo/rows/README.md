
# 嵌入代码到语法文件

截取表格里的某一列数据

```antlrv4
grammar Rows;

@parser::members {
    int col;
    public RowsParser(TokenStream input,int col){
        this(input);
        this.col = col;
    }
}

file: (row NL)+;

row
locals [int i=0]:
    (
        STUFF
        {
            $i++;
            if($i==col){
                System.out.println($STUFF.text);
            }
        }
    )+;

TAB: '\t' -> skip;
NL: '\r'? '\n' ;
STUFF: ~[\t\r\n]+;
```

然后发现Parser里多个我们声明的构造方法：
```java
    int col;
    public RowsParser(TokenStream input,int col){
        this(input);
        this.col = col;
    }

	public RowsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
```
调用时使用此构造：

```java
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
```
测试：
```antlrv4
输入列：
2
输出数据：
parrt	Terence Parr	101
tombu	Tom Burns	020
bke	    Kevin   Edgar	008
^D
Terence Parr
Tom Burns
    Kevin   Edgar
```

