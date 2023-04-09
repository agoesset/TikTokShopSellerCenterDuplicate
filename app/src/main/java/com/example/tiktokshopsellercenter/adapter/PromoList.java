package com.example.tiktokshopsellercenter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tiktokshopsellercenter.R;
import com.example.tiktokshopsellercenter.model.Promo;

import java.util.List;

public class PromoList extends RecyclerView.Adapter<PromoList.CustomViewHolder> {

    private List<Promo> dataPromo;
    private Context context;

    public PromoList(List<Promo> dataPromo, Context context) {
        this.dataPromo = dataPromo;
        this.context = context;
    }

    @NonNull
    @Override
    public PromoList.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.txtJudul.setText(dataPromo.get(position).getJudul());
        holder.txtDess.setText(dataPromo.get(position).getDess());
        Glide.with(context).load(dataPromo.get(position).getGambar()).into(holder.imgGambar);
    }

    @Override
    public int getItemCount() {
        return dataPromo.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        public final View mView;

        TextView txtJudul, txtDess;
        ImageView imgGambar;


        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtJudul = mView.findViewById(R.id.judul);
            txtDess = mView.findViewById(R.id.dess);
            imgGambar = mView.findViewById(R.id.gambar);
        }
    }

}
