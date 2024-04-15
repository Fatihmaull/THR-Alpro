import java.util.Scanner;

public class KalkulatorTambah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka pertama: ");
        int num1 = scanner.nextInt();
        System.out.print("Angka kedua: ");
        int num2 = scanner.nextInt();
        int jumlah = num1 + num2;
        System.out.println("Hasil Penjumlahan: " + jumlah);
        scanner.close();
    }
}
