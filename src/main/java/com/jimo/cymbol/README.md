# Cymbol语言

```antlrv4
grammar Cymbol;

file: (functionDecl | varDecl)+;

varDecl: type ID ('=' expr)? ';' ;

type: 'float' | 'int' | 'void';

functionDecl: type ID '(' formalParameters? ')' block;

formalParameters: formalParameter (',' formalParameter)*;

formalParameter: type ID;

block: '{' stat* '}';

stat: block
    | varDecl
    | 'if' expr 'then' stat ('else' stat)?
    | 'return' expr? ';'
    | expr '=' expr ';' // 赋值
    | expr ';' // 函数调用
    ;

// 从高到低的优先级排列
expr: ID '(' exprList? ')' // f(), f(1,2)等函数调用
    | expr '[' expr ']' // a[i], a[i][j] 的数组索引
    | '-' expr
    | '!' expr
    | expr '*' expr
    | expr ('+' | '-') expr
    | expr '==' expr
    | ID
    | INT
    | '(' expr ')'
    ;
exprList: expr (',' expr)* ;

ID: [a-zA-Z_] [a-zA-Z0-9_]*;
INT: '0' | [1-9] [0-9]*;

WS: [ \t\n\r]+ -> skip;
```

测试
```c
int a=0;
int func(int x){
    if x==0 then return 1;
    return x * func(x-1);
}
```