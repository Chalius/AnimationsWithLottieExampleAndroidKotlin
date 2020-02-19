package com.example.animationswithlottieexampleandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        animation_view.addAnimatorUpdateListener { animation ->
//            // Do something.
//        }
        bt_animation.setOnClickListener {
            animation_view.playAnimation()
        }

        animation_view2.setOnClickListener{
            animation_view2.playAnimation()
        }
    }
}
