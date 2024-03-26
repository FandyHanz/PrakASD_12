package P6.bubble_selection_insertion.src.jobsheet6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    int idx;

    void Tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void Tampil() {
        for (Mahasiswa m : listMhs) {
            m.Tampil();
            System.out.println("------------------");
        }
    }

    void BubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void Selectionsort(){
        for (int i = 0; i < listMhs.length -1; i++) {
            int idxmin = 1;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void Insertionsort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while ((j > 0) && listMhs[j-1].ipk > temp.ipk){
                listMhs[j] = listMhs[j -1];
                j--;
            }
            listMhs[j] = temp;    
            }
        }
    }

