package dev.microraccoon.framework.dsl.assert

import dev.microraccoon.framework.TestContext
import dev.microraccoon.framework.dsl.Step
import dev.microraccoon.framework.meta.DslContext

class AssertStep : Step {
    override fun execute() {

    }
}

@DslContext
class AssertContext

inline fun TestContext.assert(context: AssertContext.() -> Unit) {
    val step = AssertStep()

    val assertContext = AssertContext().apply(context)
    registerStep(step)
}