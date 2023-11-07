package Limas;
import java.util.Scanner;

public class Limas {
    public static void main(String[] arg){
         Scanner input = new Scanner(System.in);
             System.out.print("Masukkan panjang sisi alas (sisi segiempat): ");
        double sisiAlas = input.nextDouble();

        System.out.print("Masukkan tinggi limas: ");
        double tinggi = input.nextDouble();

        // Menghitung luas permukaan limas
        double luasPermukaan = sisiAlas * sisiAlas + 4 * (sisiAlas * tinggi) / 2;

        System.out.println("Luas permukaan limas: " + luasPermukaan);
       
    }
}
