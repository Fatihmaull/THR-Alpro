import java.util.Scanner;

public class PHitungUangCukup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga barang (dalam Rupiah): ");
        int hargaBarang = scanner.nextInt();

        System.out.print("Masukkan jumlah uang yang Anda miliki (dalam Rupiah): ");
        int jumlahUang = scanner.nextInt();

        int jumlahBarang = jumlahUang / hargaBarang; // Menghitung jumlah barang yang bisa dibeli

        System.out.println("Dengan uang sebesar " + jumlahUang + " Rupiah, Anda bisa membeli " + jumlahBarang + " buah.");

        scanner.close();
    }
}
