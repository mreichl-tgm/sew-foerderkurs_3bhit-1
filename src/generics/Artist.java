package generics;

import java.util.ArrayList;

class Artist {
    private String name;
    private ArrayList<String> songs;

    Artist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    String getName() {
        return this.name;
    }

    void addSong(String s) {
        songs.add(s);
    }

    void playSongs() {
        songs.forEach(System.out::println);
    }
}
