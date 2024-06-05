package P14.praktikum1.src;

public class doublelinkedlist12 {
    public node12 head;
    public int size;

    public doublelinkedlist12() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new node12(null, item, jarak, null);
        } else {
            node12 newnode = new node12(null, item, jarak, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }

    int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index di luar batas");
        }
        node12 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            node12 current = head;
            while (current.next != null) {
                current = current.next;
            }
            node12 newnode = new node12(current, item, jarak, null);
            current.next = newnode;
        }
        size++;
    }

    void add(int item, int index, int jarak) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Data diluar jangkauan");
        } else {
            node12 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node12 newnode = new node12(null, item, jarak, current);
                current.prev = newnode;
                head = newnode;
            } else {
                node12 newnode = new node12(current.prev, item, jarak, current);
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
            node12 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println(" \n Data berhasil diisi");
        } else {
            System.out.println("Data kosong");
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data kosong tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data kosong tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } else {
            node12 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    void remove(int index) throws Exception {
        node12 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }

    int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data kosong tidak ada isinya");
        }
        node12 tmp = head;
        return tmp.data;
    }

    int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data kosong tidak ada isinya");
        }
        node12 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("index di luar value");
        }
        node12 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}