package Prisma;
import java.util.Scanner;

public class Prisma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi alas segitiga: ");
        double panjangSisiAlas = input.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();

        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = input.nextDouble();

        // Menghitung luas alas segitiga
        double luasAlasSegitiga = 0.5 * panjangSisiAlas * tinggiSegitiga;

        // Menghitung luas permukaan prisma
        double luasPermukaanPrisma = 2 * luasAlasSegitiga + (panjangSisiAlas * tinggiPrisma * 3);

        System.out.println("Luas permukaan prisma segitiga: " + luasPermukaanPrisma);
    }
}
