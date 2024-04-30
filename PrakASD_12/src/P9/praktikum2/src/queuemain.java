package P9.praktikum2.src;

import java.util.Scanner;

public class queuemain {
    static void menu() {
        System.out.println("Masukan menu yang diinginkan");
        System.out.println("1. antrian baru");
        System.out.println("2. antrian keluar");
        System.out.println("3. cek antrian terdepan");
        System.out.println("4. cek semua antrian");
        System.out.println("5. cek barisan terakhir");
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        Scanner sc12str = new Scanner(System.in);
        boolean iscont = true;
        System.out.print("masukan kapasistas data: ");
        int jumlah = sc12.nextInt();
        queue q = new queue(jumlah);

        do {
            menu();
            int pilih = sc12.nextInt();
            switch (pilih) {
                case 1:
                    if (!q.isFull()) {
                        System.out.println("no rekening: ");
                        String norek = sc12str.nextLine();
                        System.out.println("nama: ");
                        String nama = sc12str.nextLine();
                        System.out.println("alamat: ");
                        String alamat = sc12str.nextLine();
                        System.out.println("umur: ");
                        int umur = sc12.nextInt();
                        System.out.println("saldo: ");
                        double saldo = sc12.nextInt();
                        nasabah nb = new nasabah(norek, nama, alamat, umur, saldo);
                        sc12.nextLine();
                        q.enqueque(nb);
                    } else {
                        System.out.println("data sudah penuh");
                        iscont = false;
                        break;
                    }
                    break;
                case 2:
                    nasabah data = q.dequeque();
                    if (!q.isEmpty()) {
                        if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                                && data.saldo != 0) {
                            System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + data.alamat
                                    + " " + data.umur + " " + data.saldo);
                        }
                    } else {
                        System.out.println("data sudah kosong");
                        iscont = false;
                        break;
                    }
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.print();
                    break;
                case 5:
                    q.peekRear();
                    break;
                default:
                    break;
            }
        } while (iscont);
    }
}
