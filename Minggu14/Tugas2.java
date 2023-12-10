package Minggu14;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N : ");
        int f = sc.nextInt();
        System.out.println(hitungRekursif(f));
    }

    static int hitungRekursif(int n){
        if (n == 0) {
            return n;
        }else {
            return n + hitungRekursif(n-1);           
        }
    }
}

