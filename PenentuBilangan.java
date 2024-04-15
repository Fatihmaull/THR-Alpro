import java.util.Scanner;

public class PenentuBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ketik angka yg ingin diketahui: ");
        int angka = scanner.nextInt();
        
        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif.");
        } else {
            System.out.println(angka + " adalah nol.");
        }
        scanner.close();
    }
}
