# 编译运行

使用IDEA

1. 安装插件： `ANTLR v4 grammar plugin`
2. 在语法文件上右键： `Configure ANTLR...`
3. 配置生成代码的目录

# 使用命令行

linux很好配，下面是windows的：

```shell script
PS D:\software\antlr> dir

    目录: D:\software\antlr

Mode                LastWriteTime         Length Name
----                -------------         ------ ----
-a----       2019/10/18     16:24        2079769 antlr-4.7.2-complete.jar
-a----       2019/10/18     16:52             25 antlr4.bat
-a----         2020/8/9      9:03             32 grun.bat

PS D:\software\antlr> cat .\antlr4.bat
java org.antlr.v4.Tool %*

PS D:\software\antlr> cat .\grun.bat
java org.antlr.v4.gui.TestRig %*
```

然后把这个目录配到环境变量，在其他地方就可以引用了。

找一个简单的Hello.g4

```antlrv4
// Define a grammar called Hello
grammar Hello;
r  : 'hello' ID ;         // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
```
然后编译测试
```shell script
// 生成代码
PS D:\tmp> antlr4.bat .\Hello.g4

// 编译代码
PS D:\tmp> javac *.java

// 测试
PS D:\tmp> grun.bat Hello r -tree
hello jimo
^Z  // Ctrl + Z退出
(r hello jimo)
```
grun脚本的语法： `grun 语法名 规则名 参数`
```shell script
java org.antlr.v4.gui.TestRig GrammarName startRuleName
  [-tokens] [-tree] [-gui] [-ps file.ps] [-encoding encodingname]
  [-trace] [-diagnostics] [-SLL]
  [input-filename(s)]
```
