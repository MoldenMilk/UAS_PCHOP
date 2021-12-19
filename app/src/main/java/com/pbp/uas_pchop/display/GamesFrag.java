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

import com.pbp.uas_pchop.db.DataGames;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.rv.RVGamesAdapter;
import com.pbp.uas_pchop.databinding.FragmentGamesBinding;

import java.util.List;

public class GamesFrag extends Fragment {
    private FragmentGamesBinding binding;
    private List<DataGames> dataGamesList;
    private RecyclerView recyclerView;
    private RVGamesAdapter rvGamesAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_games, container, false);
//        recyclerView = binding.getRoot().findViewById(R.id.rv_games);
//        rvGamesAdapter = new RVGamesAdapter(new ArrayList<>(), listener);
//        layoutManager = new LinearLayoutManager(getApplicationContext());

//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(rvGamesAdapter);

        return binding.getRoot();
    }
}