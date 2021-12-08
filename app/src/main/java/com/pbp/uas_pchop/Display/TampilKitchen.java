package com.pbp.uas_pchop.Display;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pbp.uas_pchop.DB.DaftarClothes;
import com.pbp.uas_pchop.DB.DaftarKitchen;
import com.pbp.uas_pchop.DB.DataClothes;
import com.pbp.uas_pchop.DB.DataKitchen;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.RV.RVClothesAdapter;
import com.pbp.uas_pchop.RV.RVKitchenAdapter;

import java.util.ArrayList;

public class TampilKitchen extends AppCompatActivity {
    ArrayList<DataKitchen> DataKitchenList;
    private RecyclerView recyclerView;
    private RVKitchenAdapter rvKitchenAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_kitchen);

        DataKitchenList = new DaftarKitchen().DataKitchen;
        recyclerView = findViewById(R.id.rv_kitchen);
        rvKitchenAdapter = new RVKitchenAdapter(this, DataKitchenList);
        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvKitchenAdapter);
    }
}