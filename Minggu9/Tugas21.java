package Minggu9;

import java.util.Scanner;

public class Tugas21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Nilai : ");
        int jmlNilai = sc.nextInt();

        int Nilai [] = new int [jmlNilai];
        double totalNilai = 0;
        int temp = 0;

        for (int i = 0; i < Nilai.length; i++) {
            System.out.print("Masukkan Nilai ke-"+ (i+1) +" : ");
            Nilai[i] = sc.nextInt();
            totalNilai += Nilai[i];
        }
        
        for (int i = 0; i < Nilai.length; i++) {
            for (int j = 1; j < Nilai.length-i; j++) {
                if (Nilai[j-1] < Nilai[j]) {
                    // Swap Elemen
                    temp = Nilai[j];
                    Nilai[j] = Nilai[j-1];
                    Nilai[j-1] = temp;
                }
            }
        }
        System.out.println("Nilai Tertinggi : "+Nilai[0]);

        for (int i = 0; i < Nilai.length; i++) {
            for (int j = 1; j < Nilai.length-i; j++) {
                if (Nilai[j-1] > Nilai[j]) {
                    // Swap Elemen
                    temp = Nilai[j];
                    Nilai[j] = Nilai[j-1];
                    Nilai[j-1] = temp;
                }
            }
        }
        System.out.println("Nilai Terendah : "+Nilai[0]);

        double rataNilai = totalNilai / jmlNilai;
        System.out.println("Rata-rata Nilai : "+rataNilai);
    }
}
