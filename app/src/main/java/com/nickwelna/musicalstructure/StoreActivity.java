package com.nickwelna.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Button purchase = findViewById(R.id.purchase_button);

        // Set a click listener on that View
        purchase.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent purchaseIntent = new Intent(StoreActivity.this, PurchaseActivity.class);
                startActivity(purchaseIntent);
            }
        });

    }
}
