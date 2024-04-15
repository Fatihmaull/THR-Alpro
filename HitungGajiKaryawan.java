import java.util.Scanner;

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Langkah 1: Minta input jumlah jam kerja
        System.out.print("Masukkan jumlah jam kerja Anda: ");
        int jamKerja = scanner.nextInt();

        // Inisialisasi variabel
        int jamLembur = 0;
        double totalGajiPraPajak;
        double totalGajiPascaPajak;
        double potonganPajak;
        double tunjanganMakan;
        double tunjanganTransport;
        double tunjanganAnakIstri = 0; // Default 0
        double tunjanganTelekomunikasi;
        double tunjanganRumahDinas;
        double tunjanganPakaian;
        double potonganBPJS;
        double potonganZakat;
        double totalGajiBersih;

        // Langkah 5: Tanyakan apakah ada lembur
        System.out.print("Apakah Anda bekerja lembur? (ya/tidak): ");
        String jawabanLembur = scanner.next();

        if (jawabanLembur.equalsIgnoreCase("ya")) {
            // Langkah 8: Minta input jumlah jam lembur
            System.out.print("Masukkan jumlah jam lembur Anda: ");
            jamLembur = scanner.nextInt();
        }

        // Langkah 10 atau 11: Hitung total gaji pra pajak
        totalGajiPraPajak = (jamKerja * 50000) + (Math.min(jamLembur, 50) * 70000);

        // Langkah 12: Hitung potongan pajak
        potonganPajak = totalGajiPraPajak * 0.10;

        // Langkah 13: Hitung total gaji pasca pajak
        totalGajiPascaPajak = totalGajiPraPajak - potonganPajak;

        // Langkah 14-20: Hitung tunjangan-tunjangan
        tunjanganMakan = 25000 * 20;
        tunjanganTransport = totalGajiPascaPajak * 0.06;

        System.out.print("Apakah Anda memiliki anak atau istri? (ya/tidak): ");
        String jawabanAnakIstri = scanner.next();
        if (jawabanAnakIstri.equalsIgnoreCase("ya")) {
            tunjanganAnakIstri = totalGajiPascaPajak * 0.05;
        }

        tunjanganTelekomunikasi = totalGajiPascaPajak * 0.07;
        tunjanganRumahDinas = totalGajiPascaPajak * 0.10;
        tunjanganPakaian = totalGajiPascaPajak * 0.03;

        // Langkah 21: Hitung total gaji pasca pajak setelah ditambah tunjangan
        totalGajiPascaPajak = totalGajiPascaPajak + tunjanganMakan + tunjanganTransport + tunjanganAnakIstri + tunjanganTelekomunikasi + tunjanganRumahDinas + tunjanganPakaian;

        // Langkah 22-23: Hitung potongan BPJS dan zakat
        potonganBPJS = totalGajiPascaPajak * 0.02;
        potonganZakat = totalGajiPascaPajak * 0.025;

        // Langkah 24: Hitung total gaji bersih
        totalGajiBersih = totalGajiPascaPajak - potonganBPJS - potonganZakat;

        // Tampilkan hasil
        System.out.println("Total gaji bersih pasca pajak: " + totalGajiBersih);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Tunjangan Transport: " + tunjanganTransport);
        System.out.println("Tunjangan Anak/Istri: " + tunjanganAnakIstri);
        System.out.println("Tunjangan Telekomunikasi: " + tunjanganTelekomunikasi);
        System.out.println("Tunjangan Rumah Dinas: " + tunjanganRumahDinas);
        System.out.println("Tunjangan Pakaian: " + tunjanganPakaian);
        System.out.println("Potongan BPJS: " + potonganBPJS);
        System.out.println("Potongan Zakat: " + potonganZakat);


        // Pesan terakhir
        System.out.println("Silahkan ambil gaji di ATM Bank Mafa terdekat.");
        System.out.println("Terima kasih.");
        System.out.println("Semangat bekerja!");

        scanner.close();
    }
}
