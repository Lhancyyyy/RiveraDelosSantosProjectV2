package com.example.lhanceadrianjrivera.riveradelossantosproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TriviaExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia_exercise);
    }

    public void Back (View v) {
        Intent i = new Intent(this, HealthActivity.class);
        startActivity(i);
    }
}
