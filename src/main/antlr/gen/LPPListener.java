// Generated from C:/Users/Gaby/Documents/University/Semester XI/Lenguajes de Programacion/Interpreter/grammar/LPP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LPPParser}.
 */
public interface LPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LPPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LPPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LPPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#initializations}.
	 * @param ctx the parse tree
	 */
	void enterInitializations(LPPParser.InitializationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#initializations}.
	 * @param ctx the parse tree
	 */
	void exitInitializations(LPPParser.InitializationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(LPPParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(LPPParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LPPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LPPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(LPPParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(LPPParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LPPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LPPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(LPPParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(LPPParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LPPParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LPPParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(LPPParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(LPPParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#array_dimenstion}.
	 * @param ctx the parse tree
	 */
	void enterArray_dimenstion(LPPParser.Array_dimenstionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#array_dimenstion}.
	 * @param ctx the parse tree
	 */
	void exitArray_dimenstion(LPPParser.Array_dimenstionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#array_dimenstion_p}.
	 * @param ctx the parse tree
	 */
	void enterArray_dimenstion_p(LPPParser.Array_dimenstion_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#array_dimenstion_p}.
	 * @param ctx the parse tree
	 */
	void exitArray_dimenstion_p(LPPParser.Array_dimenstion_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LPPParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LPPParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LPPParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LPPParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#procedures}.
	 * @param ctx the parse tree
	 */
	void enterProcedures(LPPParser.ProceduresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#procedures}.
	 * @param ctx the parse tree
	 */
	void exitProcedures(LPPParser.ProceduresContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(LPPParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(LPPParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(LPPParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(LPPParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LPPParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LPPParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(LPPParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(LPPParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#registers}.
	 * @param ctx the parse tree
	 */
	void enterRegisters(LPPParser.RegistersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#registers}.
	 * @param ctx the parse tree
	 */
	void exitRegisters(LPPParser.RegistersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(LPPParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(LPPParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#register_attribute}.
	 * @param ctx the parse tree
	 */
	void enterRegister_attribute(LPPParser.Register_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#register_attribute}.
	 * @param ctx the parse tree
	 */
	void exitRegister_attribute(LPPParser.Register_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#register_type}.
	 * @param ctx the parse tree
	 */
	void enterRegister_type(LPPParser.Register_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#register_type}.
	 * @param ctx the parse tree
	 */
	void exitRegister_type(LPPParser.Register_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(LPPParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(LPPParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LPPParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LPPParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(LPPParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(LPPParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(LPPParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(LPPParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#escriba}.
	 * @param ctx the parse tree
	 */
	void enterEscriba(LPPParser.EscribaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#escriba}.
	 * @param ctx the parse tree
	 */
	void exitEscriba(LPPParser.EscribaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#lea}.
	 * @param ctx the parse tree
	 */
	void enterLea(LPPParser.LeaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#lea}.
	 * @param ctx the parse tree
	 */
	void exitLea(LPPParser.LeaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#llamar}.
	 * @param ctx the parse tree
	 */
	void enterLlamar(LPPParser.LlamarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#llamar}.
	 * @param ctx the parse tree
	 */
	void exitLlamar(LPPParser.LlamarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#llamar_p}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_p(LPPParser.Llamar_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#llamar_p}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_p(LPPParser.Llamar_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LPPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LPPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(LPPParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(LPPParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#if_statement_p}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement_p(LPPParser.If_statement_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#if_statement_p}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement_p(LPPParser.If_statement_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(LPPParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(LPPParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#switch_statement_p}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement_p(LPPParser.Switch_statement_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#switch_statement_p}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement_p(LPPParser.Switch_statement_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#switch_values}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_values(LPPParser.Switch_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#switch_values}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_values(LPPParser.Switch_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#switch_value}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_value(LPPParser.Switch_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#switch_value}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_value(LPPParser.Switch_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link LPPParser#primaryprimaryprimaryprimaryprimaryprimaryprimary}.
	 * @param ctx the parse tree
	 */
	void enterValues(LPPParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link LPPParser#primaryprimaryprimaryprimaryprimaryprimaryprimary}.
	 * @param ctx the parse tree
	 */
	void exitValues(LPPParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LPPParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LPPParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_mientras(LPPParser.Ciclo_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_mientras(LPPParser.Ciclo_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#ciclo_repita}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_repita(LPPParser.Ciclo_repitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#ciclo_repita}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_repita(LPPParser.Ciclo_repitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_para(LPPParser.Ciclo_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_para(LPPParser.Ciclo_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LPPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LPPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or(LPPParser.Logical_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or(LPPParser.Logical_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and(LPPParser.Logical_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and(LPPParser.Logical_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(LPPParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(LPPParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#equality_ops}.
	 * @param ctx the parse tree
	 */
	void enterEquality_ops(LPPParser.Equality_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#equality_ops}.
	 * @param ctx the parse tree
	 */
	void exitEquality_ops(LPPParser.Equality_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(LPPParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(LPPParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#comparison_ops}.
	 * @param ctx the parse tree
	 */
	void enterComparison_ops(LPPParser.Comparison_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#comparison_ops}.
	 * @param ctx the parse tree
	 */
	void exitComparison_ops(LPPParser.Comparison_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(LPPParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(LPPParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#add_ops}.
	 * @param ctx the parse tree
	 */
	void enterAdd_ops(LPPParser.Add_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#add_ops}.
	 * @param ctx the parse tree
	 */
	void exitAdd_ops(LPPParser.Add_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(LPPParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(LPPParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#mul_ops}.
	 * @param ctx the parse tree
	 */
	void enterMul_ops(LPPParser.Mul_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#mul_ops}.
	 * @param ctx the parse tree
	 */
	void exitMul_ops(LPPParser.Mul_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#exponentiation}.
	 * @param ctx the parse tree
	 */
	void enterExponentiation(LPPParser.ExponentiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#exponentiation}.
	 * @param ctx the parse tree
	 */
	void exitExponentiation(LPPParser.ExponentiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#exponentiation_ops}.
	 * @param ctx the parse tree
	 */
	void enterExponentiation_ops(LPPParser.Exponentiation_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#exponentiation_ops}.
	 * @param ctx the parse tree
	 */
	void exitExponentiation_ops(LPPParser.Exponentiation_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(LPPParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(LPPParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#unary_ops}.
	 * @param ctx the parse tree
	 */
	void enterUnary_ops(LPPParser.Unary_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#unary_ops}.
	 * @param ctx the parse tree
	 */
	void exitUnary_ops(LPPParser.Unary_opsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIMARY_INTEGER}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPRIMARY_INTEGER(LPPParser.PRIMARY_INTEGERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIMARY_INTEGER}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPRIMARY_INTEGER(LPPParser.PRIMARY_INTEGERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIMARY_REAL}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPRIMARY_REAL(LPPParser.PRIMARY_REALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIMARY_REAL}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPRIMARY_REAL(LPPParser.PRIMARY_REALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIMARY_BOOLEAN}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPRIMARY_BOOLEAN(LPPParser.PRIMARY_BOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIMARY_BOOLEAN}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPRIMARY_BOOLEAN(LPPParser.PRIMARY_BOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIMARY_STRING}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPRIMARY_STRING(LPPParser.PRIMARY_STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIMARY_STRING}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPRIMARY_STRING(LPPParser.PRIMARY_STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIMARY_CHAR}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPRIMARY_CHAR(LPPParser.PRIMARY_CHARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIMARY_CHAR}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPRIMARY_CHAR(LPPParser.PRIMARY_CHARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIMARY_EXPR}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPRIMARY_EXPR(LPPParser.PRIMARY_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIMARY_EXPR}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPRIMARY_EXPR(LPPParser.PRIMARY_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIMARY_VARIABLE_ACCESS}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPRIMARY_VARIABLE_ACCESS(LPPParser.PRIMARY_VARIABLE_ACCESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIMARY_VARIABLE_ACCESS}
	 * labeled alternative in {@link LPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPRIMARY_VARIABLE_ACCESS(LPPParser.PRIMARY_VARIABLE_ACCESSContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void enterVariable_access(LPPParser.Variable_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void exitVariable_access(LPPParser.Variable_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#variable_access_p}.
	 * @param ctx the parse tree
	 */
	void enterVariable_access_p(LPPParser.Variable_access_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#variable_access_p}.
	 * @param ctx the parse tree
	 */
	void exitVariable_access_p(LPPParser.Variable_access_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#register_access}.
	 * @param ctx the parse tree
	 */
	void enterRegister_access(LPPParser.Register_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#register_access}.
	 * @param ctx the parse tree
	 */
	void exitRegister_access(LPPParser.Register_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#array_accesses}.
	 * @param ctx the parse tree
	 */
	void enterArray_accesses(LPPParser.Array_accessesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#array_accesses}.
	 * @param ctx the parse tree
	 */
	void exitArray_accesses(LPPParser.Array_accessesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(LPPParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(LPPParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(LPPParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(LPPParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPParser#expr_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_params(LPPParser.Expr_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPParser#expr_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_params(LPPParser.Expr_paramsContext ctx);
}