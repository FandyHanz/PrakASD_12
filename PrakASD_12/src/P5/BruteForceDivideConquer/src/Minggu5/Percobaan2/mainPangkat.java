package P5.BruteForceDivideConquer.src.Minggu5.Percobaan2;

import java.util.Scanner;

public class mainPangkat {
    public static int a = 0;

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.println("Masukan jumlah elemen yang mau dihitung: ");
        int elemen = input12.nextInt();
        a = elemen;
        System.out.println("-----------------");
        System.out.println();
        System.out.println("pilih menu: ");
        System.out.println("1. Pangkat bruteforce");
        System.out.println("2. Pangkat Divide and Conqueror");
        System.out.println();
        System.out.print("Pilihan: ");
        int decision = input12.nextInt();
        switch (decision) {
            case 1:
                bruteforce();
                break;

            case 2:
                divideConq();
                break;
            default:
                System.out.println("Pilihan ksosong");
                break;
        }
    }

    public static void bruteforce() {
        Scanner input12 = new Scanner(System.in);
        Pangkat[] png = new Pangkat[a];
        for (int i = 0; i < png.length; i++) {
            System.out.println("Masukan nilai yang hendak dipangkatkan: ");
            int a = input12.nextInt();
            System.out.println("Masukan nilai pemangkat: ");
            int b = input12.nextInt();
            System.out.println("=======================");
            png[i] = new Pangkat(a, b);
            
        }

        System.out.println("Hasil - Brute force: ");
        for (int i = 0; i < a; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah: "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
    }

    public static void divideConq() {
        Scanner input12 = new Scanner(System.in);
        Pangkat[] png = new Pangkat[a];
        for (int i = 0; i < png.length; i++) {
            System.out.println("Masukan nilai yang hendak dipangkatkan: ");
            int a = input12.nextInt();
            System.out.println("Masukan nilai pemangkat: ");
            int b = input12.nextInt();
            System.out.println("=======================");
            png[i] = new Pangkat(a, b);
        }
        
        System.out.println("Hasil divide and conqueror: ");
        for (int i = 0; i < a; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah: "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
