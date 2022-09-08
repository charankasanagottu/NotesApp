package com.example.ecofarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ecofarm.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    private Button btnChange;
    private EditText AcceditText,pheditText,badeditText;
    private TextView AccTextview,PhTextView,BadTextView;

    private ActivityProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboarduser);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {onBackPressed();
            }
        });

        btnChange = (Button)findViewById(R.id.DisplayBtn);
        AcceditText = (EditText)findViewById(R.id.Account);
        pheditText = (EditText) findViewById(R.id.Phone);
        badeditText = (EditText) findViewById(R.id.Badge);

        AccTextview = (TextView) findViewById(R.id.tvAcchangedtext);
        PhTextView = (TextView) findViewById(R.id.tvPhchangedtext);
        BadTextView = (TextView) findViewById(R.id.tvBadchangedtext);


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AccTextview.setText(AcceditText.getText());
                PhTextView.setText(pheditText.getText());
                BadTextView.setText(badeditText.getText());
            }
        });

    }
}