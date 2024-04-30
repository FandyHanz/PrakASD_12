package P9.praktikum1.src;

import java.util.Scanner;

public class queuemain {
    static void menu() {
        System.out.println("Masukan menu yang diinginkan");
        System.out.println("1. enqueue");
        System.out.println("2. dequeue");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.out.println("5. clear");
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        boolean iscont = true;
        System.out.print("masukan kapasistas data: ");
        int n = sc12.nextInt();
        queue q = new queue(n);

        do {
            menu();
            int pilih = sc12.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("masukan data: ");
                    int dataMasuk = sc12.nextInt();
                    q.enqueque(dataMasuk);
                    break;
                case 2:
                    q.dequeque();
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                     break;
                case 5:
                    q.clear();
                    break;
                default:
                    break;
            }
        } while (iscont);
    }
}
