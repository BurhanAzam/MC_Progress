package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView2;
    int count=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        Log.d("ActivityLifeCycle", "onCreateCalled ");
        if(savedInstanceState!=null)
        {
            count=savedInstanceState.getInt("Value");
            textView2.setText(String.valueOf(count));
        }

    }
    public void Increment(View view){
        count=Integer.parseInt(textView2.getText().toString());
        count++;
        textView2.setText(String.valueOf(count));

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);

    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d("ActivityLifeCycle", "onStart ");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("ActivityLifeCycle", "onStop ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle", "onPause ");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d("ActivityLifeCycle", "onResume ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle", "onDestroy ");
    }

    public void MainActivity2(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void MainActivity3(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}