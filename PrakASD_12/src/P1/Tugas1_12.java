package P1;

import java.util.Scanner;
import java.util.*;

class Tugas1_12 {
    public static void main(String[] args) {
        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] kota = { { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };
        Scanner input12 = new Scanner(System.in);
        char plat;
        int row = 0;

        System.out.print("Masukan kode plat: ");
        plat = input12.next().charAt(0);
        for (int i = 0; i < kode.length; i++) {
            if (plat == kode[i]) {
                row = i;
            }
        }
        for (int i = 0; i < kota.length; i++){
            for (int j = 0; j < kota[0].length; j++) {
                System.out.print(kota[row][j]);
            }
            break;
        }
    }
}
