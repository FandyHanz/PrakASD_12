package P3.ArrayObject.src.ArraySegitiga;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];
        Scanner input12 = new Scanner (System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke -" + i + ": ");
            sgArray[i] = new segitiga(i, i);
            System.out.print("Masukan tinggi ke -" + i + ": ");
            sgArray[i].tinggi = input12.nextInt();
            System.out.print("Masukan alas ke -" + i + ": ");
            sgArray[i].alas = input12.nextInt();

        }
    }
}
