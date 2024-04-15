import java.util.Scanner;

public class EnkripsiDekripsi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Enkripsi & Dekripsi Teks!");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    String teksAsli = scanner.nextLine();
                    String teksTerebut = enkripsiTeks(teksAsli);
                    System.out.println("Teks yang sudah dienkripsi: " + teksTerebut);
                    break;
                case 2:
                    System.out.print("Masukkan teks: ");
                    String teksTerenskripsi = scanner.nextLine();
                    String teksAsliKembali = dekripsiTeks(teksTerenskripsi);
                    System.out.println("Teks yang sudah didekripsi: " + teksAsliKembali);
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }

        System.out.println("Terima kasih telah menggunakan Program Enkripsi & Dekripsi Teks!");
        scanner.close();
    }

    private static String enkripsiTeks(String teks) {
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < teks.length(); i++) {
            char karakter = teks.charAt(i);

            //geser 3 ke kanan klo alfabet
            if (Character.isLetter(karakter)) {
                char awal = Character.isLowerCase(karakter) ? 'a' : 'A';
                hasil.append((char) ((karakter - awal + 3) % 26 + awal));
            } else {
            //gak berubah klo bukan alfabet
                hasil.append(karakter);
            }
        }

        return hasil.toString();
    }

    private static String dekripsiTeks(String teks) {
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < teks.length(); i++) {
            char karakter = teks.charAt(i);

        //geser 3 ke kiri
            if (Character.isLetter(karakter)) {
                char awal = Character.isLowerCase(karakter) ? 'a' : 'A';
                hasil.append((char) ((karakter - awal - 3 + 26) % 26 + awal));
            } else {
        //gak berubah klo bukan alfabet
                hasil.append(karakter);
            }
        }

        return hasil.toString();
    }
}
