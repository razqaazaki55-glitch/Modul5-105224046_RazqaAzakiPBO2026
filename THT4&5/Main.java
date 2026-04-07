public class Main {
    public static void main(String[] args) {
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 3);

        // Uji setter
        kamar1.setTipeKamar("Presidential");
        kamar1.setHargaPerMalam(-10000);

        KamarHotel kamar2 = new KamarHotel("102", "Premium", 2, 200000);

        // Uji overcapacity
        kamar2.pesanKamar(4);
        // Pesan sesuai kapasitas
        kamar2.pesanKamar(2);
        // Coba pesan lagi
        kamar2.pesanKamar();

        System.out.println("\nPERHITUNGAN");

        double total1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total kamar 1 : " + total1);

        double total2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total kamar 2 : " + total2);

        System.out.println("\n   STRUK AKHIR   ");

        kamar1.tampilkanInfo();
        kamar2.tampilkanInfo();
    }
}