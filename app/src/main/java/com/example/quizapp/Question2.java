package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;


public class Question2 extends AppCompatActivity {
    Button bt1,bt2,bt3;
    TextView tx1;
    RadioGroup rg1;
    RadioButton rb1,rb2,rb3,rb4;
    private int marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        tx1=findViewById(R.id.tx1);
        rg1=findViewById(R.id.rg1);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer mark= new StringBuffer();
                int selectedid;
                marks=0;
                selectedid = rg1.getCheckedRadioButtonId();
                if(rb2.getId() == selectedid) {
                    marks++;
                    rb2.setBackgroundColor(Color.parseColor("#85e085"));
                    rb1.setBackgroundColor(Color.parseColor("#ff8080"));
                    rb3.setBackgroundColor(Color.parseColor("#ff8080"));
                    rb4.setBackgroundColor(Color.parseColor("#ff8080"));
                    Toast toast =
                            Toast.makeText(Question2.this,"Correct answer",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    rb2.setBackgroundColor(Color.parseColor("#85e085"));
                    rb1.setBackgroundColor(Color.parseColor("#ff8080"));
                    rb3.setBackgroundColor(Color.parseColor("#ff8080"));
                    rb4.setBackgroundColor(Color.parseColor("#ff8080"));
                    Toast toast =
                            Toast.makeText(Question2.this,"Wrong answer",Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marks--;
                rg1.clearCheck();
                rb1.setBackgroundColor(Color.parseColor("#B8EFD9"));
                rb2.setBackgroundColor(Color.parseColor("#B8EFD9"));
                rb3.setBackgroundColor(Color.parseColor("#B8EFD9"));
                rb4.setBackgroundColor(Color.parseColor("#B8EFD9"));
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent2 = new Intent(Question2.this,Question3.class);
                intent2.putExtra("marks","Correct Answers ="+marks);
                startActivity(intent2);
            }
        });
    }
}