import java.util.Scanner;

public class MoneyManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPemasukan = 0;
        double totalPengeluaran = 0;
        double totalHutang = 0;
        double totalInvestasi = 0;

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Money Manager by FATIH ===");
            System.out.println("1. Catat Pemasukan");
            System.out.println("2. Catat Pengeluaran");
            System.out.println("3. Catat Hutang");
            System.out.println("4. Catat Investasi");
            System.out.println("5. Tampilkan Ringkasan");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah pemasukan: ");
                    double pemasukan = scanner.nextDouble();
                    scanner.nextLine(); 
                    totalPemasukan += pemasukan;
                    System.out.println("Pemasukan berhasil dicatat.");
                    break;
                case 2:
                    System.out.print("Masukkan jumlah pengeluaran: ");
                    double pengeluaran = scanner.nextDouble();
                    scanner.nextLine(); 
                    totalPengeluaran += pengeluaran;
                    System.out.println("Pengeluaran berhasil dicatat.");
                    break;
                case 3:
                    System.out.print("Masukkan jumlah hutang: ");
                    double hutang = scanner.nextDouble();
                    scanner.nextLine();
                    totalHutang += hutang;
                    System.out.println("Hutang berhasil dicatat.");
                    break;
                case 4:
                    System.out.print("Masukkan jumlah investasi: ");
                    double investasi = scanner.nextDouble();
                    scanner.nextLine(); 
                    totalInvestasi += investasi;
                    System.out.println("Investasi berhasil dicatat.");
                    break;
                case 5:
                    tampilkanRingkasan(totalPemasukan, totalPengeluaran, totalHutang, totalInvestasi);
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }

        System.out.println("Terima kasih telah menggunakan program Pencatat Uang.");
        scanner.close();
    }

    private static void tampilkanRingkasan(double totalPemasukan, double totalPengeluaran, double totalHutang, double totalInvestasi) {
        System.out.println("===== RINGKASAN =====");
        System.out.println("Total Pemasukan: " + totalPemasukan);
        System.out.println("Total Pengeluaran: " + totalPengeluaran);
        System.out.println("Total Hutang: " + totalHutang);
        System.out.println("Total Investasi: " + totalInvestasi);
        System.out.println("Total Saldo: " + (totalPemasukan - totalPengeluaran));
    }
}
