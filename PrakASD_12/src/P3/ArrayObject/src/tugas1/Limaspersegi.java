package P3.ArrayObject.src.tugas1;
import java.lang.Math;
public class Limaspersegi {
    public int sisi, tinggi;

    public Limaspersegi (int s, int t){
        sisi = s;
        tinggi = t;
    }

    double volume (){
        return (1.0 / 3) * Math.pow(sisi, 2) * tinggi;
    }

    int luasPermukaan (){
        int x = 0;
        int y = (1/2 * sisi);
        int z = 0;
        x = (int)Math.sqrt((y * y) + (tinggi * tinggi));
        z = (int)(4 * (1/2 * x * sisi));

        return (sisi * sisi) + z;
    }
}
