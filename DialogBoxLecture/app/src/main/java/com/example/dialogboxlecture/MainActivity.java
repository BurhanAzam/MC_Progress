package com.example.dialogboxlecture;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

    }

    public void show_dialog(View view)
    {
       final AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
       View mview = getLayoutInflater().inflate(R.layout.customize_dialog_box,null);
       final EditText txt_inputText=(EditText)mview.findViewById(R.id.editText);
       Button btn_cancel=(Button)mview.findViewById(R.id.cancel_button);
        Button btn_ok=(Button)mview.findViewById(R.id.ok_btn;
        alert.setView(mview);

        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}