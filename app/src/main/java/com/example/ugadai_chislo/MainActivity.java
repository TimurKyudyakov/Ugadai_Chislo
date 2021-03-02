package com.example.ugadai_chislo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    EditText etInput;
    Button bControl;
    int guess;
    boolean gameFinished;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = (TextView)findViewById(R.id.textView);
        etInput = (EditText)findViewById(R.id.editTextTextPersonName);
        bControl = (Button)findViewById(R.id.button);


        guess = (int)(Math.random()*100);
        gameFinished = false;

    }

    public void onClick(View v){

    }
}