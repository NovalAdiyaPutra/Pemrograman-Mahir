package PenumpangPesawat;

public class AppPenumpang {
    public static void main(String[] args) {
        Flight penumpang = new Flight();

        penumpang.addPassenger("Noval Adiya Putra");
        penumpang.addPassenger("Fayi Zainul Abidin");
        penumpang.addPassenger("Alzi Nashwa Sugra");
        penumpang.addPassenger("Kak Gem");
        penumpang.addPassenger("Salsabilah Amalia");

        penumpang.removePassenger("Kak Gem");

        penumpang.displayPassenger();
    }
}
