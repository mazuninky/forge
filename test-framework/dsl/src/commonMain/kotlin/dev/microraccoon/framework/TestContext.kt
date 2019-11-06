package dev.microraccoon.framework

import dev.microraccoon.framework.dsl.Step
import dev.microraccoon.framework.meta.DslContext

@DslContext
class TestContext {
    private val steps: MutableList<Step> = mutableListOf()

    fun registerStep(step: Step) {
        steps.add(step)
    }

    @Deprecated("Только для показа")
    fun run() {

    }
}