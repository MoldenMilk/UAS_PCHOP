package com.pbp.uas_pchop.Display;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pbp.uas_pchop.DB.DaftarClothes;
import com.pbp.uas_pchop.DB.DataClothes;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.RV.RVClothesAdapter;
import com.pbp.uas_pchop.RV.RVSportAdapter;

import java.util.ArrayList;

public class TampilClothes extends AppCompatActivity {
    ArrayList<DataClothes> DataClothesList;
    private RecyclerView recyclerView;
    private RVClothesAdapter rvClothesAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_clothes);

        DataClothesList = new DaftarClothes().DataClothes;
        recyclerView = findViewById(R.id.rv_clothes);
        rvClothesAdapter = new RVClothesAdapter(this, DataClothesList);
        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvClothesAdapter);
    }
}