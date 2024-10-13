package com.example.sec03group07;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DrinksActivity extends AppCompatActivity {
    private ListView listViewRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        listViewRecipes = findViewById(R.id.listViewRecipes);

        // Sample drink recipes with descriptions
        ArrayList<String> recipes = new ArrayList<>();
        recipes.add("1. Mojito\n   Refreshing cocktail made with mint, lime, and rum.");
        recipes.add("2. Smoothie\n   Blended fruits and yogurt for a healthy drink.");
        recipes.add("3. Iced Coffee\n   Brewed coffee served chilled with milk and ice.");
        recipes.add("4. Lemonade\n   Freshly squeezed lemonade with a hint of mint.");
        recipes.add("5. Berry Fizz\n   Sparkling water infused with mixed berries.");
        recipes.add("6. Hot Chocolate\n   Rich and creamy hot chocolate topped with whipped cream.");
        recipes.add("7. Piña Colada\n   Tropical cocktail made with pineapple and coconut.");
        recipes.add("8. Chai Tea\n   Spiced tea brewed with milk and aromatic spices.");

        // Create an adapter to display the recipe names and descriptions
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipes);
        listViewRecipes.setAdapter(adapter);
    }
}
