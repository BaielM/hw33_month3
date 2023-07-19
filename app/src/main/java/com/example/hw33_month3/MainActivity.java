package com.example.hw33_month3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_view;
    private ArrayList<String> sportList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            recycler_view = findViewById(R.id.rv_sports);
            loadData();
        ShopAdapter adapter = new ShopAdapter(sportList);
        recycler_view.setAdapter(adapter);
        }

        private void loadData() {
            sportList.add("коньки");
            sportList.add("лыжи");
            sportList.add("теннис");
            sportList.add("однокасание");
            sportList.add("баскетбол");
            sportList.add("Воллейбол");
            sportList.add("футбол");
            sportList.add("амФутболл");
            sportList.add("бейсбол");
            sportList.add("крикет");
            sportList.add("ещеодин");
            sportList.add("футбол");

        }
    }