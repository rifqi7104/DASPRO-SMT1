package Minggu5;

import java.util.Scanner;

public class PemilihanPercobaan221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = input21.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = input21.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = input21.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = input21.nextFloat();

        float total = (uas * 0.4F)+(uts * 0.4F)+(kuis * 0.1F)+(tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        if (total > 80 && total <= 100){
            System.out.println("Nilai Akhir = " + total + " (A) sehingga " + message);
        }
        else if (total > 73 && total <= 80){
            System.out.println("Nilai Akhir = " + total + " (B+) sehingga " + message);
        }
        else if (total > 65 && total <= 73){
            System.out.println("Nilai Akhir = " + total + " (B) sehingga " + message);
        }
        else if (total > 60 && total <= 65){
            System.out.println("Nilai Akhir = " + total + " (C+) sehingga " + message);
        }
        else if (total > 50 && total <= 60){
            System.out.println("Nilai Akhir = " + total + " (C) sehingga " + message);
        }
        else if (total > 39 && total <= 50){
            System.out.println("Nilai Akhir = " + total + " (D) sehingga " + message);
        }
        else{ 
            System.out.println("Nilai Akhir = " + total + "(E) sehingga " + message);
        }
    }
}
