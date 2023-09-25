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

        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
        
    }
}
