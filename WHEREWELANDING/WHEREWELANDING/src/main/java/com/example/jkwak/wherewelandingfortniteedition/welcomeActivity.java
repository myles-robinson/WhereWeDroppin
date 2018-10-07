package com.example.jkwak.wherewelandingfortniteedition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class welcomeActivity extends AppCompatActivity {

    ImageView fortniteBtn, blackoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_welcome);

        fortniteBtn = findViewById(R.id.imageView3);
        blackoutBtn = findViewById(R.id.imageView5);

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
