package com.example.srishty.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.education);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, education.class);
                startActivity(i);

            }
                    });



        final Button button2 = (Button) findViewById(R.id.work);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, work_experience.class);
                startActivity(i);

            }
        });

            final ImageButton ib  = (ImageButton) findViewById(R.id.picture);
            ib.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i=new Intent(MainActivity.this, profile.class);
                    startActivity(i);

                }
          });



        }}

