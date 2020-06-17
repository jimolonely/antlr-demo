// Generated from D:/workspace/demo/antlr-demo/src/main/java/com/jimo\Cal.g4 by ANTLR 4.7.2
package com.jimo;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CalVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CalParser#line}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLine(CalParser.LineContext ctx);

    /**
     * Visit a parse tree produced by the {@code addSub}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddSub(CalParser.AddSubContext ctx);

    /**
     * Visit a parse tree produced by the {@code parentExpr}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParentExpr(CalParser.ParentExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code int}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInt(CalParser.IntContext ctx);

    /**
     * Visit a parse tree produced by the {@code mulDiv}
     * labeled alternative in {@link CalParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMulDiv(CalParser.MulDivContext ctx);
}