import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return playlistTitle;
    }

    public void setTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String songName) {
        songs.removeIf(song -> song.getSongName().equals(songName));
    }

    public void swapSongs(Song song1, Song song2) {
        int index1 = songs.indexOf(song1);
        int index2 = songs.indexOf(song2);
        if (index1 != -1 && index2 != -1) {
            Collections.swap(songs, index1, index2);
        }
    }

    public String getTotalDuration() {
        int totalMinutes = 0, totalSeconds = 0;
        for (Song song : songs) {
            String[] time = song.getDuration().split(":");
            totalMinutes += Integer.parseInt(time[0]);
            totalSeconds += Integer.parseInt(time[1]);
        }
        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;
        return totalMinutes + " min, " + totalSeconds + " sec";
    }

    public void sortSongs() {
        Collections.sort(songs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(playlistTitle).append(" - ").append(getTotalDuration()).append("\n");
        for (int i = 0; i < songs.size(); i++) {
            sb.append((i + 1)).append(". ").append(songs.get(i)).append("\n");
        }
        return sb.toString();
    }
}
