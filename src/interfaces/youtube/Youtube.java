package interfaces.youtube;

public class Youtube implements AudioMediaPlayer, VideoMediaPlayer{
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
        System.out.println("Premium subscription required");
        return false;
    }

    public boolean memberChat(){
        System.out.println("Premium subscription required");
        return false;
    }
}
