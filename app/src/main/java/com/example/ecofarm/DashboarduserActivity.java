package com.example.ecofarm;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecofarm.databinding.ActivityDashboarduserBinding;
import com.google.firebase.auth.FirebaseAuth;
//
//import io.realm.Realm;
//import io.realm.RealmChangeListener;
//import io.realm.RealmResults;

public class DashboarduserActivity extends AppCompatActivity {

    private ProgressDialog progressDialog;
    private ActivityDashboarduserBinding binding;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboarduser);
        binding = ActivityDashboarduserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //handle click , logout
        binding.logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(DashboarduserActivity.this,LoginActivity.class));
                onBackPressed();
            }
        });

        /*handle click , open profile */
        binding.prfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboarduserActivity.this, ProfileActivity.class));
            }
        });

        /*handle click button to check weather details*/
        binding.imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboarduserActivity.this, WeatherMainActivity.class));
            }
        });

        binding.SaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvSavednotes.setText(binding.Notes.getText());
            }
        });


    }
}