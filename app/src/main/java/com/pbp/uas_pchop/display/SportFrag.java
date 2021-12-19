package com.pbp.uas_pchop.display;

import static com.mapbox.mapboxsdk.Mapbox.getApplicationContext;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pbp.uas_pchop.db.DataSport;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.rv.RVSportAdapter;
import com.pbp.uas_pchop.databinding.FragmentSportBinding;

import java.util.ArrayList;
import java.util.List;

public class SportFrag extends Fragment {
    private FragmentSportBinding binding;
    private List<DataSport> dataSportList;
    private RecyclerView recyclerView;
    private RVSportAdapter rvSportAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sport, container, false);
        recyclerView = binding.getRoot().findViewById(R.id.rv_sport);
//        rvSportAdapter = new RVSportAdapter(new ArrayList<>(), listener);
//        layoutManager = new LinearLayoutManager(getApplicationContext());
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(rvSportAdapter);

        return binding.getRoot();
    }
}