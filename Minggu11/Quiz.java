package Minggu11;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;

            do {
                System.out.println("Tebak Angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);

                if (answer < number) {
                    System.out.println("Angka Anda lebih kecil dari jawaban asli.");
                    
                }else if(answer > number){
                    System.out.println("Angka Anda lebih besar dari jawaban asli.");
                }else if(success){
                    System.out.println("Jawaban Anda Benar !!");
                }
                
            } while (!success);
            
            System.out.println("Apakah Anda ingin mengulang permainan? (Y/y)");
            menu = input.nextLine().charAt(0);

            if (menu != 'Y' || menu != 'y') {
                menu = 'n';
            }

        } while (menu=='y'||menu=='Y');

    }
}
