package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("ActivityLifeCycle3", "onCreateCalled");

    }
    @Override
    protected void onStart() {

        super.onStart();
        Log.d("ActivityLifeCycle3", "onStart ");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("ActivityLifeCycle3", "onStop ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle3", "onPause ");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d("ActivityLifeCycle3", "onResume ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle3", "onDestroy ");
    }
}