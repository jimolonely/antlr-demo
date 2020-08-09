# 一个语法文件

```antlrv4
grammar Expr;

prog: stat+;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr: expr ('*' | '/') expr
    | expr ('-' | '+') expr
    | INT
    | ID
    | '(' expr ')'
    ;

ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip;
```

# 语法导入

对于很大的语法文件，可以拆分再导入

LibExpr.g4

```antlrv4
grammar LibExpr;
import CommonLexerRules;

prog: stat+;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr: expr ('*' | '/') expr
    | expr ('-' | '+') expr
    | INT
    | ID
    | '(' expr ')'
    ;
```
CommonLexerRules.g4
```antlrv4
//lexer grammar CommonLexerRules;
grammar CommonLexerRules;

ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip;
```

# 给语法加入标签

加标签的目的是方便代码里引用

```antlrv4

grammar LabeledExpr;

prog: stat+;

stat: expr NEWLINE                  # printExpr
    | ID '=' expr NEWLINE           # assign
    | NEWLINE                       # blank
    ;

expr: expr op=('*' | '/') expr      # mulDiv
    | expr op=('-' | '+') expr      # addSub
    | INT                           # int
    | ID                            # id
    | '(' expr ')'                  # parents
    ;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip;
```
测试
```antlrv4
a=100
b=110
a+b*(1+a/b*3)
^D
结果：210
```
