import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("silahkan tentukan panjang array: ");
        int panjangArray = scanner.nextInt();
        int[] array = new int[panjangArray];
        
        System.out.println("input elememnnya:");
        for (int i = 0; i < panjangArray; i++) {
            array[i] = scanner.nextInt();
        }
        
        int maks = array[0];
        int min = array[0];
        for (int i = 1; i < panjangArray; i++) {
            if (array[i] > maks) {
                maks = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("elemen terbersar: " + maks);
        System.out.println("elemen terkecil: " + min);
        scanner.close();
    }
}
