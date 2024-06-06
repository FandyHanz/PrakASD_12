package P14.praktikum2.src;

public class graphMatriks12 {
    public int vertex;
    public int[][] matriks;

    public graphMatriks12(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print(" Gedung " + (char) ('A' + i) + " " + matriks[i][j] + "m");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        int inTotal = 0, outTotal = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                ++inTotal;
            }

            if (matriks[asal][i] != 0) {
                ++outTotal;
            }
        }
        System.out.println("InDegree dari gedung " + (char) ('A' + asal) + ": " + inTotal);
        System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + ": " + outTotal);
        System.out.println("Degree dari gedung " + (char) ('A' + asal) + ": " + (inTotal + outTotal));
    }
}
