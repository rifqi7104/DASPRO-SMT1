package Minggu13;

import java.util.Scanner;

public class Percobaan621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang");
        p = sc.nextInt();
        System.out.println("Masukkan Lebar");
        l = sc.nextInt();
        System.out.println("Masukkan Tinggi");
        t = sc.nextInt();

        L=hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah "+L);

        vol = hitungVolume(t, l, p);
        System.out.println("Volume Balok adalah "+vol);
    }

    static int hitungLuas (int pjg,int lb){
        int Luas=pjg*lb;
        return Luas;
    }

    static int hitungVolume(int tinggi,int a,int b){
        int Vol = tinggi*a*b;
        return Vol;
    }
}
    

