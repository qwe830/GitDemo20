package com.example.gitdemo20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int number =0;
    private Button mButtonAdd;
    private TextView mtextview;
    private Button mButtonSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAdd = findViewById(R.id.buttonAdd);
        mtextview = findViewById(R.id.textview);
        mButtonSub = findViewById(R.id.buttonSub);

        mtextview.setText(String.valueOf(number));
        mButtonAdd.setOnClickListener(v ->{
        mtextview.setText(String.valueOf(++number));});
        mButtonSub.setOnClickListener(v ->{
            mtextview.setText(String.valueOf(--number));});
    }
}