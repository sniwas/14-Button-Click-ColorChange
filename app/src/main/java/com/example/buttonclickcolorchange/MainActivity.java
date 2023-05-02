package com.example.buttonclickcolorchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button red,yellow,green;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red=findViewById(R.id.red);


        yellow=findViewById(R.id.yellow);
        green=findViewById(R.id.green);
        final ConstraintLayout cl=findViewById(R.id.constraintlayout);
        red.setOnClickListener(V ->{
            cl.setBackgroundResource(R.color.red);
        });
        green.setOnClickListener(V ->{
            cl.setBackgroundResource(R.color.green);
        });
        yellow.setOnClickListener(V ->{
            cl.setBackgroundResource(R.color.yellow);
        });
    }
}