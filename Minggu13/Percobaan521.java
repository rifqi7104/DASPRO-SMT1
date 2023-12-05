package Minggu13;

public class Percobaan521 {

   static void Tampil(int... a, String... nama) {
      for (String n : nama) {
         System.out.println(n);
      }
      for (int i : a) {
         System.out.println(i);
      }
   }

   public static void main(String[] args) {
      Tampil (1,2,3,"Caca","Budi");
   }
}
