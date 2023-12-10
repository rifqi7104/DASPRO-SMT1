package Minggu14;

import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Saldo Awal : ");
        double saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        int tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah "+tahun+" tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }

    static double hitungLaba(double saldoInvest, int lamaInvest){
        if (lamaInvest == 0) {
            return (saldoInvest);
        }else {
            return (1.11*hitungLaba(saldoInvest, lamaInvest-1));
        }
    }
}
