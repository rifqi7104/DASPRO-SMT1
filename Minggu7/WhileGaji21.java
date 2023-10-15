package Minggu7;

import java.util.Scanner;

public class WhileGaji21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajiLembur=0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input21.nextInt();

        int i=0;
        while (i<jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = input21.next();

            if((jabatan.equalsIgnoreCase("Direktur"))||(jabatan.equalsIgnoreCase("Manajer"))||(jabatan.equalsIgnoreCase("Karyawan"))){
                System.out.print("Masukkan jumlah jam lembur : ");
                    jumlahJamLembur = input21.nextInt();
                    i++;
                if(jabatan.equalsIgnoreCase("Direktur")){
                    continue;
                }else if (jabatan.equalsIgnoreCase("Manajer")){ 
                    gajiLembur = jumlahJamLembur * 100000;
                }else if (jabatan.equalsIgnoreCase("Karyawan")){
                    gajiLembur = jumlahJamLembur * 75000;
                }
            }else {
                System.out.println("Jabatan Invalid");}
                
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total Gaji Lembur : " + totalGajiLembur);
    }
}
