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
        Button favoritesButton = findViewById(R.id.button_favorites);
        Button shoppingButton = findViewById(R.id.button_shopping);

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
            Intent intent = new Intent(MenuActivity.this, DessertsActivity.class);
            startActivity(intent);
        });

        drinksButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DrinksActivity.class);
            startActivity(intent);
        });

        favoritesButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, FavoritesActivity.class);
            startActivity(intent);
        });

        shoppingButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ShoppingActivity.class);
            startActivity(intent);
        });
    }
}
