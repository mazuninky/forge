package dev.microraccoon.framework.dsl.utility

import dev.microraccoon.framework.TestContext
import dev.microraccoon.framework.dsl.Step

class EchoStep(private val message: String): Step {
    override fun execute() {
        println(message)
    }
}

fun TestContext.echo(message: String) {
    registerStep(EchoStep(message))
}