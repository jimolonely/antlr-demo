
# 序列模式

## 描述CSV

```antlrv4
file: (row '\n')*;
row: field (',' field)*;
field: INT // 假设都是整数
```

## 描述语言

分号分隔的语句
```antlrv4
stats: (stat ';')*;
```

# 分支模式

```antlrv4
field: INT | STRING;

type: 'float' | 'int' | 'void';
```

# 词法符号依赖模式

一个词法符号需要和一个或多个后续词法符号匹配，例如匹配成对出现的括号
```antlrv4
vector: '[' INT+ ']';
```
json
```antlrv4
object
    : '{' pair (',' pair)* '}'
    | '{' '}' // 空对象
    ;
pair: STRING ':' value;
```

# 嵌套模式

while
```antlrv4
stat: 'while' '(' expr ')' stat
    | '{' stat* '}'
    ... // 其他种类语句
    ;
```
数组
```antlrv4
arr: ID '[' arr ']' // a[1], a[a[2]]
    | INT
    ;
```

