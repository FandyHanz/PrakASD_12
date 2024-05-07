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
    }
}
