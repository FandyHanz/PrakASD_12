public class binarytree12 {
    public node12 root;

    public binarytree12() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new node12(data);
        } else {
            node12 current = root;
            while (!isEmpty()) {
                if (data > current.data) {
                    if (current.right == null) {
                        current.right = new node12(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else if (data < current.data) {
                    if (current.left == null) {
                        current.left = new node12(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    System.out.println("Data already exist ");
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        node12 current = root;

        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(node12 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(node12 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void transverseInOrder(node12 node) {
        if (node != null) {
            transverseInOrder(node.left);
            System.out.print(" " + node.data);
            transverseInOrder(node.right);
        }
    }

    node12 getSuccessor(node12 del) {
        node12 successor = del.right;
        node12 successorParent = del;

        while (successor.left != null) {
            successor = successor.left;
            successorParent = successor;
        }
        if (successor != del.right) {
            successor.right = del.right;
            successor = successor.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree kosong");
        } else {
            node12 parent = root;
            node12 current = root;
            boolean isLeftChild = false;
            while (current != null) {
                if (current.data == data) {
                    break;
                } else if (data > current.data) {
                    parent = current;
                    current = current.right;
                    isLeftChild = false;
                } else if (data < current.data) {
                    parent = current;
                    current = current.left;
                    isLeftChild = true;
                }
                if (current == null) {
                    System.out.println("Data tidak ditemukan");
                } else {
                    if (current.left == null && current.right == null) {
                        if (current == root) {
                            root = null;
                        } else {
                            if (isLeftChild) {
                                parent.left = null;
                            } else {
                                parent.right = null;
                            }
                        }
                    } else if (current.right == null) {
                        if (current == root) {
                            root = current.left;
                        } else {
                            if (isLeftChild){
                                parent.left = current.left;
                            } else {
                                parent.right = current.left;
                            }
                        }
                    } else {
                        node12 successor = getSuccessor(current);
                        if (isLeftChild){
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                        successor.left = current.left;
                    }
                }
            }
        }
    }
}
