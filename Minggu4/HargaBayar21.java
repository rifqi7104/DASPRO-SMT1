package Minggu4;

import java.util.Scanner;

public class HargaBayar21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merkBuku;
        int harga, jumlah, jmlHalBuku;
        double diskon, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku yang dibeli : ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli : ");
        jmlHalBuku = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan diskon : ");
        diskon = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * diskon;
        bayar = total - jmlDis;

        System.out.println("Merk Buku : " + merkBuku);
        System.out.println("Jumlah Halaman : " + jmlHalBuku);
        System.out.println("Diskon yang Anda dapatkan sebesar " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

    }
}
