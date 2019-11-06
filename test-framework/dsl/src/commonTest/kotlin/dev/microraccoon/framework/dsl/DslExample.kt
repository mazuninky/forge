package dev.microraccoon.framework.dsl

import dev.microraccoon.framework.Suite
import dev.microraccoon.framework.dsl.assert.assert
import dev.microraccoon.framework.dsl.http.http
import dev.microraccoon.framework.dsl.utility.echo
import kotlin.test.Test
import kotlin.test.assertFalse

open class DslExample {
    @Test
    fun `Example test`() = Suite {
        http("http://localhost:8080") {

        }
        echo("Request done")
        assert {
            assertFalse { false }
        }
    }
}