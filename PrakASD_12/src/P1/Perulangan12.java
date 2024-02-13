package P1;
import java.util.Scanner;

class Perulangan12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int n = 0;
        long nim = 0;
        System.out.print("Masukan nim: ");
        nim = input12.nextLong();

        nim %= 100;
        n = (int) nim;

        for (int i = 1; i <= n; i++){
            if (i == 6 || i == 10 ){
                continue;
            }
            if (i % 2 == 1){
                System.out.print("*");
            }
            if (i % 2 == 0){
                System.out.print(i);
            }
        }
    }
}
