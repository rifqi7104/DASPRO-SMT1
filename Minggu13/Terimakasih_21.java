package Minggu13;

public class Terimakasih_21 {
    public static void UcapanTerimaKasih() {
        System.out.println("Thank you for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        System.out.println("Thank you for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
        // UcapanTerimaKasih();
        String ucapan = "Terimakasih Pak... Bu... Semoga sehat selalu";
        UcapanTambahan(ucapan);
    }
}
