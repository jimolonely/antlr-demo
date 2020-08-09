// Generated from D:/workspace/demo/antlr-demo/src/main/java/com/jimo/expr/labeled\LabeledExpr.g4 by ANTLR 4.8
package com.jimo.expr.labeled;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link LabeledExprParser#prog}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProg(LabeledExprParser.ProgContext ctx);

    /**
     * Visit a parse tree produced by the {@code printExpr}
     * labeled alternative in {@link LabeledExprParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintExpr(LabeledExprParser.PrintExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code assign}
     * labeled alternative in {@link LabeledExprParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign(LabeledExprParser.AssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code blank}
     * labeled alternative in {@link LabeledExprParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlank(LabeledExprParser.BlankContext ctx);

    /**
     * Visit a parse tree produced by the {@code addSub}
     * labeled alternative in {@link LabeledExprParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddSub(LabeledExprParser.AddSubContext ctx);

    /**
     * Visit a parse tree produced by the {@code id}
     * labeled alternative in {@link LabeledExprParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId(LabeledExprParser.IdContext ctx);

    /**
     * Visit a parse tree produced by the {@code int}
     * labeled alternative in {@link LabeledExprParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInt(LabeledExprParser.IntContext ctx);

    /**
     * Visit a parse tree produced by the {@code mulDiv}
     * labeled alternative in {@link LabeledExprParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMulDiv(LabeledExprParser.MulDivContext ctx);

    /**
     * Visit a parse tree produced by the {@code parents}
     * labeled alternative in {@link LabeledExprParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParents(LabeledExprParser.ParentsContext ctx);
}