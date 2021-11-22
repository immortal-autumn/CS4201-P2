// Generated from Haskell.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaskellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaskellVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HaskellParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(HaskellParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(HaskellParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(HaskellParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HaskellParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(HaskellParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(HaskellParser.BinopContext ctx);
}