package interfaces.youtube;

public class YoutubeMain {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();
        youtube.memberChat();

        Youtube youtube1 = new YoutubePremium();
        youtube1.changeQualityAllowed();
    }
}
