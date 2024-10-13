package com.example.sec03group07;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BreakfastActivity extends AppCompatActivity {
    private ListView listViewRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        listViewRecipes = findViewById(R.id.listViewRecipes);

        // Sample breakfast recipes with descriptions
        ArrayList<String> recipes = new ArrayList<>();
        recipes.add("1. Pancakes\n   Fluffy pancakes served with maple syrup and fresh fruits.");
        recipes.add("2. Oatmeal\n   Warm oatmeal topped with honey and nuts.");
        recipes.add("3. Scrambled Eggs\n   Creamy scrambled eggs served with toast.");
        recipes.add("4. Smoothie Bowl\n   A smoothie topped with granola and fresh berries.");
        recipes.add("5. Breakfast Burrito\n   Tortilla filled with eggs, cheese, and veggies.");
        recipes.add("6. French Toast\n   Bread soaked in egg and milk, pan-fried and served with syrup.");
        recipes.add("7. Avocado Toast\n   Toast topped with smashed avocado, salt, and pepper.");
        recipes.add("8. Breakfast Quinoa\n   Quinoa cooked with almond milk, topped with fruits and nuts.");

        // Create an adapter to display the recipe names and descriptions
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipes);
        listViewRecipes.setAdapter(adapter);
    }
}
