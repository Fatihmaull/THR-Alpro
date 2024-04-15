import java.util.Scanner;

public class BubbleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tentukan berapa banyak isi array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Array setelah diurutkan:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
