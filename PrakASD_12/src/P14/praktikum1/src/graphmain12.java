package P14.praktikum1.src;
import java.util.Scanner;

public class graphmain12 {
    public static void main(String[] args) throws Exception{
        graph12 gedung = new graph12(6);
        Scanner sc12 = new Scanner(System.in);
        int attempt = 0;

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        for (int i = attempt; i < 2; i++) {
            System.out.print("Masukan gedung asal: ");
            int asal = sc12.nextInt();
            System.out.print("Masukan gedung tujuan: ");
            int tujuan = sc12.nextInt();
            gedung.cekTetangga(asal, tujuan);
            System.out.println("");
        }
    }
}
