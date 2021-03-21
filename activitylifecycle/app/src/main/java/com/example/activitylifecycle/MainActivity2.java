package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onStart() {

        super.onStart();
        Log.d("ActivityLifeCycle2", "onStart ");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("ActivityLifeCycle2", "onStop ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle2", "onPause ");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d("ActivityLifeCycle2", "onResume ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle2", "onDestroy ");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("ActivityLifeCycle2", "onCreateCalled");
    }
    public void MainActivity3(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }


}