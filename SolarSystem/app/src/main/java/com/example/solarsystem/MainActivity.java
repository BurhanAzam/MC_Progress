package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=6000;
    Animation topAnimation;
    ImageView planet;
    ImageView dot;
    ImageView comet;
    ImageView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);

        planet=findViewById(R.id.imageView);
        comet=findViewById(R.id.imageView3);
        text=findViewById(R.id.imageView2);
        dot=findViewById(R.id.imageView4);


        planet.animate().translationXBy(-360).translationYBy(-360).setDuration(20000);
        comet.animate().translationXBy(360).translationYBy(360).setDuration(20000);
        dot.animate().translationYBy(-360).translationXBy(360).setDuration(20000);
        text.setAnimation(topAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }


}