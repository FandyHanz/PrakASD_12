package P11.doublelinkedlist.src;

public class node {
    public int data;
    node prev, next;

    public node(node prev, int data, node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
