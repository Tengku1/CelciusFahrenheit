package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button profile = (Button) findViewById(R.id.profile);
        Button convert = (Button) findViewById(R.id.convert);
        convert.setOnClickListener(this::convertPage);
        profile.setOnClickListener(this::profilePage);
    }
    private void convertPage(View v) {
        Intent i = new Intent(MainActivity.this, ConvertActivity.class);
        startActivity(i);
    }
    private void profilePage(View v) {
        Intent i = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(i);
    }
    public void closeThisActivity(View v) {
        finish();
    }
}