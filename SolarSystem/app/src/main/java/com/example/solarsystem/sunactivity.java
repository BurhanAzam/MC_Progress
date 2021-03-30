package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class sunactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunactivity);

        Button sunDescription=(Button) findViewById(R.id.sundescription);
        final MediaPlayer sunSound= MediaPlayer.create(this,R.raw.sundecription);


        sunDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sunSound.start();
            }
        });
    }
    
}