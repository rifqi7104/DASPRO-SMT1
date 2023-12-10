package Minggu14;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = sc.nextInt();

        boolean hasil = cekPrima(n);
        if (hasil) {
            System.out.println("Bilangan "+n+" merupakan bilangan prima.");
        } else {
            System.out.println("Bilangan "+n+" bukan merupakan bilangan prima.");
        }
        sc.close();
    }

    public static boolean cekPrima (int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
