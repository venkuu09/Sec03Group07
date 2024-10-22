package com.example.sec03group07;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {
    private ListView listViewItems;
    private TextView textViewCartCount;
    private int cartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        listViewItems = findViewById(R.id.listViewItems);
        textViewCartCount = findViewById(R.id.textViewCartCount);

        // Sample shopping items with descriptions
        ArrayList<String> items = new ArrayList<>();
        items.add("1. Paneer (200g)\n   Fresh paneer for making curries.");
        items.add("2. Basmati Rice (1kg)\n   Aromatic rice for biryani.");
        items.add("3. Chickpeas (500g)\n   Dried chickpeas for making chana masala.");
        items.add("4. Bell Peppers (500g)\n   Fresh bell peppers for stuffing.");
        items.add("5. Potatoes (1kg)\n   Versatile ingredient for various dishes.");
        items.add("6. Spinach (250g)\n   Fresh spinach for dal.");
        items.add("7. Mixed Vegetables (Frozen)\n   Assorted vegetables for stir fry.");
        items.add("8. Pizza Base (2 pieces)\n   Ready-to-use pizza base for quick meals.");

        // Create an adapter to display the items
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listViewItems.setAdapter(adapter);

        // Update cart count
        updateCartCount();
    }

    private void updateCartCount() {
        // Display the current cart count
        textViewCartCount.setText("Items in Cart: " + cartCount);
    }
}
