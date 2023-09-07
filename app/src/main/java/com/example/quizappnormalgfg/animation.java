package com.example.quizappnormalgfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        Intent intt  = new Intent(this,MainActivity.class);
        LottieAnimationView lav = findViewById(R.id.LAV);
        lav.setAnimation(R.raw.quiz);
        lav.playAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intt);
                finish();
            }
        },1200);
    }
}