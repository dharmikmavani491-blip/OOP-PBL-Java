import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Playlist after adding songs:");
        System.out.println(playlist);

        // 2. Display full playlist
        System.out.println("\nFull Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

        // 3. Play first song (remove from front)
        if (!playlist.isEmpty()) {
            String playedSong = playlist.removeFirst();
            System.out.println("\nPlaying: " + playedSong);
        }

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // 4. Skip last song (remove from end)
        if (!playlist.isEmpty()) {
            String skippedSong = playlist.removeLast();
            System.out.println("\nSkipped: " + skippedSong);
        }

        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}
