package com.example.android34hw7.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android34hw7.databinding.ItemFollowingBinding;
import com.example.android34hw7.models.ModelFollowing;

import java.util.ArrayList;

public class AdapterFollowing extends RecyclerView.Adapter<AdapterFollowing.ViewHolder> {
    private ArrayList<ModelFollowing> list = new ArrayList<>();

    public void addItems(ArrayList<ModelFollowing> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public AdapterFollowing.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(ItemFollowingBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(AdapterFollowing.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemFollowingBinding binding;

        public ViewHolder(@NonNull ItemFollowingBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(ModelFollowing modelFollowing) {
            binding.ivFollower.setImageResource(modelFollowing.getImageFollower());
            binding.ivLikedPhoto.setImageResource(modelFollowing.getLikedPhoto());
            binding.tvFollower.setText(modelFollowing.getTvFollower());
        }
    }
}
