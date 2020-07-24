// Generated from gramatica_decaf.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatica_decafParser}.
 */
public interface gramatica_decafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#ide}.
	 * @param ctx the parse tree
	 */
	void enterIde(gramatica_decafParser.IdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#ide}.
	 * @param ctx the parse tree
	 */
	void exitIde(gramatica_decafParser.IdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(gramatica_decafParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(gramatica_decafParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramatica_decafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramatica_decafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gramatica_decafParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gramatica_decafParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(gramatica_decafParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(gramatica_decafParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(gramatica_decafParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(gramatica_decafParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(gramatica_decafParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(gramatica_decafParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(gramatica_decafParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(gramatica_decafParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(gramatica_decafParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(gramatica_decafParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(gramatica_decafParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(gramatica_decafParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(gramatica_decafParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(gramatica_decafParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gramatica_decafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gramatica_decafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gramatica_decafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gramatica_decafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(gramatica_decafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(gramatica_decafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramatica_decafParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramatica_decafParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(gramatica_decafParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(gramatica_decafParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(gramatica_decafParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(gramatica_decafParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(gramatica_decafParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(gramatica_decafParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(gramatica_decafParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(gramatica_decafParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(gramatica_decafParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(gramatica_decafParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(gramatica_decafParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(gramatica_decafParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(gramatica_decafParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(gramatica_decafParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(gramatica_decafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(gramatica_decafParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(gramatica_decafParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(gramatica_decafParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(gramatica_decafParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(gramatica_decafParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(gramatica_decafParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(gramatica_decafParser.Bool_literalContext ctx);
}