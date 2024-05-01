package interfaces.youtube;

public class YoutubePremium extends Youtube implements AudioMediaPlayer, VideoMediaPlayer{
    @Override
    public boolean screenOffPlay() {
        System.out.println("Not Allowed");
        return false;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public boolean changeQualityAllowed() {
        System.out.println("Quality Changed to 1080p");

        return true;
    }

    @Override
    public boolean memberChat() {
        System.out.println("Member Chat Enabled");
        return true;
    }
}
