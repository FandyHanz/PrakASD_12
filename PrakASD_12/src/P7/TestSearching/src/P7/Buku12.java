package P7;

public class Buku12 {
    int kodeBuku;
    String judullBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku12() {

    }

    public Buku12(int kodeBuku, String judul, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judullBuku = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    void TampilBuku() {
        System.out.println("=========================");
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judullBuku);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }
}
