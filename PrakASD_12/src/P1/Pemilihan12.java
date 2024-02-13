package P1;
import java.util.Scanner;

class Pemilihan12 {
    public static void main(String[] args) {

        Scanner input12 = new Scanner(System.in);
        double tugas = 0.0, kuis = 0.0, uts = 0.0, uas = 0.0, hasilAKhir = 0.0, hasiltugas = 0.0, hasilkuis = 0.0, hasiluts = 0.0, hasiltuas = 0.0;
        String alphabeth = " ", status = " ";

        System.out.print("Masukan nilai tugas: ");
        tugas = input12.nextDouble();
        System.out.print("Masukan nilai kuis: ");
        kuis = input12.nextDouble();
        System.out.print("Masukan nilai uts: "); 
        uts = input12.nextDouble();
        System.out.print("Masukan nilai uas: ");
        uas = input12.nextDouble();

        if (tugas <= 100 && kuis <= 100 && uts <=100 && uas <= 100) {
           hasiltugas = tugas * 0.2;
           hasilkuis = kuis * 0.2;
           hasiluts = uts * 0.3;
           hasiltuas = uas * 0.3;
    
            hasilAKhir = hasiltugas + hasilkuis + hasiltuas + hasiluts;
    
            if (hasilAKhir > 80 && hasilAKhir <= 100) {
                alphabeth = "A";
                status = "Lulus";
            }
            else if (hasilAKhir > 73 && hasilAKhir <= 80){
                alphabeth = "B+";
                status = "Lulus";
            }
            else if (hasilAKhir > 65 && hasilAKhir <= 73){
                alphabeth = "B";
                status = "Lulus";
            }
            else if (hasilAKhir > 60 && hasilAKhir <= 65){
                alphabeth = "C+";
                status = "Lulus";
            }
            else if (hasilAKhir > 50 && hasilAKhir <= 60){
                alphabeth = "C";
                status = "Lulus";
            }
            else if (hasilAKhir > 39 && hasilAKhir <= 50){
                alphabeth = "D";
                status = "Tidak Lulus";
            }
            else if ( hasilAKhir <= 39){
                alphabeth = "E";
                status = "Tidak Lulus";
            }

            System.out.print("Nilai akhir: " + hasilAKhir + "\n");
            System.out.print("Niliai huruf: " + alphabeth + "\n");
            System.out.print("Anda dinyatakan: " + status );
        }
          
        else {
            System.out.println("nilai tidak valid ");
        }
        input12.close();
    }
}
