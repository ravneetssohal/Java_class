package Assignments.mediaPlayer;

public class MultiMediaMain {
    public static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer("iPod", "Happier", "Marshmello");
        audio.displayDetails();
        audio.play();
        System.out.println("--------------------------");
        VideoPlayer video = new VideoPlayer("iPhone", "Happier", 3);
        video.displayDetails();
        video.play();
        System.out.println("--------------------------");
        MediaDevice image = new ImageDisplay("Photos", "Old Collection", "1080x920");
        image.displayDetails();

    }
}
