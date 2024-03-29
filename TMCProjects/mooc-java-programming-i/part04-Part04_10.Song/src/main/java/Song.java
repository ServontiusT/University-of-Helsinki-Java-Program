/*
Create a class called Song. The song has the instance variables name (string) and length in seconds (integer).
Both are set in the public Song(String name, int length) constructor.
Also, add to the object the methods public String name(), which returns the name of the song, and public int length(),
which returns the length of the song.
*/

public class Song {
    private String name;
    private int length;

    public Song(String name, int lenghtInSeconds) {
        this.name = name;
        this.length = lenghtInSeconds;
    }

    public String name() {
        return name;
    }

    public int length() {
        return length;
    }
}
