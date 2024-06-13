package core

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

import LPPLexer
import LPPParser

import utils.tlc

class Translator(input: String) {

    private val test = """       
        inicio
            escriba ("No se recibió input...")
        fin


    """.trimIndent()

    private val charStream  = CharStreams.fromString(input.tlc())
    private val tokenSource = LPPLexer(charStream)
    private val tokenStream = CommonTokenStream(tokenSource)
    private val parser      = LPPParser(tokenStream)
    private val tree        = parser.program()
    private val visitor     = LPPTranslator()

    fun translate(): String =
        "${visitor.visit(tree)}\n"

}