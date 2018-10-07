package com.example.jkwak.wherewelandingfortniteedition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomeActivity extends AppCompatActivity {

    Button fortniteBtn, blackoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_welcome);
/*
        fortniteBtn = findViewById(R.id.fortiteButton);
        blackoutBtn = findViewById(R.id.blackoutButton);
*/
    }

    public void fortniteClick(View view)
    {
        Intent intent = new Intent(welcomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void blackoutClick(View view)
    {
        Intent intent = new Intent(welcomeActivity.this, blackoutActivity.class);
        startActivity(intent);
    }
}
