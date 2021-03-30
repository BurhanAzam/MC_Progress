package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class planetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        Button planetsDescription=(Button) findViewById(R.id.planetsdescription);
        final MediaPlayer planetsSound= MediaPlayer.create(this,R.raw.planetsdescription);


        planetsDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                planetsSound.start();

            }
        });
    }
}