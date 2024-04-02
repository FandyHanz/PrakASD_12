package P6.bubble_selection_insertion.src.jobsheet6_tugas1;

public class mainhotel {
    public static void main(String[] args) {
        Hotellservice hs = new Hotellservice();
        Hotel h1 = new Hotel("rio", "Semarang", 100000, (byte) 5);
        Hotel h2 = new Hotel("savana", "Semarang", 250000, (byte) 4);
        Hotel h3 = new Hotel("utama", "Semarang", 300000, (byte) 3);
        Hotel h4 = new Hotel("grand", "Semarang", 250000, (byte) 3);
        Hotel h5 = new Hotel("taruna", "Semarang", 95000, (byte) 4);

        hs.tambah(h1);
        hs.tambah(h2);
        hs.tambah(h3);
        hs.tambah(h4);
        hs.tambah(h5);

        System.out.println("Tampilan data: ");
        hs.tampilAll();
        System.out.println();

        System.out.println("Tampilan selection harga tertinggi: ");
        hs.SelectionSortHargatertinggi();
        hs.tampilAll();
        System.out.println();

        System.out.println("Tampilan bubble harga tertinggi: ");
        hs.BubbleSortHargatinggi();
        hs.tampilAll();
        System.out.println();

        System.out.println("Tampilan selection bintang tertinggi: ");
        hs.BubblesortBintangtertinggi();
        hs.tampilAll();
        System.out.println();

        System.out.println("Tampilan selection bintang terendah: ");
        hs.BubblesortBintangTerendah();
        hs.tampilAll();
        System.out.println();

        System.out.println("Tampilan bubble bintang tertinggi: ");
        hs.BubblesortBintangtertinggi();
        hs.tampilAll();
        System.out.println();

        System.out.println("Tampilan bubble bintang terendah: ");
        hs.BubblesortBintangTerendah();
        hs.tampilAll();
        System.out.println();
    }
}
