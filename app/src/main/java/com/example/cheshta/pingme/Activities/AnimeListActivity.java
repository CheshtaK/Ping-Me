package com.example.cheshta.pingme.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.cheshta.pingme.Adapters.AnimeAdapter;
import com.example.cheshta.pingme.Models.Anime;
import com.example.cheshta.pingme.R;

import java.util.ArrayList;

public class AnimeListActivity extends AppCompatActivity {

    RecyclerView rvAnimes;
    Toolbar animelistToolbar;

    ArrayList<Anime> animes = new ArrayList<>();
    AnimeAdapter animeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_list);
        
        rvAnimes = findViewById(R.id.rvAnimes);

        Anime anime1 = new Anime("Hello");
        Anime anime2 = new Anime("Heyy");

        animes.add(anime1);
        animes.add(anime2);

        animeAdapter = new AnimeAdapter(animes);
        rvAnimes.setLayoutManager(new LinearLayoutManager(this));
        rvAnimes.setAdapter(animeAdapter);

        animelistToolbar = findViewById(R.id.animelistToolbar);
        setSupportActionBar(animelistToolbar);
        getSupportActionBar().setTitle("Animes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
