package P6.bubble_selection_insertion.src.jobsheet6;

public class main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();

        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.Tambah(m1);
        list.Tambah(m2);
        list.Tambah(m3);
        list.Tambah(m4);
        list.Tambah(m5);

        System.out.println("Data Mahasiswa sorting: ");
        list.Tampil();

        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk: ");
        list.BubbleSort();
        list.Tampil();
    }
}
