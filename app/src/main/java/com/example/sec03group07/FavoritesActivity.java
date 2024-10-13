package com.example.sec03group07;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {
    private ListView listViewFavorites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        listViewFavorites = findViewById(R.id.listViewFavorites);

        // Sample favorite recipes with descriptions
        ArrayList<String> favoriteRecipes = new ArrayList<>();
        favoriteRecipes.add("1. Chicken Biryani\n   A flavorful rice dish made with marinated chicken.");
        favoriteRecipes.add("2. Paneer Butter Masala\n   Creamy paneer dish cooked in rich tomato gravy.");
        favoriteRecipes.add("3. Pancakes\n   Fluffy pancakes served with maple syrup.");
        favoriteRecipes.add("4. Chocolate Cake\n   Rich and moist chocolate cake with frosting.");

        // Create an adapter to display the favorite recipes
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, favoriteRecipes);
        listViewFavorites.setAdapter(adapter);
    }
}
