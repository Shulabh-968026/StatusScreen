package com.example.statusscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowStories(View view) {
        // on below line we are opening a new activity using intent.
        Intent i = new Intent(MainActivity.this, StoriesActivity.class);
        startActivity(i);
    }
}