package dev.microraccoon.framework.dsl.http

import dev.microraccoon.framework.TestContext
import dev.microraccoon.framework.dsl.Step
import dev.microraccoon.framework.meta.DslContext

class HttpStep(private val url: String) : Step {
    override fun execute() {
        println("Make request to $url")
    }
}

@DslContext
class HttpContext

inline fun TestContext.http(url: String, context: HttpContext.() -> Unit) {
    val step = HttpStep(url)

    val stepContext = HttpContext().apply(context)
    registerStep(step)
}