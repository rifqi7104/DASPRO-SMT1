package Minggu10;

import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String penonton[][] = new String[4][2];
        String nama,next=null;
        int kolom,baris,menu;

        while (true) {  
            System.out.println("\nMenu    ");
            System.out.println("1 : Input Data Penonton");
            System.out.println("2 : Tampilkan Daftar Penonton");
            System.out.println("3 : Exit");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            System.out.print("\n");  
        
                switch (menu) {
                    case 1:
                        do {
                            System.out.print("Masukkan Nama : ");
                            nama = sc.next();
                            System.out.print("Masukkan Baris : ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan Kolom : ");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            
                            if(penonton[baris-1][kolom-1] == null){
                                penonton[baris-1][kolom-1] = nama;
                                System.out.print("Input penonton lainnya? (y/n)");
                                next = sc.nextLine();                                
                            } else{
                                System.out.println("Maaf, kursi yang Anda pilih tidak tersedia.");
                                System.out.println("Silahkan Coba Lagi.");
                                continue;
                            }

                        } while (next.equalsIgnoreCase("y"));
                        break;

                    case 2:
                        System.out.println("Daftar Penonton :");
                        
                        for (int i = 0; i < penonton.length; i++) {
                            for (int j = 0; j < penonton[i].length; j++) {
                                if(penonton[i][j] == null){
                                    penonton[i][j] = "***";
                                }
                            }
                            System.out.println("Penonton Baris ke-"+(i+1)+" : "+ String.join(" , ", penonton[i]));
                        }
                        break;

                    case 3:
                        return;
                }
        }

    }
}
