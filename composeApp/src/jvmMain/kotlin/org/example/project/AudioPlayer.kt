package org.example.project

import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.midi.MidiSystem
import javax.sound.midi.Synthesizer

actual class AudioPlayer {

    private val synth: Synthesizer = MidiSystem.getSynthesizer()
    private val channel by lazy { synth.channels[0] }

    init {
        synth.open()

        val url = javaClass.classLoader.getResource("GeneralUser GS.sf2")

        if (url != null) {
            val soundbank = MidiSystem.getSoundbank(url)
            synth.loadAllInstruments(soundbank)
        }

        channel.programChange(0)
    }

    actual fun playSound(name: String) {

        if (name.startsWith("piano_")) {
            playMidi(name)
        } else {
            playSample(name)
        }
    }

    private fun playSample(name: String) {

        try {

            val resource = javaClass.classLoader.getResource(name) ?: return
            val audioInputStream = AudioSystem.getAudioInputStream(resource)

            val clip: Clip = AudioSystem.getClip()
            clip.open(audioInputStream)
            clip.start()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun playMidi(note: String) {

        val midiNote = noteToMidi(note)

        channel.noteOn(midiNote, 100)

        Thread {
            Thread.sleep(400)
            channel.noteOff(midiNote)
        }.start()
    }

    private fun noteToMidi(note: String): Int {

        return when (note) {
            "piano_c2.wav" -> 36
            "piano_d2.wav" -> 38
            "piano_e2.wav" -> 40
            "piano_f2.wav" -> 41
            "piano_g2.wav" -> 43
            "piano_a2.wav" -> 45
            "piano_b2.wav" -> 47
            "piano_c3.wav" -> 48
            "piano_d3.wav" -> 50
            "piano_e3.wav" -> 52
            "piano_f3.wav" -> 53
            "piano_g3.wav" -> 55
            "piano_a3.wav" -> 57
            "piano_b3.wav" -> 59
            "piano_c4.wav" -> 60
            "piano_d4.wav" -> 62
            "piano_e4.wav" -> 64
            "piano_f4.wav" -> 65
            "piano_g4.wav" -> 67
            "piano_a4.wav" -> 69
            "piano_b4.wav" -> 71
            "piano_c5.wav" -> 72
            else -> 60
        }
    }
}