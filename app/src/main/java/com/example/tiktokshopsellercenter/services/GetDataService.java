package com.example.tiktokshopsellercenter.services;

import com.example.tiktokshopsellercenter.model.Promo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/promosi.json")
    public Call<List<Promo>> getPromosis();
}
