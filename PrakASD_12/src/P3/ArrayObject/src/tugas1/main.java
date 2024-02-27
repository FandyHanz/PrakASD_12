package P3.ArrayObject.src.tugas1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        bola[] bl = new bola[1];
        kerucut[] kr = new kerucut[1];
        Limaspersegi[] lp = new Limaspersegi[1];

        for (int i = 0; i < 1; i++) {
            bl[i] = new bola(i);
            System.out.println("inputan bola: ");
            System.out.print("inputan jari: ");
            bl[i].jari = input12.nextInt();

            kr[i] = new kerucut(i, i);
            System.out.println("inputan kerucut: ");
            System.out.print("inputan jari: ");
            kr[i].jari = input12.nextInt();
            System.out.print("inputan sisi miring: ");
            kr[i].pelukis = input12.nextInt();

            lp[i] = new Limaspersegi(i, i);
            System.out.println("inputan limas persegi: ");
            System.out.print("inputan sisi: ");
            lp[i].sisi = input12.nextInt();
            System.out.print("inputan tinggi: ");
            lp[i].tinggi = input12.nextInt();
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("bola");
            System.out.println("volume: " + bl[i].volume());
            System.out.println("luas permukaan: " + bl[i].luasPermukaan());
            System.out.println();
            System.out.println("kerucut");
            System.out.println("volume: " + kr[i].volume());
            System.out.println("luas permukaan: " + kr[i].luasPermukaan());
            System.out.println();
            System.out.println("Limas persegi panjang");
            System.out.println("volume: " + lp[i].volume());
            System.out.println("luas permukaan: " + lp[i].luasPermukaan());
        }
    }
}
