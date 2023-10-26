package mhha.sample.PlayMusic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mhha.sample.PlayMusic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playButton.setOnClickListener{ mediaPlay()}
        binding.pauseButton.setOnClickListener{ mediaPause()}
        binding.stopButton.setOnClickListener{ mediaStop()}

    }//override fun onCreate(savedInstanceState: Bundle?)

    private fun mediaPlay(){

        //서비스 시작
        val intent = Intent(this, MediaPlayerService::class.java).apply {
            action = MEDIA_PLAY
        }
        startService(intent)

//        if(mediaPlyar == null){
//            mediaPlyar = MediaPlayer.create(this, R.raw.samplemusic).apply {
//                isLooping = true
//            }
//        }
//        mediaPlyar?.start()

    }//private fun mediaPlay()

    private fun mediaPause(){
        val intent = Intent(this, MediaPlayerService::class.java).apply {
            action = MEDIA_PAUSE
        }
        startService(intent)

    }//private fun mediaPause()

    private fun mediaStop(){
        val intent = Intent(this, MediaPlayerService::class.java).apply {
            action = MEDIA_STOP
        }
        startService(intent)
    }//private fun mediaStop()

}//class MainActivity : AppCompatActivity()