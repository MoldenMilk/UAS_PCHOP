package com.pbp.uas_pchop.Display;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pbp.uas_pchop.DB.DaftarSport;
import com.pbp.uas_pchop.DB.DataSport;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.RV.RVSportAdapter;

import java.util.ArrayList;

public class TampilSport extends AppCompatActivity {
    ArrayList<DataSport> DataSportList;
    private RecyclerView recyclerView;
    private RVSportAdapter rvSportAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_sport);

        DataSportList = new DaftarSport().DataSport;
        recyclerView = findViewById(R.id.rv_sport);
        rvSportAdapter = new RVSportAdapter(this, DataSportList);
        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvSportAdapter);
    }
}