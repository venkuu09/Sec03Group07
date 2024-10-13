package com.example.sec03group07;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NonVegActivity extends AppCompatActivity {
    private ListView listViewRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg);

        listViewRecipes = findViewById(R.id.listViewRecipes);

        // Sample non-veg recipes
        ArrayList<String> recipes = new ArrayList<>();
        recipes.add("1. Chicken Biryani\n   A flavorful rice dish made with marinated chicken, spices, and saffron.");
        recipes.add("2. Grilled Salmon\n   Tender salmon fillets grilled to perfection with a hint of lemon.");
        recipes.add("3. Beef Stroganoff\n   A creamy beef dish served with noodles, flavored with mushrooms and onions.");
        recipes.add("4. Prawn Curry\n   Spicy and tangy curry made with fresh prawns and coconut milk.");
        recipes.add("5. Lamb Chops\n   Juicy lamb chops marinated and grilled, served with mint sauce.");
        recipes.add("6. Chicken Tikka Masala\n   Marinated chicken pieces cooked in a creamy tomato sauce.");
        recipes.add("7. Fish Tacos\n   Grilled fish served in soft tortillas with fresh salsa and avocado.");
        recipes.add("8. BBQ Ribs\n   Slow-cooked ribs slathered in barbecue sauce, served with coleslaw.");


        // Create an adapter to display the recipe names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipes);
        listViewRecipes.setAdapter(adapter);
    }
}
