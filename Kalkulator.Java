import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator perhitungan (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
        }

        scanner.close();
    }
}
