package Minggu10;

public class Numbers21 {
    public static void main(String[] args) {
        int [][] MyNumbers = new int[3][];
        MyNumbers[0] = new int[5];
        MyNumbers[1] = new int[3];
        MyNumbers[2] = new int[1];
        
        for (int i = 0; i < MyNumbers.length; i++) {
            System.out.println("Panjang Baris ke-"+(i+1)+" : "+ MyNumbers[i].length);
            
        }
    }
}
