
package Balok;
import java.util.Scanner;

public class Balok {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

        System.out.println("Luas permukaan balok: " + luasPermukaan);
    }
}
