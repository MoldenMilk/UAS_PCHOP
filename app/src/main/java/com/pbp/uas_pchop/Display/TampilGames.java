package com.pbp.uas_pchop.Display;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pbp.uas_pchop.DB.DaftarGames;
import com.pbp.uas_pchop.DB.DataGames;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.RV.RVGamesAdapter;

import java.util.ArrayList;

public class TampilGames extends AppCompatActivity {
    ArrayList<DataGames> DataGamesList;
    private RecyclerView recyclerView;
    private RVGamesAdapter rvGamesAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_games);

        DataGamesList = new DaftarGames().DataGames;
        recyclerView = findViewById(R.id.rv_games);
        rvGamesAdapter = new RVGamesAdapter(this, DataGamesList);
        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvGamesAdapter);
    }
}