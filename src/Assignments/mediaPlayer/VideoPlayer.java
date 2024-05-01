package Assignments.mediaPlayer;

public class VideoPlayer extends MediaDevice implements Playable {
    String title;
    double duration;

    public VideoPlayer(String name, String title, double duration) {
        super(name);
        this.title = title;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name of the Device: " + name);
        System.out.println("Title of the Video: " + title);
        System.out.println("Duration of the Video: " + duration + " minutes");
    }

    @Override
    public void play() {
        System.out.println("Playing Video: " + title);

    }
}
