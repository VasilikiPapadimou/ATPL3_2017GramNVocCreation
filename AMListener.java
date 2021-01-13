// Generated from AM.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AMParser}.
 */
public interface AMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#program_structure}.
	 * @param ctx the parse tree
	 */
	void enterProgram_structure(AMParser.Program_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#program_structure}.
	 * @param ctx the parse tree
	 */
	void exitProgram_structure(AMParser.Program_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(AMParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(AMParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AMParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AMParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#bod}.
	 * @param ctx the parse tree
	 */
	void enterBod(AMParser.BodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#bod}.
	 * @param ctx the parse tree
	 */
	void exitBod(AMParser.BodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(AMParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(AMParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AMParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AMParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AMParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AMParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AMParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AMParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(AMParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(AMParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(AMParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(AMParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#ifel}.
	 * @param ctx the parse tree
	 */
	void enterIfel(AMParser.IfelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#ifel}.
	 * @param ctx the parse tree
	 */
	void exitIfel(AMParser.IfelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(AMParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(AMParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AMParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AMParser.ExprContext ctx);
}