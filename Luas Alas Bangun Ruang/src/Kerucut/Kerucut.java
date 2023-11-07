package Kerucut;
import java.util.Scanner;

public class Kerucut {
    public static void main(String[] args){
          Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas kerucut: ");
        double jariJariAlas = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();

        // Menghitung sisi miring
        double sisiMiring = Math.sqrt(jariJariAlas * jariJariAlas + tinggi * tinggi);

        // Menghitung luas permukaan
        double luasPermukaan = Math.PI * jariJariAlas * (jariJariAlas + sisiMiring);

        System.out.println("Luas permukaan kerucut: " + luasPermukaan);
    }
}
