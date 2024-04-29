package P8.P8.src;

public class gudang12 {
    public barang12[] tumpukan;
    public int size;
    public int top;

    public gudang12(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang12[size];
        top = -1;
    }

    boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(barang12 b) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = b;
            System.out.println("Barang " + b.nama + " telah berhasil ditambahkan ke dalam gudang");
        } else {
            System.out.println("Gagal! tumpukan barang dalam gudang sudah penuh");
        }
    }

    barang12 ambilBarang() {
        if (!cekKosong()) {
            barang12 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " telah berhasil diambil dari gudang");
            return delete;
        } else {
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }

    void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("rincian tumpukan barang di gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("kode %d: %s (kategori %s) \n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("tumpukan barang kosong");
        }
    }

}
