package Minggu3;
public class ContohVariabel21 {

    public static void main(String []args){

        String salahsatuhobysayaadalah = "Bermain petak umpet";
        boolean ispandai = true;
        char jeniskelamin = 'L';
        byte umursekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(salahsatuhobysayaadalah);
        System.out.println("Apakah pandai?"+ispandai);
        System.out.println("Jenis Kelamin"+jeniskelamin);
        System.out.println("Umurku saat ini:"+umursekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s",$ipk, tinggi));
    }
}