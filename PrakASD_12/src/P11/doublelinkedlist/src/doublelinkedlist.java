package P11.doublelinkedlist.src;

public class doublelinkedlist {
    public node head;
    public int size;

    public doublelinkedlist() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item) {
        if (isEmpty()) {
            head = new node(null, item, null);
        } else {
            node newnode = new node(null, item, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }

    void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            node newnode = new node(current, item, null);
            current.next = newnode;
        }
        size++;
    }

    void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Data diluar jangkauan");
        } else {
            node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node newnode = new node(null, item, current);
                current.prev = newnode;
                head = newnode;
            } else {
                node newnode = new node(current.prev, item, current);
                newnode.prev = current.prev;
                newnode.next = current;
                current.prev.next = newnode;
                current.prev = newnode;
            }
        }
        size++;
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println(" \n Data berhasil diisi");
        } else {
            System.out.println("Data kosong");
        }
    }
}