package com.example.practos2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail); // Убедитесь, что вы создали layout для этой активити

        TextView nameTextView = findViewById(R.id.detail_name);
        TextView capitalTextView = findViewById(R.id.detail_capital);
        ImageView flagImageView = findViewById(R.id.detail_flag);

        // Получите данные из Intent
        String name = getIntent().getStringExtra("name");
        String capital = getIntent().getStringExtra("capital");
        int flagResource = getIntent().getIntExtra("flag", 0);

        // Установите данные в представления
        nameTextView.setText(name);
        capitalTextView.setText(capital);
        flagImageView.setImageResource(flagResource);
    }
}