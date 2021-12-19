package com.pbp.uas_pchop.Display;

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

import com.pbp.uas_pchop.DB.DataClothes;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.RV.RVClothesAdapter;
import com.pbp.uas_pchop.databinding.FragmentClothesBinding;

import java.util.ArrayList;
import java.util.List;

public class ClothesFrag extends Fragment {
    private FragmentClothesBinding binding;
    private List<DataClothes> dataClothesList;
    private RecyclerView recyclerView;
    private RVClothesAdapter rvClothesAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_clothes, container, false);
        recyclerView = binding.getRoot().findViewById(R.id.rv_clothes);
//        rvClothesAdapter = new RVClothesAdapter(new ArrayList<>(), listener);
        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvClothesAdapter);

        return binding.getRoot();
    }
}