import java.util.Scanner;

public class Karyawan {
    private String idKaryawan;
    private String nama;
    private double gajiPokok; //soal no.2
    private String departemen; //soal no. 3 

    //Soal no. 1 
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
    //getter gaji pokok
    public double getGajiPokok(){
        return this.gajiPokok;
    }
    //soal no. 2 getter gaji pokok
    public void getGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    //setter gaji pokok
    public void setGajiPokok(double gajiPokok){
        if(gajiPokok < 0){
            System.out.printf("sistem menolak nominal yang Anda masukkan kurang dari nol");
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void tampilkanDataKaryawan() {
        System.out.println("\nProfil Lengkap Karyawan");
        System.out.println("ID Karyawan  : " + this.idKaryawan);
        System.out.println("Nama Karyawan: " + this.nama);
        System.out.println("Departemen   : " + this.departemen);
        System.out.println("Gaji Pokok   : " + this.gajiPokok);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = input.nextLine();
        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        Karyawan karyawan1 = new Karyawan(idKaryawan, nama);

         //soal no. 2
        double gajiPokok1;
        do {
            System.out.print("Masukkan Gaji Pokok Karyawan: ");
            gajiPokok1 = input.nextDouble();
            karyawan1.setGajiPokok(gajiPokok1);
        } while (gajiPokok1 < 0);

        //soal no. 3
        input.nextLine();
        System.out.print("Masukkan Departemen: ");
        String departemen = input.nextLine();
        karyawan1.setDepartemen(departemen);

        karyawan1.tampilkanDataKaryawan();
        
        
        input.close();
    }
}
