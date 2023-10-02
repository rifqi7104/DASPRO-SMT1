package Minggu6;

import java.util.Scanner;

public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int sudut1, sudut2, sudut3, totalSudut;

        System.out.println("Masukkan Sudut 1 : ");
        sudut1 = input21.nextInt();
        System.out.println("Masukkan Sudut 2 : ");
        sudut2 = input21.nextInt();
        System.out.println("Masukkan Sudut 3 : ");
        sudut3 = input21.nextInt();
        
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90)||(sudut2 == 90)||(sudut3 == 90)) {
                System.out.println("Segitiga Siku-Siku");   
            } else {
                System.out.println("Bukan Segitiga Siku-Siku");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}
