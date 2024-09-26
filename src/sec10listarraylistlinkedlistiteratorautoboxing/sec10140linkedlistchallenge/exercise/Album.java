package sec10listarraylistlinkedlistiteratorautoboxing.sec10140linkedlistchallenge.exercise;

import java.util.LinkedList;
import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }

        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if (trackNumber > 0 && trackNumber <= songs.size()) {
            playList.add(songs.get(trackNumber - 1));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);

        if (song == null) {
            return false;
        }

        playList.add(song);
        return true;
    }
}