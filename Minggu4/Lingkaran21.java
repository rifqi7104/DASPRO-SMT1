package Minggu4;

import java.util.Scanner;

public class Lingkaran21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;
        double keliling,luas,phi = 3.14;

        System.out.print("Masukkan jari-jari lingkaran : ");
        r = sc.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println(keliling);
        System.out.println(luas);
        
    }
    
}
