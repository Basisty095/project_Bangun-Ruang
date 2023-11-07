
package Persegi_Panjang;
import java.util.Scanner;

public class Persegi_Panjang {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
            
        System.out.println("Masukkan Alas");
        double panjang = input.nextDouble();
        
        System.out.println("Masukkan tinggi");
        double lebar = input.nextDouble();
        
        double luas = panjang * lebar; 
        
        System.out.println("Luas ersegi Panjang: " + luas);
    }
}
