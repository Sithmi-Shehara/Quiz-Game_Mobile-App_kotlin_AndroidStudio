package com.example.mathsquizgame

import android.content.Context
import android.media.MediaPlayer



class SoundManager(private val context: Context) {

    private var media_player: MediaPlayer? = null

    fun playSound(resourceId: Int) {
        // Release any existing MediaPlayer instance
        media_player?.release()

        // Create a new MediaPlayer instance for the specified sound resource
        media_player = MediaPlayer.create(context, resourceId)

        // Start playing the sound
        media_player?.start()

        // Release the MediaPlayer resources when the sound playback is complete
        media_player?.setOnCompletionListener {
            media_player?.release()
            media_player = null
        }
    }

    fun stopSound() {
        media_player?.stop()
        media_player?.release()
        media_player = null
    }
}