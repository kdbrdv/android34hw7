package com.example.android34hw7.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android34hw7.databinding.ItemPostBinding;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private ArrayList<Integer> list = new ArrayList<>();

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(ItemPostBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemPostBinding binding;

        public ViewHolder(@NonNull ItemPostBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Integer integer) {
            binding.imgPost.setImageResource(integer);
        }
    }
}
