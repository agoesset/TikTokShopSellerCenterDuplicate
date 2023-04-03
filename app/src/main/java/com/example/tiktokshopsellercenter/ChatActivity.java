package com.example.tiktokshopsellercenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    public ImageView toBeranda,toPengaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        toBeranda = findViewById(R.id.imageView6);
        toPengaturan = findViewById(R.id.imageView11);


        toBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),BerandaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        toPengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PengaturanActivity.class);
                startActivity(intent);
            }
        });

    }
}