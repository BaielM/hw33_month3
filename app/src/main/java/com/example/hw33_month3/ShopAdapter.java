package com.example.hw33_month3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_month3.SportsViewHolder;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<com.example.hw3_month3.SportsViewHolder> {

    private ArrayList<String> sportList;

    public ShopAdapter(ArrayList<String> shopList) {
        this.sportList = shopList;
    }


    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SportsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sport, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        holder.bind(sportList.get(position));
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }
}
