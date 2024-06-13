package core

import LPPBaseVisitor

import symbols.literals
import symbols.operators

class LPPTranslator : LPPBaseVisitor<String?>() {

    override fun visitProgram(ctx: LPPParser.ProgramContext?): String {

        val initializations = visit(ctx?.initializations()) ?: ""
        val principal = visit(ctx?.principal()) ?: "\n"

        val program = """
                /* Inicio traducción */
                
                // Importar librería de entrada para la acción `lea`
                const prompt = require('prompt-sync')(); 
                
                $initializations     
                $principal
                /* Fin traducción */
            """.trimIndent()

        return program
    }

    override fun visitInitializations(ctx: LPPParser.InitializationsContext?): String? {
        val registers = ctx?.register()?.joinToString("\n") { visit(it) ?: "" } ?: ""
        val declarations = visit(ctx?.declarations()) ?: ""
        val functions = ctx?.function()?.joinToString("\n") { visit(it) ?: "" } ?: ""
        val procedures = ctx?.procedure()?.joinToString("\n") { visit(it) ?: "" } ?: ""

        return """
            $registers
            $declarations
            $procedures
            $functions
        """.trimIndent()
    }

    // Declarations

    override fun visitDeclarations(ctx: LPPParser.DeclarationsContext?): String {
        val declares = ctx?.children?.joinToString("\n") { visit(it) ?: "" } ?: ""
        return declares
    }

    override fun visitDeclaration(ctx: LPPParser.DeclarationContext?): String? {
        val typeAssign = "${visit(ctx?.type())}"
        val declar = "let ${visit(ctx?.ids())}$typeAssign;"
        return declar
    }

    override fun visitType(ctx: LPPParser.TypeContext?): String? =
        ctx?.register_type()?.ID()?.let { " = new ${it.text.replaceFirstChar { it.uppercaseChar() }}()" } ?: ""


    override fun visitIds(ctx: LPPParser.IdsContext?): String =
        ctx?.children?.joinToString("") { it.text } ?: ""


    // Registers
    override fun visitRegister(ctx: LPPParser.RegisterContext?): String? {
        val registerType = ctx?.register_type()?.text
            ?.let { rt -> rt.replaceFirstChar { it.uppercaseChar() } } ?: ""

        val registerAttrs =
            ctx?.register_attribute()
                ?.map { visit(it) }

        val fields =
            registerAttrs?.joinToString("\n") { "$it;" } ?: ""

        return """class $registerType { $fields }"""
    }

    override fun visitRegister_attribute(ctx: LPPParser.Register_attributeContext?): String {
        val maybeType = "${visit(ctx?.type())}"
        return "${ctx?.ID()?.text}$maybeType"
    }

    // Parameters
    override fun visitParams(ctx: LPPParser.ParamsContext?): String =
        ctx?.children?.joinToString("") { visit(it) ?: ", " } ?: ""

    override fun visitParam(ctx: LPPParser.ParamContext?): String? {
        val id = ctx?.ID()?.text
        return ctx?.VAR()?.let { "$id = $id" } ?: id
    }

    // Procedures

    override fun visitProcedure(ctx: LPPParser.ProcedureContext?): String? {
        val procedureId = ctx?.ID()?.text
        val procedureParams = ctx?.params()?.let { visit(it) } ?: ""
        val procedureDeclarations = visit(ctx?.declarations()) ?: ""
        val procedureBody = visit(ctx?.statements()) ?: ""

        val jsProcedure = """
            function $procedureId($procedureParams) {
                $procedureDeclarations
                $procedureBody
            }
        """.trimIndent()

        return jsProcedure
    }


    // Functions
    override fun visitFunction(ctx: LPPParser.FunctionContext?): String? {
        val functionId = ctx?.ID()?.text
        val functionParams = ctx?.params()?.let { visit(it) } ?: ""
        val functionDeclarations = visit(ctx?.declarations()) ?: ""
        val functionBody = visit(ctx?.function_body())

        return """
            function $functionId($functionParams) {
                $functionDeclarations
                $functionBody
            }
        """.trimIndent()
    }

    override fun visitFunction_body(ctx: LPPParser.Function_bodyContext?): String? {
        val actions = visit(ctx?.actions())
        val functionReturn = visit(ctx?.expr())?.let { "return $it" } ?: "return;"

        val jsFunctionBody = """
            $actions
            $functionReturn
        """.trimIndent()

        return jsFunctionBody
    }

    override fun visitFunction_type(ctx: LPPParser.Function_typeContext?): String? {
        return "" // JS has no types hahaha :(
    }

    // Statements
    override fun visitStatements(ctx: LPPParser.StatementsContext?): String =
        visit(ctx?.actions()) ?: ""

    override fun visitActions(ctx: LPPParser.ActionsContext?): String =
        ctx?.action()?.joinToString("\n") { visit(it) ?: "" } ?: ""


    // Actions

    override fun visitLlamar(ctx: LPPParser.LlamarContext?): String {
        val id = ctx?.llamar_p()?.ID()?.text ?: ""
        return ctx?.llamar_p()?.function_params()
            ?.let { "$id${visit(it)};" } ?: "console.log(\"\");"
    }

    override fun visitLea(ctx: LPPParser.LeaContext?): String? =
        ctx?.ids()?.children
            ?.joinToString("") { it.text }
            ?.split(",")
            ?.joinToString("\n") { "$it = prompt(\"\");" }


    override fun visitEscriba(ctx: LPPParser.EscribaContext?): String? {
        val exprs = visit(ctx?.function_params()) ?: ""
        return "console.log$exprs;"
    }


    override fun visitAssignment(ctx: LPPParser.AssignmentContext?): String? {
        val variableAccess = visit(ctx?.variable_access())
        val expr           = visit(ctx?.expr()) ?: "expr"
        return """
            $variableAccess = $expr;
        """.trimIndent()
    }


    override fun visitIf_statement(ctx: LPPParser.If_statementContext?): String? {
        val expr = visit(ctx?.expr()) ?: "expr"
        val actions = visit(ctx?.actions()) ?: ""
        val maybeEnd = ctx?.if_statement_p()?.SINO()
            ?.let { "else { ${visit(ctx.if_statement_p()?.actions())} }" } ?: ""

        return """ if ($expr) { $actions } $maybeEnd """
    }

    override fun visitSwitch_statement(ctx: LPPParser.Switch_statementContext?): String? {
        val id = ctx?.ID()?.text
        val switchValue = visit(ctx?.switch_values()) ?: ""
        val maybeDefault = ctx?.switch_statement_p()?.SINO()
            ?.let { "default: {${visit(ctx.switch_statement_p()?.actions())}}" } ?: ""

        return """
            switch ($id) {
                $switchValue
                $maybeDefault
            }
        """.trimIndent()
    }

    override fun visitSwitch_values(ctx: LPPParser.Switch_valuesContext?): String? =
        ctx?.switch_value()?.joinToString("\n") { visit(it) ?: "" } ?: ""


    override fun visitSwitch_value(ctx: LPPParser.Switch_valueContext?): String? {
        val actions = visit(ctx?.actions()) ?: ""
        val valueActions = ctx?.values()?.value()
            ?.joinToString("\n") { "case ${visit(it)}: {$actions break;}" } ?: ""

        return valueActions
    }

    override fun visitValue(ctx: LPPParser.ValueContext?): String {
        return literals.getOrElse(ctx?.text ?: "") { ctx?.text ?: ""  }
    }


    override fun visitCiclo_mientras(ctx: LPPParser.Ciclo_mientrasContext?): String? {
       val expr = visit(ctx?.expr()) ?: "false"
       val actions = visit(ctx?.actions()) ?: ""

       return """while ($expr) { $actions }"""
    }

    override fun visitCiclo_repita(ctx: LPPParser.Ciclo_repitaContext?): String? {
        val expr = visit(ctx?.expr()) ?: "false"
        val actions = visit(ctx?.actions()) ?: ""

        return """do { $actions } while ($expr);"""
    }

    override fun visitCiclo_para(ctx: LPPParser.Ciclo_paraContext?): String? {
        val i = ctx?.ID()?.text ?: "i"
        val from = visit(ctx?.expr(0)) ?: "0"
        val to   = visit(ctx?.expr(1)) ?: "0"
        val actions = visit(ctx?.actions()) ?: ""

        return """for ( $i = $from; $i < $to; $i++ ) { $actions }"""
    }

    // Expr


    override fun visitExpr(ctx: LPPParser.ExprContext?): String? {
        return super.visitExpr(ctx)
    }

    override fun visitLogical_or(ctx: LPPParser.Logical_orContext?): String {
        return ctx?.logical_and()?.joinToString(" || ") { visit(it) ?: "" } ?: ""
    }

    override fun visitLogical_and(ctx: LPPParser.Logical_andContext?): String {
        return ctx?.equality()?.joinToString(" && ") { visit(it) ?: "" } ?: ""
    }

    override fun visitEquality(ctx: LPPParser.EqualityContext?): String {
        return ctx?.children?.joinToString(" ") { visit(it) ?: "" } ?: ""
    }

    override fun visitEquality_ops(ctx: LPPParser.Equality_opsContext?): String {
        return operators.getOrElse(ctx?.text ?: "") { ctx?.text ?: "" }
    }

    override fun visitComparison(ctx: LPPParser.ComparisonContext?): String {
        return ctx?.children?.joinToString(" ") { visit(it) ?: "" } ?: ""
    }

    override fun visitComparison_ops(ctx: LPPParser.Comparison_opsContext?): String = ctx?.text ?: ""


    override fun visitAddition(ctx: LPPParser.AdditionContext?): String {
        return ctx?.children?.joinToString(" ") { visit(it) ?: "" } ?: ""
    }

    override fun visitAdd_ops(ctx: LPPParser.Add_opsContext?): String = ctx?.text ?: ""


    override fun visitMultiplication(ctx: LPPParser.MultiplicationContext?): String {
        return ctx?.children?.joinToString(" ") { visit(it) ?: "" } ?: ""
    }

    override fun visitMul_ops(ctx: LPPParser.Mul_opsContext?): String {
        return operators.getOrElse(ctx?.text ?: "") { ctx?.text ?: "" }
    }

    override fun visitExponentiation(ctx: LPPParser.ExponentiationContext?): String {
        return ctx?.children?.joinToString(" ") { visit(it) ?: "" } ?: ""
    }

    override fun visitExponentiation_ops(ctx: LPPParser.Exponentiation_opsContext?): String =
        operators.getOrElse(ctx?.text ?: "") { ctx?.text ?: "" }

    override fun visitUnary(ctx: LPPParser.UnaryContext?): String =
        ctx?.children?.joinToString(" ") { visit(it) ?: "" } ?: ""



    override fun visitUnary_ops(ctx: LPPParser.Unary_opsContext?): String = ctx?.text ?: ""

    override fun visitPRIMARY_INTEGER(ctx: LPPParser.PRIMARY_INTEGERContext?): String = ctx?.text ?: ""
    override fun visitPRIMARY_REAL(ctx: LPPParser.PRIMARY_REALContext?): String = ctx?.text ?: ""
    override fun visitPRIMARY_BOOLEAN(ctx: LPPParser.PRIMARY_BOOLEANContext?): String =
        literals.getOrElse(ctx?.text ?: "") { ctx?.text ?: "" }

    override fun visitPRIMARY_STRING(ctx: LPPParser.PRIMARY_STRINGContext?): String = ctx?.text ?: ""
    override fun visitPRIMARY_CHAR(ctx: LPPParser.PRIMARY_CHARContext?): String = ctx?.text ?: ""

    override fun visitPRIMARY_EXPR(ctx: LPPParser.PRIMARY_EXPRContext?): String =
        ctx?.expr()?.let { "(${visit(it)})" } ?: ""

    override fun visitPRIMARY_VARIABLE_ACCESS(ctx: LPPParser.PRIMARY_VARIABLE_ACCESSContext?): String =
        ctx?.variable_access()?.let { visit(it) } ?: ""


    override fun visitVariable_access(ctx: LPPParser.Variable_accessContext?): String {

        val id = ctx?.ID()?.text
        val variableAccessP = visit(ctx?.variable_access_p()) ?: ""

        return "$id$variableAccessP"
    }

    override fun visitRegister_access(ctx: LPPParser.Register_accessContext?): String {
        val ids = ctx?.ID()?.joinToString(".") { it.text } ?: ""
        return ".$ids"
    }


    override fun visitArray_accesses(ctx: LPPParser.Array_accessesContext?): String =
        ctx?.array_access()?.joinToString("") { visit(it) ?: "" } ?: ""

    override fun visitArray_access(ctx: LPPParser.Array_accessContext?): String? {
        val arrayAccess = ctx?.text?.replace(",", "][")
        return arrayAccess
    }

    override fun visitFunction_params(ctx: LPPParser.Function_paramsContext?): String =
        "(${ctx?.expr_params()?.let { "${visit(it)}" }})"


    // TODO: Somehow im not visiting expr anywhere
    override fun visitExpr_params(ctx: LPPParser.Expr_paramsContext?): String =
        ctx?.expr()?.joinToString(", ") { visit(it) ?: "" } ?: ""

}