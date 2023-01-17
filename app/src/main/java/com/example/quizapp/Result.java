package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView result;
    Button done;
    private int mark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        done=findViewById(R.id.done);
        result=findViewById(R.id.tv);

        String mark=getIntent().getStringExtra("marks");
        result.setText(mark);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent = new Intent(Result.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}