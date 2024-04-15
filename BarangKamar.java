import java.util.ArrayList;
import java.util.Scanner;

public class BarangKamar {

    static class Barang {
        String nama;
        String deskripsi;

        public Barang(String nama, String deskripsi) {
            this.nama = nama;
            this.deskripsi = deskripsi;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Barang> daftarBarang = new ArrayList<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("ADA APA AJAA DI KAMAR??");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Daftar Barang");
            System.out.println("3. Keluar");
            System.out.print("pilihan kamu: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tambahBarang(daftarBarang, scanner);
                    break;
                case 2:
                    tampilkanDaftarBarang(daftarBarang);
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Tidak Valid, pilih lagi.");
            }
        }

        System.out.println("Bye.");
        scanner.close();
    }

    private static void tambahBarang(ArrayList<Barang> daftarBarang, Scanner scanner) {
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi barang: ");
        String deskripsi = scanner.nextLine();

        daftarBarang.add(new Barang(nama, deskripsi));
        System.out.println("Barang \"" + nama + "\" telah ditambahkan ke daftar.");
    }

    private static void tampilkanDaftarBarang(ArrayList<Barang> daftarBarang) {
        if (daftarBarang.isEmpty()) {
            System.out.println("Daftar barang kosong.");
            return;
        }

        System.out.println("===== DAFTAR BARANG KAMAR TIDUR =====");
        for (Barang barang : daftarBarang) {
            System.out.println("Nama: " + barang.nama);
            System.out.println("Deskripsi: " + barang.deskripsi);
            System.out.println("---------------------------");
        }
    }
}
