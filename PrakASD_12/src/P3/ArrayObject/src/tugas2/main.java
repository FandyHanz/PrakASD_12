package P3.ArrayObject.src.tugas2;
import java.util.Scanner;

public class main {
    public static double [] data = new double [3];
    public static double sum = 0;
    public static double max = 0;
    public static void main(String[] args) {
        Scanner Strinput12 = new Scanner (System.in);
        Scanner Intinput12 = new Scanner (System.in);
        penampilDataMahasiswa[] pdm = new penampilDataMahasiswa[3];

        for (int i = 0; i < 3; i++) {
            pdm[i] = new penampilDataMahasiswa();
            System.out.println("Masukan data Mahasiswa ke -" + (i + 1) + ": " );
            System.out.print("Masukan nama: ");
            pdm[i].nama = Strinput12.nextLine();
            System.out.print("Masukan nim: ");
            pdm[i].nim =Intinput12.nextLong();
            System.out.print("Masukan jenis kelamin: ");
            pdm[i].jenisKelamin = Strinput12.nextLine();
            System.out.print("Masukan ipk: ");
            pdm[i].ipk = Intinput12.nextDouble();
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("data Mahasiswa ke -" + (i + 1) + ": " );
            System.out.print("Nama: " + pdm[i].nama + "\n");
            System.out.print("nim: " + pdm[i].nim + "\n");
            System.out.print("Jenis kelamin: " + pdm[i].jenisKelamin + "\n");
            System.out.print("Ipk: " + pdm[i].ipk + "\n");
            System.out.println();
        }
        for (int i = 0; i < pdm.length; i++) {
            data[i] = pdm[i].ipk;
        }
        rerata(data);
        pencarirata(data);
    }
    public static void rerata (double nilai[]){
        for (int i = 0; i < nilai.length; i++) {
            sum += nilai[i];
        }
        System.out.println("total rata rata ipk para mahasiswa sekitar: " + sum / nilai.length);
    }

    public static void pencarirata (double nilai[]){
        int column= 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max){
                column = i;
                max = nilai[column];
            }
        }
        System.out.println("pemegang dengan ipk sebesar " + max );
    }
}
