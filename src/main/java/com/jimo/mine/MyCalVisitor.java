package com.jimo.mine;

import com.jimo.CalBaseVisitor;
import com.jimo.CalParser;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/6/17 15:25
 */
public class MyCalVisitor extends CalBaseVisitor<Object> {

    @Override
    public Object visitParentExpr(CalParser.ParentExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitAddSub(CalParser.AddSubContext ctx) {
        final Object obj0 = ctx.expr(0).accept(this);
        final Object obj1 = ctx.expr(1).accept(this);

        if ("+".equals(ctx.getChild(1).getText())) {
            return ((Integer) obj0) + ((Integer) obj1);
        } else if ("-".equals(ctx.getChild(1).getText())) {
            return ((Integer) obj0) - ((Integer) obj1);
        }
        return 0;
    }

    @Override
    public Object visitMulDiv(CalParser.MulDivContext ctx) {
        final Object obj0 = ctx.expr(0).accept(this);
        final Object obj1 = ctx.expr(1).accept(this);

        if ("*".equals(ctx.getChild(1).getText())) {
            return ((Integer) obj0) * ((Integer) obj1);
        } else if ("/".equals(ctx.getChild(1).getText())) {
            return ((Integer) obj0) / ((Integer) obj1);
        }
        return 0;
    }

    @Override
    public Object visitInt(CalParser.IntContext ctx) {
        return Integer.parseInt(ctx.getText());
    }
}
