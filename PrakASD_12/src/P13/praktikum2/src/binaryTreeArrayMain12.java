public class binaryTreeArrayMain12 {
    public static void main(String[] args) {
        binaryTreeArray12 btr12 = new binaryTreeArray12();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        btr12.populateData(data, idxLast);
        System.out.print("\n idx in order traversal: ");
        btr12.traverseInOrder(0);
        System.out.println("\n");
    }
}
