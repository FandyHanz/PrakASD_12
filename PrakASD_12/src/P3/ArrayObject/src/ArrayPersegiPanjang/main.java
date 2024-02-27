package P3.ArrayObject.src.ArrayPersegiPanjang;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int j = 0;
        Scanner input12 = new Scanner(System.in);

        System.out.print("Masukan kolom yang diinginkan: ");
        j = input12.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[j];

        for (int i = 0; i < j; i++) {

            ppArray[i] = new PersegiPanjang();
            System.out.println("persegi panjang ke- " + i );
            System.out.print("Masukan panjang: ");
            ppArray[i].panjang = input12.nextInt();
            System.out.print("Maukan lebar: ");
            ppArray[i].lebar = input12.nextInt();
        }

        for (int i = 0; i < j; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
