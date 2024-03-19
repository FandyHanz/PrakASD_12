package P5.BruteForceDivideConquer.src.Minggu5.Percobaan2;
import java.util.Scanner;
public class mainPangkat {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);

        System.out.println("-----------------");
        System.out.println("Masukan jumlah elemen yang mau dihitung: ");
        int elemen = input12.nextInt();
        System.out.println("-----------------");

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukan nilai yang hendak dipangkatkan: ");
            int a = input12.nextInt();
            System.out.println("Masukan nilai pemangkat: ");
            int b = input12.nextInt();
            System.out.println("=======================");
            png[i] = new Pangkat(a, b);
        }

        System.out.println("Hasil - Brute force: ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("Hasil divide and conqueror: ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
