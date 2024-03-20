package P5.BruteForceDivideConquer.src.Minggu5.Percobaan3;
import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan juta misal 5.9):");
        System.out.print("Masukan jumlah bulan: ");
        int elm = input12.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukan untung bulan ke -" + (i+1) + ": ");
            sm.keuntungan[i] = input12.nextDouble();
        }

        System.out.println("Agloritma bruteforce");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah: " + sm.TotalBF(sm.keuntungan));
        System.out.println("Agloritma divide and conqueror");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah: " + sm.TotalDC(sm.keuntungan, 0, sm.elemen -1));
    }
}
