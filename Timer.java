import java.util.Scanner;

public class Timer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== TIMER WAKTU == ");
        System.out.print("jam: ");
        int jam = scanner.nextInt();
        System.out.print("menit: ");
        int menit = scanner.nextInt();
        System.out.print("detik: ");
        int detik = scanner.nextInt();

        int totalDetik = jam * 3600 + menit * 60 + detik;

        for (int i = totalDetik; i >= 0; i--) {
            int sisaJam = i / 3600;
            int sisaMenit = (i % 3600) / 60;
            int sisaDetik = i % 60;

            System.out.println("Sisa waktu: " + sisaJam + " jam " + sisaMenit + " menit " + sisaDetik + " detik");
            try {
                Thread.sleep(1000); // untuk membuat jeda 1 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Waktu habis!");
        scanner.close();
    }
}
