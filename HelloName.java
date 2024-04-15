import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tulis nama disini: ");
        String nama = scanner.nextLine();
        System.out.println("Hallo, " + nama + "!");
        scanner.close();
    }
}
