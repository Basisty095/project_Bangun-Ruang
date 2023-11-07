package luas.alas.bangun.ruang;
import java.util.Scanner;


public class LuasAlasBangunRuang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Panjang");
        double panjang = input.nextDouble();
        
        System.out.println("Masukkan Lebar");
        double lebar = input.nextDouble();
        
        double luas = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang: " + luas);
    }
    
}
