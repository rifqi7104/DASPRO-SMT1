package Minggu11;

import java.util.Scanner;

public class Individu221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N (Minimal 5) : ");
        int N = sc.nextInt();

        if (N >= 5) {
            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <=i; j++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }   
        }
    }
}
