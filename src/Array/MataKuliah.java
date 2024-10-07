package Array;

class MataKuliah {
    String nama;
    String hari;
    String waktu;
    String ruang;
    String dosen;
    String tipe;

    // Constructor
    public MataKuliah(String nama, String hari, String waktu, String ruang, String dosen, String tipe) {
        this.nama = nama;
        this.hari = hari;
        this.waktu = waktu;
        this.ruang = ruang;
        this.dosen = dosen;
        this.tipe = tipe;
    }

    // Method untuk menampilkan informasi jadwal
    public String toString() {
        return "Mata Kuliah: " + nama + ", Hari: " + hari + ", Waktu: " + waktu +
                ", Ruang: " + ruang + ", Dosen: " + dosen + ", Tipe: " + tipe;
    }
}
