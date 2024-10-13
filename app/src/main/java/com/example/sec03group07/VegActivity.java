package com.example.sec03group07;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class VegActivity extends AppCompatActivity {
    private ListView listViewRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);

        listViewRecipes = findViewById(R.id.listViewRecipes);

        // Sample veg recipes with descriptions
        ArrayList<String> recipes = new ArrayList<>();
        recipes.add("1. Paneer Butter Masala\n   Creamy paneer dish cooked in rich tomato gravy.");
        recipes.add("2. Vegetable Biryani\n   Spiced rice dish cooked with mixed vegetables and saffron.");
        recipes.add("3. Chana Masala\n   Chickpeas cooked in a spicy onion-tomato gravy.");
        recipes.add("4. Stuffed Bell Peppers\n   Bell peppers stuffed with a mixture of rice, beans, and spices.");
        recipes.add("5. Aloo Gobi\n   Cauliflower and potatoes sautéed with spices.");
        recipes.add("6. Spinach Dal\n   Lentils cooked with spinach and spices, served with rice.");
        recipes.add("7. Vegetable Stir Fry\n   Mixed vegetables stir-fried with soy sauce and ginger.");
        recipes.add("8. Veggie Pizza\n   Pizza topped with fresh vegetables and cheese.");

        // Create an adapter to display the recipe names and descriptions
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipes);
        listViewRecipes.setAdapter(adapter);
    }
}