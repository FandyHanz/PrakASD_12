package P1;

import java.util.Scanner;

class fungsi12 {
    public static Scanner input12 = new Scanner(System.in);
    public static String[] Toko = { "cabang 1", "cabang 2", "cabang 3", "cabang 4" };
    public static int[][] bunga = { {10, 5, 15, 7},
                                    {6, 11, 9, 12}, 
                                    {2, 10, 10, 5}, 
                                    {5, 7, 12, 9}
                                };
    public static int[] harga = {75000, 50000, 60000, 10000};
    public static String pilihan = "";
    public static void main(String[] args) {
        boolean iscont = false;
        System.out.println("pilihan: ");
        System.out.println();
        System.out.println("1. pendapatan toko habis");
        System.out.println("2. Jumlah Stock cabang ke 4");
        System.out.println();
        System.out.println("pilih: ");
        pilihan = input12.nextLine();
        switch (pilihan) {
            case "1":
            pendapatanHabis();
            System.out.print("Menu: ");
            pilihan = input12.nextLine();
            if (pilihan.equalsIgnoreCase("y")){
                iscont = true;
                break;
            }
                break;

            case "2":
            Stockbarang();
            System.out.print("Menu: ");
            pilihan = input12.nextLine();
            if (pilihan.equalsIgnoreCase("y")){
                iscont = true;
                break;
            }

                break;
        }
    }

    public static void pendapatanHabis() {

        System.out.printf("%-10s %-10s\n", "Toko", "Harga");
        int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, Harga = 0, k = 0;
        for ( int i [] : bunga){
            System.out.print("cabang ke -" + k + ": ");
           temp1 = i[0] * harga[0];
           temp2 = i[1] * harga[1];
           temp3 = i[2] * harga[2];
           temp4 = i[3] * harga[3];
           Harga = temp1 + temp2 + temp3 + temp4;
           System.out.print(Harga + "\n");
           k++;
        }

    }

    public static void Stockbarang (){
        int[] stok = {1, 2, 0, 5};
        System.out.print("Stok aglonema: "+ (bunga[3][0] - stok[0]) + "\n");
        System.out.print("Stok keladi: "+ (bunga[3][1] - stok[1]) + "\n");
        System.out.print("Stok alocasia: "+ (bunga[3][2] - stok[2]) + "\n");
        System.out.print("Stok Mawar: "+ (bunga[3][3] - stok[3]) + "\n");
    }
}
