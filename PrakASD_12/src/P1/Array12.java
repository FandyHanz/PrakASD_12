package P1;

import java.util.Scanner;

class Array12 {
    public static void main(String[] args) {

        Scanner input12 = new Scanner(System.in);
        String[] matkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika dasar",
                "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] nilai = new double[8];
        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        int totsks = 0;
        double totnilai = 0.0, ips = 0;
        String alphabeth[] = new String[8];
        double counted[] = new double[8];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukan nilai mata kuliah " + matkul[i] + ": ");
            nilai[i] = input12.nextDouble();
        }
        System.out.println("===================================");
        System.out.println("hasil konversi: ");
        System.out.println("===================================");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 80 && nilai[i] <= 100) {
                alphabeth[i] = "A";
                counted[i] = 4.00;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                alphabeth[i] = "B+";
                counted[i] = 3.50;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                alphabeth[i] = "B";
                counted[i] = 3.00;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                alphabeth[i] = "C+";
                counted[i] = 2.50;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                alphabeth[i] = "C";
                counted[i] = 2.00;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                alphabeth[i] = "D";
                counted[i] = 1.00;
            } else {
                alphabeth[i] = "E";
                counted[i] = 0.00;
            }
        }
        System.out.printf("%-40s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("%-40s %-20.2f %-20s %-20.2f\n", matkul[i], nilai[i], alphabeth[i], counted[i]);
        }
        System.out.println("======================");
      for (int i = 0; i < nilai.length; i++){
        totnilai += counted[i]*sks[i];
      }
        ips = totnilai / 18;
        int ips1 = (int)ips;
        float ips2 = (float)ips1;
        System.out.println("============================");
        System.out.print("ips: " + ips2);
    }
}