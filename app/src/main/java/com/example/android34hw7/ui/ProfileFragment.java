package com.example.android34hw7.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android34hw7.R;
import com.example.android34hw7.adapters.ViewPagerAdapter;
import com.example.android34hw7.databinding.FragmentPostBinding;
import com.example.android34hw7.databinding.FragmentProfileBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import org.jetbrains.annotations.NotNull;


public class ProfileFragment extends Fragment {
    private ViewPagerAdapter adapter;
    private FragmentProfileBinding binding;
    private int[] icons = {
            R.drawable.ic_grid_icon, R.drawable.ic_tags_icon__1_
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.getInstance().hideCamera();
        MainActivity.getInstance().setToolbarText("jacob_w");
        adapter = new ViewPagerAdapter(getActivity());
        adapter.setList(new PostFragment());
        adapter.setList(new MarkedFragment());
        binding.viewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.tab, binding.viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(TabLayout.Tab tab, int position) {
                tab.setIcon(icons[position]);
            }
        }).attach();
    }

   /* @Override
    public void onStop() {
        super.onStop();
        MainActivity.getInstance().showCamera();
        MainActivity.getInstance().setToolbarText("Instagram");
    }*/
}