package P6.bubble_selection_insertion.src.jobsheet6;

public class Mahasiswa {
    String nama;
    int thrMasuk, umur;
    double ipk;

    public Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thrMasuk = t;
        umur = u;
        ipk = i;
    }

    void Tampil (){
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + thrMasuk);
        System.out.println("Umur: " + umur);
        System.out.println("Ipk: " + ipk);

    }
}
