import java.util.Scanner;

public class KalkulatorMataUang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KURS_DOLAR = 16000; // 1 dollar = 16000 Rupiah

        System.out.println("Selamat datang di Kalkulator KURS!");
        System.out.println("Kurs dolar saat ini adalah 1 dollar = 16000 Rupiah.");

        System.out.println("Pilih mata uang untuk dikonversi:");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Poundsterling (GBP)");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = scanner.nextInt();

        double kurs = 0;
        String mataUang = "";

        switch (pilihan) {
            case 1:
                kurs = KURS_DOLAR;
                mataUang = "Dolar (USD)";
                break;
            case 2:
                System.out.print("Masukkan kurs Euro terhadap Rupiah: ");
                kurs = scanner.nextDouble();
                mataUang = "Euro (EUR)";
                break;
            case 3:
                System.out.print("Masukkan kurs Poundsterling terhadap Rupiah: ");
                kurs = scanner.nextDouble();
                mataUang = "Poundsterling (GBP)";
                break;
            default:
                System.out.println("Pilihannya ngaco");
                System.exit(0);
        }

        System.out.print("Masukkan jumlah uang dalam " + mataUang + ": ");
        double jumlahUang = scanner.nextDouble();

        double hasilKonversi = jumlahUang * (1 / kurs);

        System.out.println("Hasil konversi ke Rupiah: " + hasilKonversi + " Rupiah.");

        scanner.close();
    }
}
