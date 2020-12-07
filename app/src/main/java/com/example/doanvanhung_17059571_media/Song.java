package com.example.doanvanhung_17059571_media;

public class Song {
    private String songName;
    private int mp3;
    private int imageSong;

    public Song(String songName, int mp3, int imageSong) {
        this.songName = songName;
        this.mp3 = mp3;
        this.imageSong = imageSong;
    }

    public Song() {
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getMp3() {
        return mp3;
    }

    public void setMp3(int mp3) {
        this.mp3 = mp3;
    }

    public int getImageSong() {
        return imageSong;
    }

    public void setImageSong(int imageSong) {
        this.imageSong = imageSong;
    }
}
