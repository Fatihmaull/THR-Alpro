import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka genap ganjil hingga berapa?: ");
        int n = scanner.nextInt();
        
        System.out.println("Angka genap hingga batas yg ditentukan yaitu:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nAngka ganjil hingga batas yg ditentukan yaitu:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}