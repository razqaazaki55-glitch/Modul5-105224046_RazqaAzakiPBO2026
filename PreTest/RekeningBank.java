import java.util.Scanner;

public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        setSaldo(saldoAwal);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("Saldo tidak boleh negatif");
        }
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RekeningBank akun = new RekeningBank("123456", 0);

        System.out.print("Masukkan nominal saldo baru: ");
        double inputSaldo = input.nextDouble();

        akun.setSaldo(inputSaldo);

        System.out.println("Laporan Rekening Anda");
        System.out.println("Nomor: " + akun.getNomorRekening());
        System.out.println("Saldo saat ini: Rp" + akun.getSaldo());
        
        input.close();
    }
}