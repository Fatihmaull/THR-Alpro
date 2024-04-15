import java.util.Scanner;

public class BilPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tulis angkanya disini: ");
        int num = scanner.nextInt();
        boolean isPrima = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrima = false;
                break;
            }
        }
        if (isPrima)
            System.out.println(num + " adalah bilangan prima.");
        else
            System.out.println(num + " bukan bilangan prima.");
        scanner.close();
    }
}
