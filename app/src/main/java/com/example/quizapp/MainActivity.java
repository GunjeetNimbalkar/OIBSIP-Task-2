package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Button1;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = (Button) findViewById(R.id.btn1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity.this,Question1.class);
                startActivity(intent);
            }
        });
    }
}