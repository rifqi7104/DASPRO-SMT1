package Minggu13;

import java.util.Scanner;

public class Kubus21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,v,l;

        System.out.print("Masukkan panjang sisi : ");
        s = sc.nextInt();
        v = hitungVol(s);
        l = hitungLuasP(s);
        System.out.println("Volume = "+v);
        System.out.println("Luas Permukaan = "+l);    
    }

    static int hitungVol (int a){
        int V = a*a*a;
        return V;
    }

    static int hitungLuasP(int b){
        int LP = 6*b*b;
        return LP;
    }
}
