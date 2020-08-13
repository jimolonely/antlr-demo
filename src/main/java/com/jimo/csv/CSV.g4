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
