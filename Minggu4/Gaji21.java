package Minggu4;

import java.util.Scanner;

public class Gaji21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;

        System.out.println("Masukkan gaji Anda ");
        gaji = sc.nextInt();
        System.out.println("Masukkan potongan gaji Anda ");
        potGaji = sc.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Anda ");
        jmlMasuk = sc.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk = sc.nextInt();

        TotGaji = (jmlMasuk*gaji) - (JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang Anda terima adalah " + TotGaji);
        
    }
}
