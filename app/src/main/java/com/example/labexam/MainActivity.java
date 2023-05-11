package com.example.labexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn,log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(v->{
            setContentView(R.layout.activity_main);
            log = findViewById(R.id.login);
            log.setOnClickListener(vi->
            {
                setContentView(R.layout.planning_trip);
            });
             });











    }
}