package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class planetsActivity extends AppCompatActivity {

    ViewFlipper flipper2;
    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);
        getSupportActionBar().hide();

        flipper2=findViewById(R.id.flipper2);
        Button planetsDescription=(Button) findViewById(R.id.planetsdescription);
        Button planetsDescription2=(Button) findViewById(R.id.planetsdescription2);
        Button planetsDescription3=(Button) findViewById(R.id.planetsdescription3);
        sound= MediaPlayer.create(this,R.raw.planetsdescription);
        int array[]={R.drawable.pln1,R.drawable.pln2,R.drawable.pln3,R.drawable.pln4,R.drawable.pln5,R.drawable.pln6,R.drawable.pln7,R.drawable.pln8,R.drawable.pln9};

        for(int i=0;i<array.length;i++)
        {
            showImage(array[i]);
        }
    }

    public void showImage(int img){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper2.addView(imageView);
        flipper2.setFlipInterval(3000);
        flipper2.setAutoStart(true);
        flipper2.setInAnimation(this,android.R.anim.slide_in_left);
        flipper2.setOutAnimation(this, android.R.anim.slide_out_right);
    }
    public void clickstop(View view) {
        sound.stop();
        sound= MediaPlayer.create(planetsActivity.this,R.raw.planetsdescription);
    }

    public void clickpause(View view) {
        sound.pause();
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