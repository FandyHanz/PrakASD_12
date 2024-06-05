package P14.praktikum1.src;

public class node12 {
    public int data;
    node12 prev, next;
    public int jarak;

    public node12(node12 prev, int data, int jarak, node12 next){
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
