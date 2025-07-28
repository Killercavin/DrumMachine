package dev.drummachine

import org.slf4j.LoggerFactory
import java.io.File
import java.io.FileNotFoundException
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.UnsupportedAudioFileException

/*
Upto now the code is synchronous, the goal is to make it asynchronous
 */

private val logger = LoggerFactory.getLogger("")
fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0

    for (part in parts) {
        count += part.length + 1

        if (part == "") {
            playSound(file)
        } else {
            Thread.sleep(100 * (part.length + 1L))

            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}


fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(file)
    )

    clip.open(audioInputStream)
    clip.start()
}

fun main() {
    logger.info("Reading the audio files")
    try {
        try {
            logger.info("Playing the audio files")
            playBeats("x-x-x-x-x-x-", "test.aiff")
            // playBeats("x-----x-----", "another-test_file.wav") // this will return no such fie or directory
        } catch (e: UnsupportedAudioFileException) {
            logger.warn(e.message)
        }
    } catch (e: FileNotFoundException) {
        logger.warn(e.message)
    }
}