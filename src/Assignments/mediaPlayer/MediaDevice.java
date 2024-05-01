package Assignments.mediaPlayer;

public abstract class MediaDevice {
    String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}
