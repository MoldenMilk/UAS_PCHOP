package com.pbp.uas_pchop.RV;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pbp.uas_pchop.DB.DataClothes;
import com.pbp.uas_pchop.DB.DataGames;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.databinding.ActivityRvclothesAdapterBinding;
import com.pbp.uas_pchop.databinding.ActivityRvgamesAdapterBinding;

import java.util.List;

public class RVGamesAdapter extends RecyclerView.Adapter<RVGamesAdapter.viewHolder> {
    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ActivityRvgamesAdapterBinding binding;
        public viewHolder(@NonNull ActivityRvgamesAdapterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        @Override
        public void onClick(View view) {
        }
    }
    private Context context;
    private List<DataGames> dataGames;
    ActivityRvgamesAdapterBinding binding;

    public RVGamesAdapter(Context context, List<DataGames> dataGames) {
        this.context = context;
        this.dataGames = dataGames;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.activity_rvgames_adapter, parent, false);
        return new viewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int position) {
        final DataGames gms = dataGames.get(position);
        binding.setGms(gms);
    }
    @Override
    public int getItemCount() {
        return dataGames.size();
    }
}