package com.example.cheshta.pingme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.cheshta.pingme.Activities.AnimeListActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAnime, btnTvseries, btnMovies;
    Toolbar mainToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnime = findViewById(R.id.btnAnime);
        btnTvseries = findViewById(R.id.btnTvseries);
        btnMovies = findViewById(R.id.btnMovies);

        mainToolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);
        getSupportActionBar().setTitle("Ping Me");

        btnAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AnimeListActivity.class));
            }
        });
    }
}
