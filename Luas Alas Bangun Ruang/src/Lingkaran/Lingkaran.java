package Lingkaran;
import java.util.Scanner;

public class Lingkaran {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();

        double luas = Math.PI * jariJari * jariJari;

        System.out.println("Luas lingkaran: " + luas);
    }
}
