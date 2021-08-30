    package com.example.android34hw7.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android34hw7.databinding.ItemHomeBinding;
import com.example.android34hw7.models.ModelHome;

import java.util.ArrayList;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {
    private ArrayList<ModelHome> list = new ArrayList<>();

    public void addItems(ArrayList<ModelHome> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @Override
    public AdapterHome.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,false));
    }

    @Override
    public void onBindViewHolder(AdapterHome.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemHomeBinding binding;

        public ViewHolder(@NonNull ItemHomeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(ModelHome modelHome) {
            binding.ivHome.setImageResource(modelHome.getImage());
            binding.tvDate.setText(modelHome.getDate());
            binding.tvDescription.setText(modelHome.getDescription());
        }
    }
}
