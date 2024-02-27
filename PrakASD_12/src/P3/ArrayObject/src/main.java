package P3.ArrayObject.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input12 = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for (int i = 0; i < 3; i++) {

            ppArray[i] = new PersegiPanjang();
            System.out.println("persegi panjang ke- " + i );
            System.out.print("Masukan panjang: ");
            ppArray[i].panjang = input12.nextInt();
            System.out.print("Maukan lebar: ");
            ppArray[i].lebar = input12.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
