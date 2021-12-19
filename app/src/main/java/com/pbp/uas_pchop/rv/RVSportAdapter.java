package com.pbp.uas_pchop.rv;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pbp.uas_pchop.db.DataSport;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.databinding.ActivityRvsportAdapterBinding;

import java.util.List;

public class RVSportAdapter extends RecyclerView.Adapter<RVSportAdapter.viewHolder> {
    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ActivityRvsportAdapterBinding binding;
        public viewHolder(@NonNull ActivityRvsportAdapterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        @Override
        public void onClick(View view) {
        }
    }
    private Context context;
    private List<DataSport> dataSport;
    ActivityRvsportAdapterBinding binding;

    public RVSportAdapter(Context context, List<DataSport> dataSport) {
        this.context = context;
        this.dataSport = dataSport;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.activity_rvsport_adapter, parent, false);
        return new viewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int position) {
        final DataSport sprt = dataSport.get(position);
        binding.setSprt(sprt);
    }
    @Override
    public int getItemCount() {
        return dataSport.size();
    }
}