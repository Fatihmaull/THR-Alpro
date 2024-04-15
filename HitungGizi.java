import java.util.Scanner;

public class HitungGizi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hitung Gizi Makanan anda!");
        System.out.println("Silakan masukkan makanan yang Anda konsumsi hari ini.");

        // Input makanan dan gizi
        System.out.print("Nama makanan: ");
        String namaMakanan = scanner.nextLine();

        System.out.print("Jumlah kalori: ");
        double kalori = scanner.nextDouble();

        System.out.print("Jumlah karbohidrat (gram): ");
        double karbohidrat = scanner.nextDouble();

        System.out.print("Jumlah protein (gram): ");
        double protein = scanner.nextDouble();

        System.out.print("Jumlah lemak (gram): ");
        double lemak = scanner.nextDouble();

        // Hitung total gizi
        double totalGizi = kalori + (karbohidrat * 4) + (protein * 4) + (lemak * 9);

        // Cetak hasil
        System.out.println("\n===== RINGKASAN GIZI =====");
        System.out.println("Nama Makanan: " + namaMakanan);
        System.out.println("Kalori: " + kalori);
        System.out.println("Karbohidrat: " + karbohidrat + " gram");
        System.out.println("Protein: " + protein + " gram");
        System.out.println("Lemak: " + lemak + " gram");
        System.out.println("Total Gizi: " + totalGizi + " kalori");

        scanner.close();
    }
}
