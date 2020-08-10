// Generated from D:/workspace/demo/antlr-demo/src/main/java/com/jimo/groupNumber\Group.g4 by ANTLR 4.8
package com.jimo.groupNumber;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GroupParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface GroupVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link GroupParser#file}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFile(GroupParser.FileContext ctx);

    /**
     * Visit a parse tree produced by {@link GroupParser#group}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroup(GroupParser.GroupContext ctx);

    /**
     * Visit a parse tree produced by {@link GroupParser#sequence}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSequence(GroupParser.SequenceContext ctx);
}