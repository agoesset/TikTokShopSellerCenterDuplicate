package com.example.tiktokshopsellercenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PromosiActivity extends AppCompatActivity {

    public ImageView backBeranda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promosi);

        backBeranda = findViewById(R.id.imageView37);

        backBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),BerandaActivity.class);
                startActivity(intent);
            }
        });

    }
}