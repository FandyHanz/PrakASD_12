package P5.BruteForceDivideConquer.src.Minggu5.Percobaan3;

public class Sum {
    public static int elemen;
    public static double keuntungan[], total;

    public Sum (int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = total;
    }
    public static double TotalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public static double TotalDC(double arr[], int l, int r){
        if (l == r){
            return arr[l];
        }
        else if (l < r){
            int mid = (l / r) + 2;
            double lsum = TotalDC(arr, l, mid - r);
            double rsum = TotalDC(arr, mid + l, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
