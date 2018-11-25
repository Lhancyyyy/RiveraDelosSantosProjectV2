package com.example.lhanceadrianjrivera.riveradelossantosproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TriviaBreathing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia_breathing);
    }

    public void onClickback (View v) {
        Intent i = new Intent(this, HealthActivity.class);
        startActivity(i);
    }
}
