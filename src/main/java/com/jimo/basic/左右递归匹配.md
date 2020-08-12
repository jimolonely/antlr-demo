
# 左匹配

例如：如下语法

```antlrv4
expr: expr * expr
    | expr + expr
    | INT
    ;
```

其实：1+2*3有2种解释：

* 1 + (2*3) = 7
* (1+2) * 3 = 9

所以antlr里采用最左匹配，优先匹配写在前面的语法，也就是乘法来解决优先级问题。

# 右匹配

从右向左结合，比如乘方 `2^3^4`

```antlrv4
expr: <assoc=right> expr '^' expr;
    | INT
    ;
```

# 左递归与右递归

上面的expr既是左递归又是右递归，因为他们都重复调用了自己左边或右边的表达式。

antlr无法处理间接左递归：

```antlrv4
expr: expo
    | ...
    ;

expo: expr * expr;
```


