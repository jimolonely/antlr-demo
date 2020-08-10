// Generated from D:/workspace/demo/antlr-demo/src/main/java/com/jimo/groupNumber\Group.g4 by ANTLR 4.8
package com.jimo.groupNumber;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GroupParser}.
 */
public interface GroupListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link GroupParser#file}.
     *
     * @param ctx the parse tree
     */
    void enterFile(GroupParser.FileContext ctx);

    /**
     * Exit a parse tree produced by {@link GroupParser#file}.
     *
     * @param ctx the parse tree
     */
    void exitFile(GroupParser.FileContext ctx);

    /**
     * Enter a parse tree produced by {@link GroupParser#group}.
     *
     * @param ctx the parse tree
     */
    void enterGroup(GroupParser.GroupContext ctx);

    /**
     * Exit a parse tree produced by {@link GroupParser#group}.
     *
     * @param ctx the parse tree
     */
    void exitGroup(GroupParser.GroupContext ctx);

    /**
     * Enter a parse tree produced by {@link GroupParser#sequence}.
     *
     * @param ctx the parse tree
     */
    void enterSequence(GroupParser.SequenceContext ctx);

    /**
     * Exit a parse tree produced by {@link GroupParser#sequence}.
     *
     * @param ctx the parse tree
     */
    void exitSequence(GroupParser.SequenceContext ctx);
}