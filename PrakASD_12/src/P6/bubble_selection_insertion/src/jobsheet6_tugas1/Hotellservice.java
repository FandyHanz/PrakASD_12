package P6.bubble_selection_insertion.src.jobsheet6_tugas1;

public class Hotellservice {
    Hotel[] rooms = new Hotel[5];
    int idx;

    void tambah(Hotel h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
            System.out.println("Nama: " + h.nama);
            System.out.println("Kota: " + h.kota);
            System.out.println("Harga: " + h.harga);
            System.out.println("Bintang: " + h.bintang);
            System.out.println("==========================");
        }
        System.out.println();
    }

    void BubbleSortHargatinggi() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].bintang) {

                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void SelectionSortHargatertinggi() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxmax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga > rooms[idxmax].harga) {
                    idxmax = j;
                }
            }
            Hotel tmp = rooms[i];
            rooms[i] = rooms[idxmax];
            rooms[idxmax] = tmp;
        }
    }

    void SelectionsortBintangterendah() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxmin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang < rooms[idxmin].bintang) {
                    idxmin = j;
                }
            }
            Hotel tmp = rooms[idxmin];
            rooms[idxmin] = rooms[i];
            rooms[i] = tmp;
        }
    }

    void SelectionBintangtertinggi() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxmax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxmax].bintang) {
                    idxmax = j;
                }
            }
            Hotel tmp = rooms[i];
            rooms[i] = rooms[idxmax];
            rooms[idxmax] = tmp;
        }
    }

    void BubblesortBintangtertinggi() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].bintang > rooms[j - 1].bintang) {

                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void BubblesortBintangTerendah() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].bintang < rooms[j - 1].bintang) {

                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }
}
