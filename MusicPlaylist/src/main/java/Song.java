public class Song {
    private String artist;
    private String album;
    private String name;
    private int length;


    public Song(String songName,String artistName,String albumName,int songLength){

    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}
