public class binarytreemain12 {
    public static void main(String[] args) {
        binarytree12 btr12 = new binarytree12();
        btr12.add(6);
        btr12.add(4);
        btr12.add(8);
        btr12.add(4);
        btr12.add(3);
        btr12.add(5);
        btr12.add(7);
        btr12.add(9);
        btr12.add(10);
        btr12.add(15);
        System.out.print("PreOrder Traversal: ");
        btr12.traversePreOrder(btr12.root);
        System.out.println("");
        System.out.print("inOrder Traversal: ");
        btr12.transverseInOrder(btr12.root);
        System.out.println("");
        System.out.print("PostOrder Traversal: ");
        btr12.traversePostOrder(btr12.root);
        System.out.println("");
        System.out.println("Find Node: " + btr12.find(5));
        System.out.println("Delete Node 8 ");
        btr12.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal: ");
        btr12.traversePreOrder(btr12.root);
        System.out.println("");
    }
}
