package com.jimo.expr.labeled;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jimo
 * @version 1.0.0
 * @date 2020/8/9 11:46
 */
public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    /**
     * 存放ID和值的缓存
     */
    private Map<String, Integer> idValue = new HashMap<>(16);

    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        final String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        idValue.put(id, value);
        return value;
    }

    @Override
    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        final Integer value = visit(ctx.expr());
        System.out.println("结果：" + value);
        return 0;
    }

    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
        final String id = ctx.ID().getText();
        if (idValue.containsKey(id)) {
            return idValue.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        int a = visit(ctx.expr(0));
        int b = visit(ctx.expr(1));
        return ctx.op.getType() == LabeledExprParser.MUL ? a * b : a / b;
    }

    @Override
    public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
        int a = visit(ctx.expr(0));
        int b = visit(ctx.expr(1));
        return ctx.op.getType() == LabeledExprParser.ADD ? a + b : a - b;
    }

    @Override
    public Integer visitParents(LabeledExprParser.ParentsContext ctx) {
        return visit(ctx.expr());
    }
}
