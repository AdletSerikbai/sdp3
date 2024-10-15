public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new MP3Player();

        // Playing MP3 files directly
        audioPlayer.play("mp3", "song1.mp3");

        // Playing WAV files via adapter
        AudioPlayer wavAdapter = new AudioAdapter("wav");
        wavAdapter.play("wav", "song2.wav");

        // Playing AAC files via adapter
        AudioPlayer aacAdapter = new AudioAdapter("aac");
        aacAdapter.play("aac", "song3.aac");
    }
}