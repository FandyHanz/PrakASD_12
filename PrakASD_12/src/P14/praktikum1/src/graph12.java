package P14.praktikum1.src;

public class graph12 {
    public int vertex;
    doublelinkedlist12 list[];

    public graph12(int v) {
        vertex = v;
        list = new doublelinkedlist12[v];
        for (int i = 0; i < v; i++) {
            list[i] = new doublelinkedlist12();
        }
    }

    void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    void degree(int asal) throws Exception {
        int k = 0, totalInt = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalInt;
                }
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("inDegree Dari gedung " + (char) ('A' + asal) + ": " + totalInt);
        System.out.println("outDegree Dari gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree Dari gedung " + (char) ('A' + asal) + ": " + (totalInt + totalOut));
    }

    void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("graf berhasil dikosongkan");
    }
    void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0){
                System.out.println("Gedung " + (char) ('A' + i ) + " terhubung dengan ");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) +"m), ");
                }
                System.out.println("");
            }
        }
        System.out.println();
    }
}
