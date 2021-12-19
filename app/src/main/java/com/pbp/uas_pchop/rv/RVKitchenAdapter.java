package com.pbp.uas_pchop.rv;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pbp.uas_pchop.db.DataKitchen;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.databinding.ActivityRvkitchenAdapterBinding;

import java.util.List;

public class RVKitchenAdapter extends RecyclerView.Adapter<RVKitchenAdapter.viewHolder> {
    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ActivityRvkitchenAdapterBinding binding;
        public viewHolder(@NonNull ActivityRvkitchenAdapterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        @Override
        public void onClick(View view) {
        }
    }
    private Context context;
    private List<DataKitchen> dataKitchen;
    ActivityRvkitchenAdapterBinding binding;

    public RVKitchenAdapter(Context context, List<DataKitchen> dataKitchen) {
        this.context = context;
        this.dataKitchen = dataKitchen;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.activity_rvkitchen_adapter, parent, false);
        return new viewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int position) {
        final DataKitchen ktcn = dataKitchen.get(position);
        binding.setKtcn(ktcn);
    }
    @Override
    public int getItemCount() {
        return dataKitchen.size();
    }
}