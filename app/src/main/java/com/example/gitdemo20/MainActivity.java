package com.example.gitdemo20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String NUMBER = "number";
    private int number = 0;
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

       number = savedInstanceState !=null ? savedInstanceState.getInt(NUMBER):0;


        mtextview.setText(String.valueOf(number));
        mButtonAdd.setOnClickListener(v -> {
            mtextview.setText(String.valueOf(++number));
        });
        mButtonSub.setOnClickListener(v -> {
            mtextview.setText(String.valueOf(--number));
        });

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(NUMBER,number);
    }
}