package com.example.leaderboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class SubmissionActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission);

        getSupportActionBar().setTitle("submission");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }




}