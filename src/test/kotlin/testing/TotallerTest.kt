package testing

import dev.drummachine.testing.Totaller
import kotlin.test.Test // kotlin.test.Test is a wrapper and abstracted org.junit.jupiter.api.Test
import kotlin.test.assertEquals
// import org.junit.jupiter.api.Test

class TotallerTest {
    @Test
    fun addTest() {
        val totaller = Totaller()
        assertEquals(3, totaller.add(3))
        assertEquals(7, totaller.add(4))
        assertEquals(7, totaller.total)
    }
}