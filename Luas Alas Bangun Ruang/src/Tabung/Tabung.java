package Tabung;
import java.util.Scanner;

public class Tabung {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas: ");
        double jariJariAlas = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double luas = 2 * Math.PI * jariJariAlas * (jariJariAlas + tinggi);

        System.out.println("Luas Tabung: " + luas);
    }
}
