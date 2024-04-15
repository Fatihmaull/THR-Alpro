import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CatatSandi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> pencatatKataSandi = new HashMap<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("===== PROGRAM CATAT KATA SANDI =====");
            System.out.println("1. Tambah Kata Sandi");
            System.out.println("2. Lihat Kata Sandi");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    tambahKataSandi(scanner, pencatatKataSandi);
                    break;
                case 2:
                    lihatKataSandi(pencatatKataSandi);
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }

        System.out.println("Terima kasih telah menggunakan program Pencatat Kata Sandi.");
        scanner.close();
    }

    private static void tambahKataSandi(Scanner scanner, Map<String, String> pencatatKataSandi) {
        System.out.print("Masukkan nama situs/web: ");
        String situs = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String kataSandi = scanner.nextLine();

        pencatatKataSandi.put(situs, kataSandi);
        System.out.println("Kata sandi untuk situs " + situs + " berhasil ditambahkan.");
    }

    private static void lihatKataSandi(Map<String, String> pencatatKataSandi) {
        if (pencatatKataSandi.isEmpty()) {
            System.out.println("Pencatat kata sandi kosong.");
        } else {
            System.out.println("===== DAFTAR KATA SANDI =====");
            for (Map.Entry<String, String> entry : pencatatKataSandi.entrySet()) {
                String situs = entry.getKey();
                String kataSandi = entry.getValue();
                System.out.println("Situs: " + situs + ", Kata Sandi: " + kataSandi);
            }
        }
    }
}
