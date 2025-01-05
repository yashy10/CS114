import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(String playlistTitle) {
        playlists.removeIf(playlist -> playlist.getTitle().equals(playlistTitle));
    }

    public ArrayList<Playlist> getAllPlaylists() {
        return playlists;
    }

    public Playlist getPlaylist(String playlistTitle) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equals(playlistTitle)) {
                return playlist;
            }
        }
        return null;
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend) {
        Playlist playlist = getPlaylist(playlistTitle);
        if (playlist != null) {
            friend.addPlaylist(playlist);
        }
    }

    @Override
    public String toString() {
        return "User: " + username + " with playlists: " + playlists.size();
    }
}
