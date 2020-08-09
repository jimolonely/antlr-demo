
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
