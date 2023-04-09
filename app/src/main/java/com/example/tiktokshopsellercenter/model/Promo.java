package com.example.tiktokshopsellercenter.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Promo {
    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String judul;

    @SerializedName("subTitle")
    private String dess;

    @SerializedName("image")
    private String gambar;

    @SerializedName("images")
    private List<String> gambarList;

    public Promo(String id, String title, String subTitle, String image) {
        this.id = id;
        this.judul = title;
        this.dess = subTitle;
        this.gambar = image;
    }

    public List<String> getGambarList() {
        return gambarList;
    }

    public void setGambarList(List<String> gambarList) {
        this.gambarList = gambarList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDess() {
        return dess;
    }

    public void setDess(String dess) {
        this.dess = dess;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public void add(Promo promo) {
    }
}
