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
                System.out.println("Segitiga Siku-Siku"); } 
            else if ((sudut1 == 60)&&(sudut2 == 60)&&(sudut3 == 60)) {
                System.out.println("Segitiga Sama Sisi"); }
            else if ((sudut1 == sudut2)||(sudut1 == sudut3)||(sudut2 == sudut3)){
                System.out.println("Segitiga Sama Kaki"); }
            else
                System.out.println("Segitiga Sembarang"); 
        }else 
            System.out.println("Bukan Segitiga");
    }
}
