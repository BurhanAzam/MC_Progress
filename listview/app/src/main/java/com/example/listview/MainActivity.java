package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> friendArrayList;
    EditText editText;
    Button btn;
    ListView listview;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.myListView);
        btn = findViewById(R.id.btn);
        editText=findViewById(R.id.editText);


        friendArrayList=new  ArrayList<String>();
        friendArrayList.add("Ali");
        friendArrayList.add("Babar");
        friendArrayList.add("Usman");
        friendArrayList.add("Burhan");

        arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendArrayList);

        listview.setAdapter(arrayAdapter);

        listview.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             Log.d("You clicked",friendArrayList.get(i));

             Intent intent=new Intent(MainActivity.this,MainActivity2.class);
             intent.putExtra("Friend Name",friendArrayList.get(i));
             startActivity(intent);
            }
        });


    }
}

    public void AddFriend(View view) {
        friendArrayList.add(editText.getText().toString());
       arrayAdapter.notifyDataSetChanged();
        Collections.sort(friendArrayList);

    }

}