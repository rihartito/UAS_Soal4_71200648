import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<Song> songs;
    private int count;

    public Playlist(ArrayList<Song> songs){

    }
    public void print(){
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(songs.get(i) + " ");
        }
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }
    public void add(Song song){
        songs.add(song);
    }

    public int size(){
        return songs.size();

    }
}
