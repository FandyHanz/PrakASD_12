package P7;

import java.util.Scanner;

public class Bukumain12 {
    public static void main(String[] args) {
        Scanner sc12Str = new Scanner(System.in);
        Scanner sc12int = new Scanner(System.in);

        PencarianBuku12 data = new PencarianBuku12();
        int jumlahBuku = 6;

        System.out.println("===================================");
        System.out.println("Masukan secara urut, dari kode buku terkecil");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("=======================================");
            System.out.print("Masukan Kode buku: ");
            int kode = sc12int.nextInt();
            System.out.print("Judul buku: ");
            String judul = sc12Str.nextLine();
            System.out.print("Tahun terbit: ");
            int tahun = sc12int.nextInt();
            System.out.print("Pengarang: ");
            String pengarang = sc12Str.nextLine();
            System.out.print("Stock: ");
            int stok = sc12int.nextInt();

            Buku12 m = new Buku12(kode, judul, tahun, pengarang, stok);
            data.TambahBuku(m);
        }
        System.out.println("===========================================");
        System.out.println("Data keseluruhan Mahasiwa: ");
        data.Tampil();
        System.out.println("===============================================");
        System.out.println("Pencarian data: ");
        System.out.println("====================================================");
        System.out.print("masukan kode buku: ");
        int cari1 = sc12Str.nextInt();
        System.out.println("============================================");
        System.out.println("pencarian Squential");
        System.out.println("===============================================");
        int pos = data.FindSeqSearch(cari1);
        data.Tampilposisi(cari1, pos);
        System.out.println("================================================");
        System.out.println("pencarian secara binary");
        System.out.println("=======================================================");
        int posisi = data.FindBinarySearch(cari1, 0, jumlahBuku -1);
        data.Tampilposisi(cari1, posisi);
    }
}
