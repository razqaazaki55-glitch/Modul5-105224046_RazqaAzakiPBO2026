class KamarHotel {

    // =========================
    // ATRIBUT (Encapsulation)
    // =========================
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    // =========================
    // CONSTRUCTOR
    // =========================

    // Constructor 1 (kilat)
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.isTersedia = true;

        setTipeKamar(tipeKamar);
        this.hargaPerMalam = 0;
    }

    // Constructor 2 (lengkap)
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.isTersedia = true;

        setTipeKamar(tipeKamar);
        setHargaPerMalam(hargaPerMalam);
    }

    // =========================
    // GETTER
    // =========================
    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    // =========================
    // SETTER (dengan validasi)
    // =========================
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") ||
            tipeKamar.equalsIgnoreCase("Premium") ||
            tipeKamar.equalsIgnoreCase("Suite")) {

            this.tipeKamar = tipeKamar;

        } else {
            System.out.println("kamar tidak valid! Kamar diubah ke Reguler.");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("Harga yang Anda masukkan terlalu rendah, Harga diubah ke 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Kamar berhasil dipesan.");
        } else {
            System.out.println("Kamar sudah terisi.");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Kamar sudah terisi.");
        } else if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Melebihi kapasitas! Pesanan ditolak.");
        } else {
            isTersedia = false;
            System.out.println("Kamar berhasil dipesan untuk " + jumlahTamu + " tamu.");
        }
    }

    public void batalPesan() {
        isTersedia = true;
        System.out.println("Pesanan dibatalkan.");
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return jumlahMalam * hargaPerMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = jumlahMalam * hargaPerMalam;

        if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
            System.out.println("Diskon 20% berhasil digunakan.");
            return total * 0.8;
        }

        System.out.println("Voucher tidak berlaku.");
        return total;
    }

    public void tampilkanInfo() {
        System.out.println("\n===== STRUK KAMAR =====");
        System.out.println("Nomor Kamar    : " + nomorKamar);
        System.out.println("Tipe Kamar     : " + tipeKamar);
        System.out.println("Kapasitas Max  : " + kapasitasMaksimal);
        System.out.println("Harga / Malam  : " + hargaPerMalam);
        System.out.print("Status         : ");
        if (isTersedia) {
            System.out.println("Tersedia");
        } else {
            System.out.println("Terisi");
        }
        System.out.println("========================");
    }
}