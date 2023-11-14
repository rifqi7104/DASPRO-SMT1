package Minggu11;

import java.util.Scanner;

public class NestedLoop_2341720091{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp[][] = new double[5][7];
        double rerata[] = new double[5];

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Kota ke-"+(i+1));
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print("Hari ke-"+(j+1)+" : ");
                temp[i][j] = input.nextDouble();
                rerata[i] += temp[i][j];
                
            }
            System.out.println();
        }

        for (int i = 0; i < rerata.length; i++) {
            rerata[i] /= 7;
        }
        
        for (double [] kota : temp) {
            int p = 1;
            System.out.print("Kota ke-"+p+" : ");

            for (double hari : kota) {
                System.out.print(hari+" ");
            
            }
            System.out.println();
            p++;
        }

        for (int i = 0; i < rerata.length; i++) {
            System.out.println("Rata-rata Kota ke-"+(i+1)+" : "+rerata[i]);
        }

    }
}