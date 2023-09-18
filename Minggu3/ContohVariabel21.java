package Minggu3;
public class ContohVariabel21 {

    public static void main(String []args){

        String Hobi = "Berolahraga";
        boolean Mahir = true;
        char Kelamin = 'L';
        byte Umur = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println("Hobi saya adalah " + Hobi);
        System.out.println("Apakah mahir? "+ Mahir);
        System.out.println("Jenis Kelamin? " + Kelamin);
        System.out.println("Umur saya saat ini: " + Umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s",ipk, tinggi));
    }
}