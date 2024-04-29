package P8.P8.src;

public class Stackkonversi {
    public int size;
    public int[] tumpukanBiner;
    public int top;

    public Stackkonversi() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push (int data) {
        if (isFull()) {
            System.out.println("stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    int pop (){
        if (isEmpty()){
            System.out.println("stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
