package com.nickwelna.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        Button pay = findViewById(R.id.pay);

        pay.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(PurchaseActivity.this, "Payment Successful", Toast.LENGTH_LONG).show();
                Intent yourLibraryIntent = new Intent(PurchaseActivity.this, LibraryActivity.class);
                startActivity(yourLibraryIntent);

            }

        });

    }

}
