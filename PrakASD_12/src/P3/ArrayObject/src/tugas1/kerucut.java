package P3.ArrayObject.src.tugas1;

import java.lang.Math;

public class kerucut {
    public int jari, pelukis;

    public kerucut(int j, int p) {
        jari = j;
        pelukis = p;

    }

    double volume() {
        double x = 0.0;
        x = Math.sqrt(((pelukis * pelukis) - (jari * jari)));
        return (1.0 / 3) * Math.PI * Math.pow(jari, 2) * x;
    }

    int luasPermukaan(){
        return (int) ((3.14 * jari * pelukis) + (3.14 * jari * jari));
    }
}
