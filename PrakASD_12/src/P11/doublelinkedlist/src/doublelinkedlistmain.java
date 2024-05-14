package P11.doublelinkedlist.src;

public class doublelinkedlistmain {
    public static void main(String[] args) throws Exception {
        doublelinkedlist dll = new doublelinkedlist();
        dll.print();
        System.out.println("size: " + dll.size);
        System.out.println("=============================");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("size: " + dll.size);
        System.out.println("=============================");
        dll.removeFirst();
        dll.print();
        System.out.println("size: " + dll.size);
        System.out.println("=============================");
        dll.removeLast();
        dll.print();
        System.out.println("size: " + dll.size);
        System.out.println("=============================");
        dll.remove(1);
        dll.print();
        System.out.println("size: " + dll.size);
        System.out.println("=============================");
    }
}
