package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        }

        public void ShowWebsite(View view) {
        Uri uri = Uri.parse("https://www.pucit.edu.pk");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }




    public void Caller(View view) {
        Uri uri = Uri.parse("tel: +92333403333");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }
}