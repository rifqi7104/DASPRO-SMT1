package Minggu9;

import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlhMhs = input21.nextInt();

        int[] nilaiMhs = new int[jmlhMhs];
        double total = 0;
        double totalLulus=0,totalTdkLulus=0;
        int counterLulus = 0, counterTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input21.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus+=nilaiMhs[i];
                counterLulus++;
            }else{
                totalTdkLulus+=nilaiMhs[i];
                counterTdkLulus++;
            }
        }

        for(int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

        double rataLulus = (counterLulus > 0) ? totalLulus / counterLulus : 0;
        double rataTdkLulus = (counterTdkLulus > 0) ? totalTdkLulus / counterTdkLulus : 0;

        System.out.println("Mahasiswa yang lulus sebanyak "+counterLulus);
        System.out.println("Rata-rata nilai Mahasiswa Lulus = "+rataLulus);
        System.out.println("Rata-rata nilai Mahasiswa Tidak Lulus = "+rataTdkLulus);
    }
}
