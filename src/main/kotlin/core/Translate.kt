package core

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

import LPPLexer
import LPPParser
import org.antlr.v4.runtime.CodePointCharStream

class Interpreter(input: String) {

    private val test = """       
        inicio
            escriba ("No se recibió input...")
        fin


    """.trimIndent()

    private val charStream  = CharStreams.fromString(input)
    private val tokenSource = LPPLexer(charStream)
    private val tokenStream = CommonTokenStream(tokenSource)
    private val parser      = LPPParser(tokenStream)
    private val tree        = parser.program()
    private val visitor     = LPPInterpreter()

    fun interpret(): String =
        "${visitor.visit(tree)}\n"

}