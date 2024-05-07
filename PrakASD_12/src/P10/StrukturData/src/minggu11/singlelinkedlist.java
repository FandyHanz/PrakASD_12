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

    void insertAfter(int key, int input){
        node nodeinpt = new node(input,null);
        node temp = head;
        do{
            if(temp.data == key){
                nodeinpt.next = temp.next;
                temp.next = nodeinpt;
                if(nodeinpt.next == null){
                    tail = nodeinpt;
                }
                break;
            }
            temp = temp.next;
        } while(temp == null);
    }

    void insertAt(int index, int input){
        node nodeinpt = new node();
        if (index < 0){
            System.out.println("indeks non valid");
        } else if (index == 0){
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if (temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
