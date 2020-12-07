package com.example.doanvanhung_17059571_media;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Song> listSong;
    private SongAdapter songAdapter;
    private RecyclerView rcvListMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listSong = new ArrayList<>();
        listSong.add(new Song("Cô gái m52", R.raw.supun1m52, R.drawable.m52));
        listSong.add(new Song("Cô gái vàng", R.raw.cogaivang, R.drawable.cogaivang));
        listSong.add(new Song("Anh thanh niên", R.raw.anhthanhnien, R.drawable.anhthanhnien));
        listSong.add(new Song("Chân ái", R.raw.chanai, R.drawable.chanai));
        listSong.add(new Song("Gác âu lo lại", R.raw.gacaulolai, R.drawable.gacaulolai));
        listSong.add(new Song("Hoa nở không màu", R.raw.hoanokhongmau, R.drawable.hoanokhongmau));
        listSong.add(new Song("Nàng thơ", R.raw.nangtho, R.drawable.nangtho));
        listSong.add(new Song("Tinh anh", R.raw.tinhanh, R.drawable.tinhanh));
        listSong.add(new Song("Tình yêu khủng long", R.raw.tinhyeukhunglong, R.drawable.tinhyeukhunglong));
        listSong.add(new Song("Trên tình bạn dưới tình yêu", R.raw.trentinhbanduotinhyeu, R.drawable.trentinhbanduoitinhyeu));
        listSong.add(new Song("Đánh mất em", R.raw.danhmatem, R.drawable.danhmatem));
        listSong.add(new Song("Chẳng thể tìm được em", R.raw.changthetimduocem, R.drawable.changthetimduocem));
        listSong.add(new Song("Từ em mà ra", R.raw.tuemmara, R.drawable.tuemmara));
        listSong.add(new Song("Phố cũ còn anh", R.raw.phocuconanh, R.drawable.phocuconanh));
        listSong.add(new Song("Người lạ người thương rồi người dưng", R.raw.nguoilanguoithuongroinguoidung, R.drawable.nguoilanguoithuongroinguoidung));



        rcvListMusic = findViewById(R.id.rcvListMusic);
        songAdapter = new SongAdapter(this, listSong);
        rcvListMusic.setAdapter(songAdapter);
        rcvListMusic.setLayoutManager(new LinearLayoutManager(this));
    }
}