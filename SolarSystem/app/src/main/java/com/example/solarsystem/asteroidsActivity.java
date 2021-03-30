package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class asteroidsActivity extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asteroids);


        Button asteroidsDescription=(Button) findViewById(R.id.asteroidsdescription);
        final MediaPlayer sound= MediaPlayer.create(this,R.raw.asteroidssound);


        asteroidsDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();

            }
        });
    }
}