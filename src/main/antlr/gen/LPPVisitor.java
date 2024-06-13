// Generated from C:/Users/Gaby/Documents/University/Semester XI/Lenguajes de Programacion/Interpreter/grammar/LPP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LPPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LPPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#initializations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializations(LPPParser.InitializationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(LPPParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LPPParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(LPPParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LPPParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(LPPParser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LPPParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(LPPParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#array_dimenstion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_dimenstion(LPPParser.Array_dimenstionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#array_dimenstion_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_dimenstion_p(LPPParser.Array_dimenstion_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LPPParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(LPPParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedures(LPPParser.ProceduresContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(LPPParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(LPPParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LPPParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(LPPParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#registers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisters(LPPParser.RegistersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(LPPParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#register_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_attribute(LPPParser.Register_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#register_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_type(LPPParser.Register_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(LPPParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(LPPParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(LPPParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(LPPParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#escriba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscriba(LPPParser.EscribaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#lea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLea(LPPParser.LeaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#llamar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar(LPPParser.LlamarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#llamar_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_p(LPPParser.Llamar_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LPPParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(LPPParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#if_statement_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_p(LPPParser.If_statement_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(LPPParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#switch_statement_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement_p(LPPParser.Switch_statement_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#switch_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_values(LPPParser.Switch_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#switch_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_value(LPPParser.Switch_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link LPPParser#primaryprimaryprimaryprimaryprimaryprimaryprimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(LPPParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LPPParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_mientras(LPPParser.Ciclo_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#ciclo_repita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_repita(LPPParser.Ciclo_repitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#ciclo_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_para(LPPParser.Ciclo_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LPPParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#logical_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or(LPPParser.Logical_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#logical_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and(LPPParser.Logical_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(LPPParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#equality_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_ops(LPPParser.Equality_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(LPPParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#comparison_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_ops(LPPParser.Comparison_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(LPPParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#add_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_ops(LPPParser.Add_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(LPPParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#mul_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_ops(LPPParser.Mul_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#exponentiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiation(LPPParser.ExponentiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#exponentiation_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiation_ops(LPPParser.Exponentiation_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(LPPParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#unary_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_ops(LPPParser.Unary_opsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRIMARY_INTEGER}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRIMARY_INTEGER(LPPParser.PRIMARY_INTEGERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRIMARY_REAL}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRIMARY_REAL(LPPParser.PRIMARY_REALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRIMARY_BOOLEAN}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRIMARY_BOOLEAN(LPPParser.PRIMARY_BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRIMARY_STRING}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRIMARY_STRING(LPPParser.PRIMARY_STRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRIMARY_CHAR}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRIMARY_CHAR(LPPParser.PRIMARY_CHARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRIMARY_EXPR}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRIMARY_EXPR(LPPParser.PRIMARY_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRIMARY_VARIABLE_ACCESS}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRIMARY_VARIABLE_ACCESS(LPPParser.PRIMARY_VARIABLE_ACCESSContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#variable_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_access(LPPParser.Variable_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#variable_access_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_access_p(LPPParser.Variable_access_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#register_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_access(LPPParser.Register_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#array_accesses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_accesses(LPPParser.Array_accessesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(LPPParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(LPPParser.Function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPParser#expr_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_params(LPPParser.Expr_paramsContext ctx);
}