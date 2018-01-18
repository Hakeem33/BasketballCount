package com.example.android.basketballcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    int scoreForA =0;
    int scoreForB =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamAScore(0);
        displayTeamBScore(0);
    }

    // assigning value for the buttons in activity_main

    public void button3a(View view){
        scoreForA=scoreForA+3;
        displayTeamAScore(scoreForA);
    }
    public void button2a(View view){
        scoreForA=scoreForA+2;
        displayTeamAScore(scoreForA);
    }
    public void button1a(View view){
        scoreForA=scoreForA+1;
        displayTeamAScore((scoreForA));
    }

    public void button3b(View view){
        scoreForB=scoreForB+3;
        displayTeamBScore(scoreForB);
    }
    public void button2b(View view) {
        scoreForB=scoreForB+2;
        displayTeamBScore(scoreForB);
    }
    public void button1b(View view){
        scoreForB=scoreForB+1;
        displayTeamBScore(scoreForB);
    }
    public void buttonReset(View view){
        scoreForA = 0;
        displayTeamAScore(scoreForA);
        scoreForB = 0;
        displayTeamBScore(scoreForB);
    }
    // defining method name
    public void displayTeamAScore(int scoreA){
        TextView textViewA = (TextView) findViewById(R.id.scoreForA);
        textViewA.setText(String.valueOf(scoreA));
    }

    public void displayTeamBScore(int scoreB){
        TextView textViewB = (TextView) findViewById(R.id.scoreForB);
        textViewB.setText(String.valueOf(scoreForB));
    }



}
