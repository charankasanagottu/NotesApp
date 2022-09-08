package com.example.ecofarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ecofarm.databinding.ActivityNavigationBinding;

public class NavigationActivity extends AppCompatActivity {

    private ActivityNavigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}