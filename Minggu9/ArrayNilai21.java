package Minggu9;

import java.util.Scanner;
        

public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai Akhir ke-"+i+" : ");
            nilaiAkhir [i] = input21.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }

    }
}
