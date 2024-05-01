package Assignments.mediaPlayer;


import java.sql.SQLOutput;

public class AudioPlayer extends MediaDevice implements Playable {
    String song;
    String artist;

    public AudioPlayer(String name, String song, String artist) {
        super(name);
        this.song = song;
        this.artist = artist;
    }


    @Override
    public void displayDetails() {
        System.out.println("Name of the Device: " + name);
        System.out.println("Song Name : " + song);
        System.out.println("Artist Name : " + artist);
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + song + " by " + artist + ".");
    }
}
