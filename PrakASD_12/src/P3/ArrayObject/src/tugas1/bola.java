package P3.ArrayObject.src.tugas1;

public class bola {
    public int jari;

    public bola (int j){
        jari = j;
    }

    int volume (){
        return (int)(4/3 * 3.14 * jari * jari * jari);
    }

    int luasPermukaan(){
        return (int)(4 * (3.14 * jari * jari));
    }
}
