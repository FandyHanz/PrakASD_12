package P8.P8.src;
import java.util.Scanner;

public class postfixmain12 {
   public static void main(String[] args) {
    Scanner sc12 = new Scanner (System.in);
    String p, q;
    System.out.println("masukan ekpresi matematika (infix): ");
    q = sc12.nextLine();
    q = q.trim();
    q = q + ")";
    int total = q.length();
    postfix12 pos = new postfix12(total);
    p = pos.konversi(q);
    System.out.println("postfix: " + p);
   }
}
