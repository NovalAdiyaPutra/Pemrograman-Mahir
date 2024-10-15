package PenumpangPesawat;

public class Flight {
    private Passenger head;

    public Flight() {
        this.head = null;
    }

    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPassenger;
        }
    }

    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Daftar Penumpang Kosong,Tidak Ada Penumpang yang Dihapus.");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Passenger current = head;
        Passenger previous = null;

        while (current != null && !current.name.equals(name)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Penumpang atas nama " +name +" Tidak Ditemukan.");
            return;
        }

        previous.next = current.next;
    }

    public void displayPassenger() {
        if (head == null) {
            System.out.println("Daftar Penumpang Tidak Ada");
        } else {
            Passenger current = head;
            while (current != null) {
                System.out.println(current.name);
                current = current.next;
            }
        }
    }

}
