package com.example.sec03group07;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DessertsActivity extends AppCompatActivity {
    private ListView listViewRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        listViewRecipes = findViewById(R.id.listViewRecipes);

        // Sample dessert recipes with descriptions
        ArrayList<String> recipes = new ArrayList<>();
        recipes.add("1. Chocolate Cake\n   Rich and moist chocolate cake with frosting.");
        recipes.add("2. Tiramisu\n   Coffee-flavored Italian dessert made with mascarpone cheese.");
        recipes.add("3. Ice Cream Sundae\n   Ice cream topped with chocolate syrup, nuts, and cherries.");
        recipes.add("4. Fruit Tart\n   Pastry crust filled with custard and topped with fresh fruits.");
        recipes.add("5. Cheesecake\n   Creamy cheesecake served with a berry compote.");
        recipes.add("6. Brownies\n   Fudgy chocolate brownies with a crackly top.");
        recipes.add("7. Panna Cotta\n   Silky Italian dessert made with cream and vanilla.");
        recipes.add("8. Gulab Jamun\n   Deep-fried dough balls soaked in sugar syrup.");

        // Create an adapter to display the recipe names and descriptions
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipes);
        listViewRecipes.setAdapter(adapter);
    }
}

