class Barang {
    // Mendeklarasikan atribut
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    private String kategori;
 
    //Constructor
    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0; // Stok default
        this.hargaSatuan = 0.0; // Harga default
    }
 
    // Getter untuk idBarang
    public String getIdBarang() {
        return idBarang;
    }
 
    // Getter untuk namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }
 
    // Getter untuk stok
    public int getStok() {
        return stok;
    }
 
    // Setter untuk stok
    public void setStok(int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh kurang dari 0.");
        } else {
            this.stok = stok;
        }
    }
 
    // Getter untuk hargaSatuan
    public double getHargaSatuan() {
        return hargaSatuan;
    }
 
    // Setter untuk hargaSatuan
    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan <= 0) {
            System.out.println("Harga satuan tidak boleh kurang dari atau sama dengan 0.");
        } else {
            this.hargaSatuan = hargaSatuan;
        }
    }
 
    // Setter untuk kategori
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
 
    // Method untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Jumlah yang ditambah harus lebih dari 0.");
        }
    }

    // Method untuk mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok >= jumlah) {
                this.stok -= jumlah;
            } else {
                System.out.println("Stok tidak mencukupi.");
            }
        } else {
            System.out.println("Jumlah yang dikurangi harus lebih dari 0.");
        }
    }
 
    //Menampilkan detail barang
    public void tampilkanDetailBarang() {
        System.out.println("ID Barang: " + idBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
    }
}