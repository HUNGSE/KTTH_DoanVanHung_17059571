package com.example.doanvanhung_17059571_media;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {
    private ArrayList<Song> listSong;
    private LayoutInflater layoutInflater;

    public SongAdapter(Context context,ArrayList<Song> listSong) {
        this.listSong = listSong;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.song_item, parent, false);
        return new SongViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        String name = listSong.get(position).getSongName();
        int mp3 = listSong.get(position).getMp3();
        int imgSong = listSong.get(position).getImageSong();
        holder.tv_item_name.setText(name);
        holder.img_item_song.setImageResource(imgSong);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivityControl.class);
                intent.putExtra("name", name);
                intent.putExtra("img", imgSong);
                intent.putExtra("mp3", mp3);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return listSong.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_item_name;
        public ImageView img_item_song;
        public  SongAdapter songAdapter;
        public SongViewHolder(@NonNull View itemView, SongAdapter songAdapter) {
            super(itemView);
            tv_item_name = itemView.findViewById(R.id.tv_item_name);
            img_item_song = itemView.findViewById(R.id.img_item_song);
            this.songAdapter =songAdapter;
        }
    }
}
