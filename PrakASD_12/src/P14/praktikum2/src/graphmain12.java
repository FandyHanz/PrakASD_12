package P14.praktikum2.src;

public class graphmain12 {
    public static void main(String[] args) {
        graphMatriks12 grph = new graphMatriks12(4);
        grph.makeEdge(0, 1, 50);
        grph.makeEdge(1, 0, 60);
        grph.makeEdge(1, 2, 70);
        grph.makeEdge(2, 1, 80);
        grph.makeEdge(2, 3, 40);
        grph.makeEdge(3, 0, 90);
        grph.printGraph();
        System.out.println("Hasil setelah penghapusan edge: ");
        grph.removeEdge(2, 1);
        grph.printGraph();
    }
}
