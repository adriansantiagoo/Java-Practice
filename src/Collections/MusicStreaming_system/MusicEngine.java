package Collections.MusicStreaming_system;

import java.util.*;

public class MusicEngine {
    private HashMap<String, Song> library = new HashMap<>();
    private HashSet<Song> favoriteSongs = new HashSet<>();
    private LinkedList<Song> playlist = new LinkedList<>();
    private ArrayList<Song> recentSongs = new ArrayList<>();
    private Queue<Song> songQueue = new LinkedList<>();
    private Stack<Song> previousSongs = new Stack<>();
    private Song currentSong;

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public ArrayList<Song> getRecentSongs() {
        return recentSongs;
    }

    public HashMap<String, Song> getLibrary() {
        return library;
    }

    public Stack<Song> getPreviousSongs() {
        return previousSongs;
    }

    public HashSet<Song> getFavoriteSongs() {
        return favoriteSongs;
    }

    public Queue<Song> getSongQueue() {
        return songQueue;
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public void addToPlaylist(Song s){
        playlist.add(s);
        addToLibrary(s);
    }

    public void addToRecent(Song s){
        recentSongs.add(s);
    }

    public void addToLibrary(Song s){
        library.put(s.getName(), s);
    }

    public void addToFavorites(Song s){
        favoriteSongs.add(s);
    }

    public void addToQueue(Song s){
        songQueue.add(s);
        addToLibrary(s);
    }

    public void skipSong(){
        if (currentSong != null){
            previousSongs.push(currentSong);
        }

        if (!songQueue.isEmpty()){
            currentSong = songQueue.poll();
        }
        else if (!playlist.isEmpty()) {
            currentSong = playlist.poll();
        }
        else {
            currentSong = null;
            System.out.println("End of playback.");
        }
        recentSongs.add(currentSong);
    }

    public void backSong() {
        if (previousSongs.isEmpty()) {
            System.out.println("No previous songs in history.");
            return;
        }
        currentSong = previousSongs.pop();
    }
}
