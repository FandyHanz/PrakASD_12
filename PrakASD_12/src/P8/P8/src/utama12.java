package P8.P8.src;

import java.util.Scanner;

public class utama12 {
    public static void main(String[] args) {
        Scanner input12int = new Scanner(System.in);
        Scanner input12str = new Scanner(System.in);
        boolean iscont = true;
        System.out.print("Masukan jumlah barang yang ingin dimasukan: ");
        int value = input12int.nextInt();
        gudang12 gd12 = new gudang12(value);

        while (iscont) {
            System.out.println("pilihan menu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil tumpukan barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilan barang teratas");
            System.out.println("5. Exit");
            System.out.print("Masukan pilihan menu: ");
            int pilihan = input12int.nextInt();
            input12int.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan kode barang: ");
                    int kode = input12int.nextInt();
                    System.out.print("Masukan nama barang: ");
                    String nama = input12str.nextLine();
                    System.out.print("Masukan kategori barang: ");
                    String kategori = input12str.nextLine();
                    barang12 brg12 = new barang12(kode, nama, kategori);
                    gd12.tambahBarang(brg12);
                    break;
                case 2:
                    gd12.ambilBarang();
                    break;
                case 3:
                    gd12.tampilkanBarang();
                    break;
                case 5:
                    iscont = false;
                    break;
                default:
                    System.out.println("opsi tidak valid");
            }
        }
    }
}
