package com.jimo.arrayInit;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/8/9 10:30
 */
public class ShortToUnicodeStringListener extends ArrayInitBaseListener {

    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        // { 翻译成 "
        System.out.println('"');
    }

    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        // } 翻译成 "
        System.out.println('"');
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        System.out.println("\\u" + Integer.parseUnsignedInt(ctx.INT().getText(), 16));
    }
}
