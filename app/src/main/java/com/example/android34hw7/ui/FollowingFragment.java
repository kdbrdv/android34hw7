package com.example.android34hw7.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.android34hw7.R;
import com.example.android34hw7.adapters.AdapterFollowing;
import com.example.android34hw7.databinding.FragmentFollowingBinding;
import com.example.android34hw7.models.ModelFollowing;

import java.util.ArrayList;


public class FollowingFragment extends Fragment {

    private FragmentFollowingBinding binding;
    private AdapterFollowing adapterFollowing;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapterFollowing = new AdapterFollowing();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFollowingBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rvFollowing.setAdapter(adapterFollowing);
        MainActivity.getInstance().hideCamera();
        MainActivity.getInstance().setToolbarText("Following");
        /*binding.rvFollowing.addItemDecoration(new DividerItemDecoration(requireContext(),
                DividerItemDecoration.VERTICAL));*/
        adapterFollowing.addItems(initList());
    }

    private ArrayList<ModelFollowing> initList() {
        ArrayList<ModelFollowing> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(new ModelFollowing(R.drawable.img_follower, R.drawable.liked_photo, R.string.tv_liked_photo));
        }
        return list;
    }
   /* @Override
    public void onStop() {
        super.onStop();
        MainActivity.getInstance().showCamera();
        MainActivity.getInstance().setToolbarText("Instagram");
    }*/
}