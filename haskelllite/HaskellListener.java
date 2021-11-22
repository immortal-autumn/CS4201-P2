// Generated from Haskell.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public interface HaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HaskellParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HaskellParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(HaskellParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(HaskellParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(HaskellParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(HaskellParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(HaskellParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(HaskellParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HaskellParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HaskellParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(HaskellParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(HaskellParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(HaskellParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(HaskellParser.BinopContext ctx);
}