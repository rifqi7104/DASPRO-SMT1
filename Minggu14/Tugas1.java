package Minggu14;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        tampilDeretIterasif(angka);
        System.out.println();
        System.out.println(tampilDeretRekursif(angka));
    }

    static int tampilDeretRekursif(int n){
        if (n == 0) {
            return n;
        }else {
            System.out.print(n);
            tampilDeretRekursif(n-1);
        }
        return 0;
    }

    static void tampilDeretIterasif(int n){
        for (int i = n; i >=0; i--) {
            System.out.print(i);
        }
    }
}
