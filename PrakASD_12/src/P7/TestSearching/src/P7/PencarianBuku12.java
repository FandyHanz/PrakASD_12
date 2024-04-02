package P7;

public class PencarianBuku12 {
    Buku12[] listBuku = new Buku12[5];
    int idx;

    void TambahBuku(Buku12 m) {
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!!");
        }
    }

    void Tampil() {
        for (Buku12 m : listBuku) {
            m.TampilBuku();
        }
    }

    int FindSeqSearch(int cari) {
        int posisi = 0;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("=========================");
            System.out.println("Kode Buku: " + (pos + 1));
            System.out.println("Judul: " + listBuku[pos].judullBuku);
            System.out.println("Tahun terbit: " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang: " + listBuku[pos].pengarang);
            System.out.println("Stock: " + listBuku[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    Buku12 Findbuku(String cari1) {
        int posisi = 0;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].judullBuku.equals(cari1)) {
                posisi = i;
                break;
            }
        }
        System.out.println("=========================");
        System.out.println("Kode Buku: " + (posisi + 1));
        System.out.println("Judul: " + listBuku[posisi].judullBuku);
        System.out.println("Tahun terbit: " + listBuku[posisi].tahunTerbit);
        System.out.println("Pengarang: " + listBuku[posisi].pengarang);
        System.out.println("Stock: " + listBuku[posisi].stock);

        return listBuku[posisi];
    }

    int FindBinarySearch(int cari, int left, int right) {
        int mid = 0;
        mid = (left + right) / 2;
        if (cari == listBuku[mid].kodeBuku) {
            return (mid);
        } else if (cari < listBuku[mid].kodeBuku) {
            return FindBinarySearch(cari, left, mid -1);
        } else if (cari > listBuku[mid].kodeBuku) {
            return FindBinarySearch(cari, mid +1, right);
        } else {
            return -1;
        }
    }

}
