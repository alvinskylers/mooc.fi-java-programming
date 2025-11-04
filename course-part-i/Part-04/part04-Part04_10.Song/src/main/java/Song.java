public class Song {
    
    private String name;
    private int length;

    public Song(String song, int seconds) {
        this.name = song;
        this.length = seconds;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
