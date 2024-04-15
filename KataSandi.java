import java.util.Scanner;

public class KataSandi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String PASSWORD = "1237050140";
        String inputPassword;
        int percobaan = 0;

        do {
            System.out.print("Masukkan password: ");
            inputPassword = scanner.nextLine();

            percobaan++;

            if (!inputPassword.equals(PASSWORD)) {
                System.out.println("Tetott salah. Coba lagi.");
            }

            if (percobaan >= 3) {
                System.out.println("Percobaan telah melebihi batas wajar. byee.");
                System.exit(0);
            }
        } while (!inputPassword.equals(PASSWORD));

        System.out.println("Selamat! Anda berhasil masuk...");
        scanner.close();
    }
}
