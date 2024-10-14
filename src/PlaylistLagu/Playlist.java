package PlaylistLagu;

public class Playlist {
    public Song head;

    public Playlist() {
        this.head = null;
    }

    // Metode untuk menambah lagu di akhir playlist (Linked List)
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) { // Jika playlist kosong
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) { // Iterasi sampai node terakhir
                current = current.next;
            }
            current.next = newSong; // Tambahkan node baru di akhir
        }
    }

    // Metode untuk menampilkan semua lagu di playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist Kosong");
        } else {
            Song current = head;
            while (current != null) {
                System.out.println(current.title);
                current = current.next;
            }
        }
    }
}
