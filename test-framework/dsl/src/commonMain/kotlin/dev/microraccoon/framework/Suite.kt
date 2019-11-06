package dev.microraccoon.framework

object Suite {
    inline operator fun invoke(context: TestContext.() -> Unit) {
        val testContext = TestContext().apply(context)
        testContext.run()
    }
}