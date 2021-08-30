package com.example.android34hw7.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.android34hw7.R;
import com.example.android34hw7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private NavController navController;
    private ActivityMainBinding binding;
    private static MainActivity instance;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initNavController();
    }

    public void hideCamera() {
        binding.ivCamera.setVisibility(View.GONE);
    }

    public void showCamera() {
        binding.ivCamera.setVisibility(View.VISIBLE);
    }

    public void setToolbarText(String s) {
        binding.tvTitle.setText(s);
    }

    public static MainActivity getInstance() {
        return instance;
    }

    private void initNavController() {
        navController = Navigation.findNavController(this, R.id.fragment_Container);
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
    }
}
