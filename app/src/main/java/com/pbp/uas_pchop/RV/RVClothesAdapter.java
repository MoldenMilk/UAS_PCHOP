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
import com.pbp.uas_pchop.DB.DataSport;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.databinding.ActivityRvclothesAdapterBinding;
import com.pbp.uas_pchop.databinding.ActivityRvsportAdapterBinding;

import java.util.List;

public class RVClothesAdapter extends RecyclerView.Adapter<RVClothesAdapter.viewHolder> {
    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ActivityRvclothesAdapterBinding binding;
        public viewHolder(@NonNull ActivityRvclothesAdapterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        @Override
        public void onClick(View view) {
        }
    }
    private Context context;
    private List<DataClothes> dataClothes;
    ActivityRvclothesAdapterBinding binding;

    public RVClothesAdapter(Context context, List<DataClothes> dataClothes) {
        this.context = context;
        this.dataClothes = dataClothes;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.activity_rvclothes_adapter, parent, false);
        return new viewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int position) {
        final DataClothes clts = dataClothes.get(position);
        binding.setClts(clts);
    }
    @Override
    public int getItemCount() {
        return dataClothes.size();
    }
}