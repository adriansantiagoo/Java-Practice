package Collections.MusicStreaming_system;

public class Main {
    public static void main(String[] args){
        MusicEngine musicEngine = new MusicEngine();

        Song song1 = new Song("XTRANHO");
        Song song2 = new Song("TIPO AKON");
        Song song3 = new Song("100% MOLHO");
        Song song4 = new Song("SAVANA");
        Song song5 = new Song("CORSA FREESTYLE");
        Song song6 = new Song("TEMPO DO OURO");
        Song song7 = new Song("qcl");

        musicEngine.addToPlaylist(song1);
        musicEngine.addToPlaylist(song7);
        musicEngine.addToPlaylist(song3);
        musicEngine.addToPlaylist(song4);
        musicEngine.addToPlaylist(song6);

        musicEngine.addToFavorites(song2);
        musicEngine.addToFavorites(song6);

        musicEngine.skipSong();
        musicEngine.skipSong();

        musicEngine.addToQueue(song5);
        musicEngine.addToQueue(song2);
        System.out.println("Current queue: " + musicEngine.getSongQueue());
        System.out.println();

        musicEngine.skipSong();
        musicEngine.skipSong();

        System.out.println("Current song: " + musicEngine.getCurrentSong());
        System.out.println();
        System.out.println("Recent songs: " + musicEngine.getRecentSongs());
        System.out.println("Playlist: " + musicEngine.getPlaylist());
        System.out.println("Favorite songs: " + musicEngine.getFavoriteSongs());
        System.out.println("Library: " + musicEngine.getLibrary().values());
    }
}
