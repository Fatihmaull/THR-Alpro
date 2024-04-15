import java.util.Scanner;
import java.util.Random;

public class RandomizerNomor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai batas nomor yg ingin dipilih: ");
        int N = scanner.nextInt();

        // Membuat objek dari kelas Random
        Random random = new Random();

        // Memilih nomor acak dari 1 hingga yg ditentukan user
        int nomorRandom = random.nextInt(N) + 1;

        System.out.println("Nomor acak yang terpilih: " + nomorRandom);

        scanner.close();
    }
}
