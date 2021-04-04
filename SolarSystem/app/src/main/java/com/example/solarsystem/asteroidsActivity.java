package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class asteroidsActivity extends AppCompatActivity {

    TextView textView;
    ViewFlipper flipper3;
    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asteroids);
        getSupportActionBar().hide();


        flipper3=findViewById(R.id.flipper3);
        Button asteroidsDescription=(Button) findViewById(R.id.asteroidsdescription);
        Button asteroidsDescription2=(Button) findViewById(R.id.asteroidsdescription2);
        Button asteroidsDescription3=(Button) findViewById(R.id.asteroidsdescription3);
        sound = MediaPlayer.create(this, R.raw.asteroidssound);
        int imagearray[]={R.drawable.ast1,R.drawable.ast2,R.drawable.ast3,R.drawable.ast4,R.drawable.ast5,};

        for(int i=0;i<imagearray.length;i++)
        {
            showImage(imagearray[i]);
        }
    }

    public void showImage(int img){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper3.addView(imageView);
        flipper3.setFlipInterval(3000);
        flipper3.setAutoStart(true);
        flipper3.setInAnimation(this,android.R.anim.slide_in_left);
        flipper3.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void clickpause(View view) {
           sound.pause();
    }

    public void clickstop(View view) {
        sound.stop();
        sound = MediaPlayer.create(this, R.raw.asteroidssound);
    }

    public void clickplay(View view) {
        sound.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        sound.release();

    }
}