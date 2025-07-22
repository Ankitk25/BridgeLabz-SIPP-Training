import java.util.LinkedList;
import java.util.Scanner;


abstract class MediaPlayer {
    abstract void playNext();
}

// Playlist class
class MusicPlaylist extends MediaPlayer {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        this.playlist = new LinkedList<>();
    }

    public void addSong(String songName) {
        playlist.addLast(songName);
        System.out.println(songName + " added to playlist.");
    }

    public void removeSong(String songName) {
        if (playlist.remove(songName)) {
            System.out.println(songName + " removed from playlist.");
        } else {
            System.out.println(songName + " not found in playlist.");
        }
    }

    @Override
    public void playNext() {
        if (!playlist.isEmpty()) {
            String song = playlist.removeFirst();
            System.out.println("Now playing: " + song);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist: " + playlist);
        }
    }
}
