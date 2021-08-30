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
import com.example.android34hw7.adapters.AdapterHome;
import com.example.android34hw7.databinding.FragmentHomeBinding;
import com.example.android34hw7.models.ModelHome;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private AdapterHome adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new AdapterHome();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter.addItems(createList());
        binding.rvHome.setAdapter(adapter);

    }

    private ArrayList<ModelHome> createList() {
        ArrayList<ModelHome> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(new ModelHome(R.drawable.image_home, "joshua_l The game in Japan was amazing and I want to share some photos", "September 7"));
        }
        return list;
    }

    @Override
    public void onStart() {
        super.onStart();
        MainActivity.getInstance().showCamera();
        MainActivity.getInstance().setToolbarText("Instagram");
    }
}