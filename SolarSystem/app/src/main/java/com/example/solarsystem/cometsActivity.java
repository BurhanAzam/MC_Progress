package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class cometsActivity extends AppCompatActivity {

    ViewFlipper flipper;
    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comets);
        getSupportActionBar().hide();

        flipper=findViewById(R.id.flipper1);
        Button cometsDescription1=(Button) findViewById(R.id.cometsdescription1);
        Button cometsDescription2=(Button) findViewById(R.id.cometsdescription2);
        Button cometsDescription3=(Button) findViewById(R.id.cometsdescription3);
        sound= MediaPlayer.create(this,R.raw.cometsound);
        int imagearray[]={R.drawable.comet1,R.drawable.comet2,R.drawable.comet3,R.drawable.comet4,R.drawable.comet5,};

        for(int i=0;i<imagearray.length;i++)
        {
            showImage(imagearray[i]);
        }
    }
    public void showImage(int img){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void clickplay(View view) {
        sound.start();
    }

    public void clickpause(View view) {
        sound.pause();
    }

    public void clickstop(View view) {
        sound.stop();
        sound= MediaPlayer.create(this,R.raw.cometsound);
    }
    @Override
    protected void onPause() {
        super.onPause();
        sound.release();

    }
}