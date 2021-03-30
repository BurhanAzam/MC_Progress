package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cometsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comets);

        Button cometsDescription=(Button) findViewById(R.id.cometsdescription);
        final MediaPlayer sound= MediaPlayer.create(this,R.raw.cometsound);


        cometsDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();

            }
        });
    }
}