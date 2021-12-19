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

import com.pbp.uas_pchop.db.DataKitchen;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.rv.RVKitchenAdapter;
import com.pbp.uas_pchop.databinding.FragmentKitchenBinding;

import java.util.List;

public class KitchenFrag extends Fragment {
    private FragmentKitchenBinding binding;
    private List<DataKitchen> dataKitchenList;
    private RecyclerView recyclerView;
    private RVKitchenAdapter rvKitchenAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kitchen, container, false);
        recyclerView = binding.getRoot().findViewById(R.id.rv_kitchen);
//        rvKitchenAdapter = new RVKitchenAdapter(new ArrayList<>(), listener);
//        layoutManager = new LinearLayoutManager(getApplicationContext());

//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(rvKitchenAdapter);

        return binding.getRoot();
    }
}