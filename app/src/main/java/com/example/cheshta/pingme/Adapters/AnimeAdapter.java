package com.example.cheshta.pingme.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cheshta.pingme.Models.Anime;
import com.example.cheshta.pingme.R;

import java.util.ArrayList;

/**
 * Created by chesh on 2/11/2018.
 */

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {

    private ArrayList<Anime> animes;

    public AnimeAdapter(ArrayList<Anime> animes) {
        this.animes = animes;
    }

    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_anime_layout, parent, false);
        return new AnimeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AnimeViewHolder holder, int position) {
        Anime currentAnime = animes.get(position);
        holder.tvAnimeName.setText(currentAnime.getAnimeName());
    }

    @Override
    public int getItemCount() {
        return animes.size();
    }

    class AnimeViewHolder extends RecyclerView.ViewHolder{

        TextView tvAnimeName;

        public AnimeViewHolder(View itemView) {
            super(itemView);
            tvAnimeName = itemView.findViewById(R.id.tvAnimeName);
        }
    }
}
