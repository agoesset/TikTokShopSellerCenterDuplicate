package com.example.tiktokshopsellercenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PengaturanActivity extends AppCompatActivity {

    public ImageView toBeranda,toChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);

        toBeranda = findViewById(R.id.imageView6);
        toChat = findViewById(R.id.imageView10);
        //coba git

        toBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),BerandaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        toChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ChatActivity.class);
                startActivity(intent);
            }
        });

    }
}