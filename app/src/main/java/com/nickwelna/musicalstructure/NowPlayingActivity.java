package com.nickwelna.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView library = findViewById(R.id.library);
        ImageView store = findViewById(R.id.store);

        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent yourLibraryIntent = new Intent(NowPlayingActivity.this, LibraryActivity.class);
                startActivity(yourLibraryIntent);
            }
        });

        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(NowPlayingActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });
    }
}
