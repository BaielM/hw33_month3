package com.example.hw3_month3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw33_month3.R;

public class SportsViewHolder extends RecyclerView.ViewHolder{
    private TextView tvSport;

    public SportsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvSport = itemView.findViewById(R.id.tv_sport);
    }
    public void bind(String sport){
        tvSport.setText(sport);
    }
}
