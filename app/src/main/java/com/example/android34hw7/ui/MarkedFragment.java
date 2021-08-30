package com.example.android34hw7.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.android34hw7.R;
import com.example.android34hw7.adapters.PostAdapter;
import com.example.android34hw7.databinding.FragmentMarkedBinding;
import com.example.android34hw7.databinding.FragmentPostBinding;

import java.util.ArrayList;

public class MarkedFragment extends Fragment {
    private FragmentMarkedBinding binding;
    private PostAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new PostAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMarkedBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rvMarked.setAdapter(adapter);
        adapter.setList(createList());
    }

    private ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(R.drawable.picture2);
        }
        return list;
    }
}