package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Button button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView textView = (TextView) findViewById(R.id.test);
                textView.setText("Test"); //set text for text view
            }
        });
    }
}
