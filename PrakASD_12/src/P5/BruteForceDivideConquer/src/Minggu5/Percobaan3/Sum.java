package P5.BruteForceDivideConquer.src.Minggu5.Percobaan3;

public class Sum {
    public int elemen;
    public double keuntungan[], total;

    public Sum (int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = total;
    }
    public double TotalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public double TotalDC(double arr[], int l, int r){
        if (l == r){
            return arr[l];
        }
        else if (l < r){
            int mid = (l + r) / 2;
            double lsum = TotalDC(arr, l, mid);
            double rsum = TotalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
