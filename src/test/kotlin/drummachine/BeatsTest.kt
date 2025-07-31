package drummachine

import dev.drummachine.drummachine.playBeats
import kotlin.test.Test
import kotlin.test.assertEquals

class BeatsTest {
    @Test
    fun playBeatsTest() {
        val playBeats = playBeats("x-x-x-x-x-x-x-x-x-", "test.aiff")
        assertEquals(playBeats("x-----x-----", "test.aiff"), playBeats)
        assertEquals(playBeats("x-x-x-x-x-x-x-x-x-", "test.aiff"), playBeats)
    }
}