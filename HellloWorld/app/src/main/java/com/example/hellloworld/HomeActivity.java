package com.example.hellloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button bahasaBtn = findViewById(R.id.bahasaBtn);
        Button matematikaBtn = findViewById(R.id.matematikaBtn);
        Button fisikaBtn = findViewById(R.id.fisikaBtn);
        Button kimiaBtn = findViewById(R.id.kimiaBtn);

        bahasaBtn.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, Bahasa.class)));
        matematikaBtn.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, Matematika.class)));
        fisikaBtn.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, Fisika.class)));
        kimiaBtn.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, Kimia.class)));


    }
}