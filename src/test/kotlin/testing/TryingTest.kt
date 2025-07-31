package testing

import dev.drummachine.testing.Trying
import kotlin.test.Test
import kotlin.test.assertEquals

class TryingTest {
    @Test
    fun stringBuilderTest() {
        val tryingTest = Trying()
        assertEquals("boom", tryingTest.stringBuilder("boom"))
        assertEquals("boom boom!", tryingTest.stringBuilder("boom boom!"))
    }
}