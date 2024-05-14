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
            node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("index di luar value");
        } else if (index == 0) {
            removeFirst();
        } else {
            node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            size--;
        }
    }

    int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data kosong tidak ada isinya");
        }
        node tmp = head;
        return tmp.data;
    }

    int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data kosong tidak ada isinya");
        }
        node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("index di luar value");
        }
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}