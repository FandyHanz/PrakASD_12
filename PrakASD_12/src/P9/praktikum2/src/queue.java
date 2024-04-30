package P9.praktikum2.src;

public class queue {
    public nasabah[] data;
    public int front, rear, size, max;

    public queue(int n) {
        max = n;
        data = new nasabah[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("data terdepan adalah: " + data[front].norek + " " + data[front].nama + " "
                    + data[front].umur + " " + data[front].alamat + " " + data[front].saldo);
        } else {
            System.out.println("data kososng");
        }
    }

    void peekRear(){
        if (!isEmpty()) {
            System.out.println("data paling belakang adalah: " + data[rear].norek + " " + data[rear].nama + " "
                    + data[rear].umur + " " + data[rear].alamat + " " + data[rear].saldo);
        } else {
            System.out.println("data kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("data masih kosong ");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i].norek + " " + data[i].nama + " " + data[i].umur + " " + data[i].alamat + " "
                        + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.print(data[i].norek + " " + data[i].nama + " " + data[i].umur + " " + data[i].alamat + " "
                    + data[i].saldo);
            System.out.println("jumlah elemen: " + size);
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("data berhasil dikosongkan");
        } else {
            System.out.println("data masih kosong");
        }
    }

    void enqueque(nasabah dt) {
        if (isFull()) {
            System.out.println("data sudah penuh");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    nasabah dequeque() {
        nasabah dt = new nasabah();
        if (isEmpty()) {
            System.out.println("data masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
