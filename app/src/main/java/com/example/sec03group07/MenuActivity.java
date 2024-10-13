package com.example.sec03group07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button nonVegButton = findViewById(R.id.button_non_veg);
        Button vegButton = findViewById(R.id.button_veg);
        Button breakfastButton = findViewById(R.id.button_breakfast);
        Button dessertsButton = findViewById(R.id.button_desserts);
        Button drinksButton = findViewById(R.id.button_drinks);

        nonVegButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, NonVegActivity.class);
            startActivity(intent);
        });

        vegButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, VegActivity.class);
            startActivity(intent);
        });

        breakfastButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, BreakfastActivity.class);
            startActivity(intent);
        });

        dessertsButton.setOnClickListener(v -> {
            // Navigate to Desserts recipes activity
            // startActivity(new Intent(MenuActivity.this, DessertsActivity.class));
        });

        drinksButton.setOnClickListener(v -> {
            // Navigate to Drinks recipes activity
            // startActivity(new Intent(MenuActivity.this, DrinksActivity.class));
        });
    }
}