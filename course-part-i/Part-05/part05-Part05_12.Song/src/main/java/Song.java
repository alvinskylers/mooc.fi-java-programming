
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Song)) {
            return false;
        }

        Song songObject = (Song) obj;

        if (this.name.equals(songObject.name) &&
            this.artist.equals(songObject.artist) &&
            this.durationInSeconds == songObject.durationInSeconds ) {
            return true;
        } 


        return false;
    }

}
