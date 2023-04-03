package com.example.tiktokshopsellercenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BerandaActivity extends AppCompatActivity {

    public Button btnTambah;
    public ImageView toChat,toPengaturan;
    public TextView toPromosi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        btnTambah = findViewById(R.id.button);
        toChat = findViewById(R.id.imageView10);
        toPengaturan = findViewById(R.id.imageView11);
        toPromosi = findViewById(R.id.promosi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TambahActivity.class);
                startActivity(intent);
                finish();
            }
        });

        toChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ChatActivity.class);
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

        toPromosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PromosiActivity.class);
                startActivity(intent);
            }
        });
    }
}