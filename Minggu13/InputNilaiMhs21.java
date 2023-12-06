package Minggu13;

import java.util.Scanner;

public class InputNilaiMhs21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int Mahasiswa = input.nextInt();

        System.out.print("Masukkan jumlah minggu : ");
        int nilaiMhs = input.nextInt();

        int[][] dataNilai = new int[Mahasiswa][nilaiMhs];

        inputNilai(dataNilai);
        tampilkanNilai(dataNilai);
        int nilMax = getNilaiMax(dataNilai);
        int mingguMax = getHariMax(dataNilai);
        int mahasiswaMax = getMhsMax(dataNilai);
        System.out.println(nilMax+" adalah Nilai Tertinggi yang diperoleh Mahasiswa ke-"+mahasiswaMax+" pada Minggu ke-"+mingguMax);
    }

    public static void inputNilai (int [][] nilai){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" Minggu ke-"+(j+1)+" : ");
                nilai[i][j] = input.nextInt();
            }    
        }
        input.close();
    }

    static void tampilkanNilai (int [][] nilai){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Mahasiswa ke-"+(i+1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Minggu "+(j+1)+": "+nilai[i][j]);
            }
        }
    }

    static int getNilaiMax(int[][] nilai){
        int nilaiMax = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j]>nilaiMax) {
                    nilaiMax = nilai[i][j];
                }
            }
        }
        return nilaiMax;
    }
    
    static int getHariMax(int[][] nilai){
        int nilaiMax = nilai[0][0];
        int hariMax = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j]>nilaiMax) {
                    nilaiMax = nilai[i][j];
                    hariMax = j;
                }
            }
        }
        return hariMax+1;
    }

    static int getMhsMax(int[][] nilai){
        int nilaiMax = nilai[0][0];
        int MhsMax = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j]>nilaiMax) {
                    nilaiMax = nilai[i][j];
                    MhsMax = i;
                }
            }
        }
        return MhsMax+1;
    }
}
