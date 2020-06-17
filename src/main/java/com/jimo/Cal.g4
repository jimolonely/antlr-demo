// http://icejoywoo.github.io/2019/01/16/intro-to-antlr4.html
// file: Calculator.g4
grammar Cal;

line : expr EOF ;

expr : '(' expr ')'               # parentExpr
     | expr ('*'|'/') expr        # mulDiv
     | expr ('+'|'-') expr        # addSub
     | DIGIT                      # int
     ;

WS : [ \t\n\r]+ -> skip;
DIGIT : [0-9]+;