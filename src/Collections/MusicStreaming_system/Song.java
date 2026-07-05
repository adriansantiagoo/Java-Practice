package Collections.MusicStreaming_system;

public class Song {
    private String name;

    public Song(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return java.util.Objects.equals(this.name, song.name);
    }

    // return the "fingerprint" of the object
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public String toString(){
        return name;
    }
}
