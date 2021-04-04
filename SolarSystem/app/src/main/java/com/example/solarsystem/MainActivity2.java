package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("SOLAR SYSTEM");

        final MediaPlayer sunSound= MediaPlayer.create(this,R.raw.sun);
        final MediaPlayer cometsSound= MediaPlayer.create(this,R.raw.comets);
        final MediaPlayer planetsSound= MediaPlayer.create(this,R.raw.planets);
        final MediaPlayer asteroidsSound= MediaPlayer.create(this,R.raw.asteroids);

        Button sunBtn=(Button) this.findViewById(R.id.sun);
        Button planetsBtn=(Button) this.findViewById(R.id.planets);
        Button cometsBtn=(Button) this.findViewById(R.id.comets);
        Button asteroidsBtn=(Button) this.findViewById(R.id.asteriods);

        sunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sunSound.start();
                Intent intent = new Intent(MainActivity2.this, sunactivity.class);
                startActivity(intent);
            }
        });
        cometsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cometsSound.start();
                Intent intent = new Intent(MainActivity2.this, cometsActivity.class);
                startActivity(intent);
            }
        });
        planetsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                planetsSound.start();
                Intent intent = new Intent(MainActivity2.this, planetsActivity.class);
                startActivity(intent);
            }
        });
         asteroidsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                asteroidsSound.start();
                Intent intent = new Intent(MainActivity2.this, asteroidsActivity.class);
                startActivity(intent);
            }
        });
        

    }


}