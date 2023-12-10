package Minggu14;

public class Tugas4 {
    public static void main(String[] args) {
        int n = 12;
        int jumlah = fibonacci(n);

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-"+n+" adalah "+jumlah);
    }

    public static int fibonacci (int a){
        if (a <= 1) {
            return a;
        }else {
            return fibonacci(a-1) + fibonacci(a-2);
        }
    }
}
