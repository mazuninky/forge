package xyz.mazuninky.qmath.compiler

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import xyz.mazuninky.qmath.compiler.grammar.QuickMathLexer
import xyz.mazuninky.qmath.compiler.grammar.QuickMathParser

fun main() {
    compile("lil")
}

fun compile(fileName: String) {
//    val inputStream = CharStreams.fromFileName(fileName)
    val inputStream = CharStreams.fromString("1+1")
    val lexer = QuickMathLexer(inputStream)
    val tokenStream = CommonTokenStream(lexer)
    val parser = QuickMathParser(tokenStream)

    parser.file()
}
