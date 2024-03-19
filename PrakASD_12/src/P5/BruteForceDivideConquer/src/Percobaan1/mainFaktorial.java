package P5.BruteForceDivideConquer.src.Percobaan1;
import java.util.Scanner;
public class mainFaktorial {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);

        System.out.println("------------");
        System.out.print("masukan jumlah elemen: ");
        int ijml = input12.nextInt();

        Faktorial[] Fk = new Faktorial[10];
        for (int i = 0; i < ijml; i++) {
            Fk[i] = new Faktorial();
            System.out.println("Masukan nilai data ke -" + (i+1) + ": ");
            Fk[i].nilai = input12.nextInt();
        }

        System.out.println("Hasil - Brute force: ");
        for (int i = 0; i < ijml; i++) {
            System.out.println("hasil pengurangan menggunakan bruteforce adalah: " + Fk[i].faktorialBF(Fk[i].nilai));
        }
        System.out.println("Hasil divide and conqueror: ");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil penghurangan menggunakan sistem divide and conqueror: " + Fk[i].faktorialDC(Fk[i].nilai));
        }
    }
}
