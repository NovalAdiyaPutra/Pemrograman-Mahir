package PlaylistLagu;

public class AppPlaylist {
    public static void main(String[] args) {
        Playlist lagu = new Playlist();

        lagu.addSong("Red Light - f(x)");
        lagu.addSong("Hoot - Girls Generation");
        lagu.addSong("Magnetic - Illit");
        lagu.addSong("Love Arcade - Red Velvet");
        lagu.addSong("Talk That Talk - Twice");

        lagu.displayPlaylist();
    }
}
