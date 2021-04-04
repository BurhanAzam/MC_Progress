package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class sunactivity extends AppCompatActivity {

    ViewFlipper flipper;
    MediaPlayer sunSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunactivity);
        getSupportActionBar().hide();

        flipper=findViewById(R.id.flipper);
        Button sunDescription=(Button) findViewById(R.id.sundescription);
        Button sunDescription2=(Button) findViewById(R.id.sundescription2);
        Button sunDescription3=(Button) findViewById(R.id.sundescription3);
        sunSound= MediaPlayer.create(this,R.raw.sundecription);
        int imagearray[]={R.drawable.sun1,R.drawable.sun2,R.drawable.sun3,R.drawable.sun4,R.drawable.sun5,};

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

    public void clickstop(View view) {
        sunSound.stop();
        sunSound= MediaPlayer.create(this,R.raw.sundecription);
    }

    public void clickpause(View view)
    {
        sunSound.pause();
    }

    public void clickplay(View view) {
        sunSound.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sunSound.release();

    }
}