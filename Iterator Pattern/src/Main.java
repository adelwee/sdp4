public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1", "Rock"));
        playlist.addSong(new Song("Song 2", "Pop"));
        playlist.addSong(new Song("Song 3", "Jazz"));

        Iterator iterator = playlist.createSequentialIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Playing: " + song.getTitle());
        }
    }
}
