package com.example.cst2335_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button soccerButton = findViewById(R.id.soccerButton);



        //takes user to soccer highlights page
        soccerButton.setOnClickListener(btn -> {
            Intent goToSoccer = new Intent(MainActivity.this, SoccerActivity.class);
            startActivity(goToSoccer);
        });



    }
}