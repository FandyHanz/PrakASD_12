package P10.StrukturData.src.minggu11;

public class singlelinkedlist {
    public node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("isi linkedlist: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("linked list kosong");
        }
    }

    void addFirst(int input) {
        node nodeinpt = new node(input, null);
        if (isEmpty()) {
            head = nodeinpt;
            tail = nodeinpt;
        } else {
            nodeinpt.next = head;
            head = nodeinpt;
        }
    }

    void addLast(int input) {
        node nodeinpt = new node(input, null);
        if (!isEmpty()) {
            tail.next = nodeinpt;
            tail = nodeinpt;
        } else {
            head = nodeinpt;
            tail = nodeinpt;
        }
    }

    void insertAfter(int key, int input) {
        node nodeinpt = new node(input, null);
        node temp = head;
        do {
            if (temp.data == key) {
                nodeinpt.next = temp.next;
                temp.next = nodeinpt;
                if (nodeinpt.next == null) {
                    tail = nodeinpt;
                }
                break;
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, int input) {
        node nodeinpt = new node();
        if (index < 0) {
            System.out.println("indeks non valid");
        } else if (index == 0) {
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    int getData(int index) {
        node tmp = head;
        for (int i = 0; i < index -1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key) {
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("data kosong");
        }else if (head == tail){
            head = tail =  null;
        }else{
            node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            node temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
