package P3.ArrayObject.src.ArraySegitiga;
import java.lang.Math;

public class segitiga {
    public int alas;
    public int tinggi;

    public segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    int hitungLuas() {
        
       return (1 / 2 * alas * tinggi);
    }

    int hitungKeliling(){
        int x = 0;
        x = (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return x;
    }
}
