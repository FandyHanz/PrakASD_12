package P10.StrukturData.src.minggu11;

public class sllmain {
    public static void main(String[] args) {
        singlelinkedlist sgl = new singlelinkedlist();
        sgl.print();
        sgl.addFirst(890);
        sgl.print();;
        sgl.addLast(760);
        sgl.print();
        sgl.addFirst(700);
        sgl.print();
        sgl.insertAfter(700, 999);
        sgl.print();
        sgl.insertAt(3, 833);
        sgl.print();
        System.out.println("Data pada indeks ke 1: " + sgl.getData(1));
        System.out.println("Data 3 terletak pada indeks ke: " + sgl.indexOf(760));
        sgl.remove(999);
        sgl.print();
        sgl.removeAt(0);
        sgl.print();
        sgl.removeFirst();
        sgl.print();
        sgl.removeLast();
        sgl.print();
    }
}
