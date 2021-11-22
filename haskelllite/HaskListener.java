// Generated from Haskell.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Vector;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public class HaskListener extends HaskellBaseListener {

    HaskellParser parser;
	AbsSynTree root;

    public void printError(String error) {
        System.err.println(error);
        System.exit(-1);
    }

    public HaskListener(HaskellParser parse) {
        this.parser = parser;
    }

	/**
	 * Enter a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
    @Override
	public void enterProgram(HaskellParser.ProgramContext ctx) {
        System.out.println("Translation start.");
    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
    @Override
	public void exitProgram(HaskellParser.ProgramContext ctx) {
		System.out.println("Translation stopped.");
    }
	/**
	 * Enter a parse tree produced by {@link HaskellParser#main}.
	 * @param ctx the parse tree
	 */
    @Override
	public void enterMain(HaskellParser.MainContext ctx) {

    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#main}.
	 * @param ctx the parse tree
	 */
    @Override
	public void exitMain(HaskellParser.MainContext ctx) {

    }
	/**
	 * Enter a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void enterDecls(HaskellParser.DeclsContext ctx) {
		System.out.println(ctx.getText());
    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void exitDecls(HaskellParser.DeclsContext ctx) {

    }
	/**
	 * Enter a parse tree produced by {@link HaskellParser#where}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void enterWhere(HaskellParser.WhereContext ctx) {

    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#where}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void exitWhere(HaskellParser.WhereContext ctx) {

    }
	/**
	 * Enter a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void enterArgs(HaskellParser.ArgsContext ctx) {

    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void exitArgs(HaskellParser.ArgsContext ctx) {

    }
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expr}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void enterExpr(HaskellParser.ExprContext ctx) {
//		System.out.println(ctx.getText());
    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expr}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void exitExpr(HaskellParser.ExprContext ctx) {

    }
	/**
	 * Enter a parse tree produced by {@link HaskellParser#unop}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void enterUnop(HaskellParser.UnopContext ctx) {

    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#unop}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void exitUnop(HaskellParser.UnopContext ctx) {

    }
	/**
	 * Enter a parse tree produced by {@link HaskellParser#binop}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void enterBinop(HaskellParser.BinopContext ctx) {

    }
	/**
	 * Exit a parse tree produced by {@link HaskellParser#binop}.
	 * @param ctx the parse tree
	 */
    @Override 
	public void exitBinop(HaskellParser.BinopContext ctx) {

    }
}