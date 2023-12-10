package Minggu14;

import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = sc.nextInt();
        int hasil = 1;

        System.out.println(hitungPangkat(bilangan, pangkat));

        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil*bilangan;
            System.out.print(bilangan+"x");
        }
        System.out.println("1 = "+hasil);
    }

    static int hitungPangkat(int x,int y){
        if (y==0) {
            return (1);
        }else {
            return(x*hitungPangkat(x, y-1));
        }
    }
}
