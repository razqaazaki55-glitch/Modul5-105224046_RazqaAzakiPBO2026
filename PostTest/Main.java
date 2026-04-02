public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang("001", "TV LED");
 
        //Menggunakan setter untuk mengatur data dengan benar
        //barang.setStok(50);  Stok tidak bisa diubah secara langsung menjadi 50, karena menggunakan method setter otomatis 
        // akan diperiksa terlebih dahulu oleh method setter sebelum disimpan, sehingga nilai tidak sesuai aturan akan ditolak oleh sistem. 
        barang.setHargaSatuan(1500000);
        barang.setKategori("Elektronik");
 
        //Mencoba merusak sistem
        barang.setHargaSatuan(-500); // Salah, harga tidak boleh negatif
        barang.kurangiStok(15); // Menampilkan pesan stok tidak mencukupi
 
        //Menampilkan detail barang
        barang.tampilkanDetailBarang(); // Menampilkan detail barang yang telah diisi
    }
}