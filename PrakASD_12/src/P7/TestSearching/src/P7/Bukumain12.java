package P7;
import java.util.Scanner;

public class Bukumain12 {
    public static void main(String[] args) {
        Scanner sc12Str = new Scanner(System.in);
        Scanner sc12int = new Scanner(System.in);

        PencarianBuku12 data = new PencarianBuku12();
        int jumlahBuku = 5;

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
        System.out.print("Masukan kode buku yang dicari: ");
        int kode1 = sc12int.nextInt();
        System.out.println("Pencarian secara sequential: ");
        int pos = data.FindSeqSearch(kode1);
        data.Tampilposisi(kode1, pos);
    }
}
