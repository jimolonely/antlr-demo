// Generated from D:/workspace/demo/antlr-demo/src/main/java/com/jimo\Cal.g4 by ANTLR 4.7.2
package com.jimo;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalParser}.
 */
public interface CalListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CalParser#line}.
     *
     * @param ctx the parse tree
     */
    void enterLine(CalParser.LineContext ctx);

    /**
     * Exit a parse tree produced by {@link CalParser#line}.
     *
     * @param ctx the parse tree
     */
    void exitLine(CalParser.LineContext ctx);

    /**
     * Enter a parse tree produced by the {@code addSub}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAddSub(CalParser.AddSubContext ctx);

    /**
     * Exit a parse tree produced by the {@code addSub}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAddSub(CalParser.AddSubContext ctx);

    /**
     * Enter a parse tree produced by the {@code parentExpr}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterParentExpr(CalParser.ParentExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code parentExpr}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitParentExpr(CalParser.ParentExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code int}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterInt(CalParser.IntContext ctx);

    /**
     * Exit a parse tree produced by the {@code int}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitInt(CalParser.IntContext ctx);

    /**
     * Enter a parse tree produced by the {@code mulDiv}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMulDiv(CalParser.MulDivContext ctx);

    /**
     * Exit a parse tree produced by the {@code mulDiv}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMulDiv(CalParser.MulDivContext ctx);
}