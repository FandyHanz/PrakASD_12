package P1;

import java.util.Scanner;

class Tugas2_12 {
    public static double jarak = 0.0, kecepatan = 0.0, waktu = 0.0, Hasil = 0.0;
    public static Scanner input12 = new Scanner(System.in);

    public static void main(String[] args) {
        String pilihan = "";
        boolean isReturn = false;

            isReturn = false;
            System.out.println("pilih menu: ");
            System.out.println();
            System.out.println("1. hitung kecepatan");
            System.out.println("2. Hitung jarak");
            System.out.println("3. Hitung waktu");
            System.out.println();
            System.out.print("Pilih: ");
            pilihan = input12.nextLine();

            switch (pilihan) {
                case "1":
                    Hitkecepatan();
                    System.out.print("Menu (y/t): ");
                    pilihan = input12.nextLine();
                    if (pilihan.equalsIgnoreCase("y")) {
                        isReturn = true;
                        break;
                    }
                    break;

                case "2":
                    Hitjarak();
                    System.out.print("Menu (y/t): ");
                    pilihan = input12.nextLine();
                    if (pilihan.equalsIgnoreCase("y")) {
                        isReturn = true;
                        break;
                    }
                    break;

                case "3":
                    Hitwaktu();
                    System.out.print("Menu (y/t): ");
                    pilihan = input12.nextLine();
                    if (pilihan.equalsIgnoreCase("y")) {
                        isReturn = true;
                        break;
                    }
                    break;
            }
    }

    public static void Hitkecepatan() {
        System.out.print("Masukan jarak: ");
        jarak = input12.nextDouble();
        System.out.print("Masukan waktu: ");
        waktu = input12.nextDouble();
        System.out.println();
        Hasil = jarak / waktu;
        System.out.print("Hasil kalkulasi: " + Hasil + "\n");
    }

    public static void Hitjarak() {
        System.out.print("Masukan kecepatan: ");
        kecepatan = input12.nextDouble();
        System.out.print("Masukan waktu: ");
        waktu = input12.nextDouble();
        System.out.println();
        Hasil = kecepatan * waktu;
        System.out.print("Hasil kalkulasi: " + Hasil + "\n");
    }

    public static void Hitwaktu() {
        System.out.print("Masukan jarak: ");
        jarak = input12.nextDouble();
        System.out.print("Masukan kecepatan: ");
        kecepatan = input12.nextDouble();
        System.out.println();
        Hasil = jarak / kecepatan;
        System.out.print("Hasil kalkulasi: " + Hasil + "\n");
    }
}
