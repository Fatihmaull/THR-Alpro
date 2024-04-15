import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args){

        int angka = 10;
        if (angka >= 0){
            System.out.println("Angka " + angka + " adalah positif");
        } else {
            System.out.println("Angka " + angka + " adalah positif");
        }

        if(angka %2 >= 0){
            System.out.println("Angka " + angka + " adalah Genap");
        } else {
            System.out.println("Angka " + angka + " adalah Ganjil");
        }

        int umur = 20;
        if (umur < 12){
            System.out.println("Kamu anak-anak");
        } else if (umur >= 12 && umur < 20){
            System.out.println("Kamu remaja");
        } else if (umur >= 20){
        System.out.println("Kamu dah gede");
        } else {
            System.out.println("Manula");
        }


    }
}
