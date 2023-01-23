package com.example.lottie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anim: LottieAnimationView = findViewById(R.id.lottie_anim)
        anim.repeatCount = LottieDrawable.INFINITE
        anim.repeatMode = LottieDrawable.REVERSE
        anim.setAnimation(R.raw.lot)
        anim.playAnimation()


    }
}