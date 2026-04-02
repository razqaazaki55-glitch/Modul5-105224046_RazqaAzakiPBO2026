import java.util.Scanner;

public class Karyawan {
    private String idKaryawan;
    private String nama;

    //method constructor
    public Karyawan(String idKaryawan, String nama){
        this.idKaryawan = idKaryawan;
        this.nama = nama; 
    }
    //method getter
    public String getIdKaryawan() {
        return idKaryawan;
    }
    //method setter
    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    //method getter 
    public String getNama(){
        return this.nama;
    }
    //method setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = input.nextLine();
        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        Karyawan karyawan1 = new Karyawan(idKaryawan, nama);
        System.out.println("\t");

        System.out.println("Data Karyawan\t");
        System.out.println("ID Karyawan: " + karyawan1.getIdKaryawan());
        System.out.println("Nama Karyawan: " + karyawan1.getNama());

        input.close();
    }
}
