package com.nickwelna.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        LinearLayout songList = findViewById(R.id.song_list);
        int childCount = songList.getChildCount();

        for (int i = 0; i < childCount; i++) {

            View child = songList.getChildAt(i);

            if (child instanceof TextView) {

                child.setOnClickListener(new View.OnClickListener() {

                    // The code in this method will be executed when the numbers View is clicked on.
                    @Override
                    public void onClick(View view) {

                        Intent playSongIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                        startActivity(playSongIntent);

                    }

                });

            }

        }

    }

}
