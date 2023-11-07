package Kubus;
import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        double sisi = input.nextDouble();

        double luas = 6 * sisi * sisi;

        System.out.println("Luas kubus: " + luas);
    }
}
