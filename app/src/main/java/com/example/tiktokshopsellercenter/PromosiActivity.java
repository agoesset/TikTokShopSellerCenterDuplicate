package com.example.tiktokshopsellercenter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tiktokshopsellercenter.adapter.PromoList;
import com.example.tiktokshopsellercenter.model.Promo;
import com.example.tiktokshopsellercenter.retrofit.RetrofitClientInstance;
import com.example.tiktokshopsellercenter.services.GetDataService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PromosiActivity extends AppCompatActivity {

    private PromoList adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;

    public ImageView backBeranda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promosi);

        progressDialog = new ProgressDialog(PromosiActivity.this);
        progressDialog.setMessage("Loading ...");
        progressDialog.show();

        GetDataService service = RetrofitClientInstance.getRetrofit().create(GetDataService.class);
        Call<List<Promo>> call = service.getPromosis();

        call.enqueue(new Callback<List<Promo>>() {
            @Override
            public void onResponse(Call<List<Promo>> call, Response<List<Promo>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<Promo>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(PromosiActivity.this, "" + t.toString(), Toast.LENGTH_SHORT).show();
                Log.d("error", t.toString());
            }
        });


        backBeranda = findViewById(R.id.imageView37);
        backBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeFragment.class);
                startActivity(intent);
            }
        });
    }

    private void generateDataList(List<Promo> body) {
        recyclerView = findViewById(R.id.custom_rec_view);
        adapter = new PromoList(body, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PromosiActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}