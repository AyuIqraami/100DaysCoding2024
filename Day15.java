package Day15;

import java.util.Scanner;

public class Aritmatika_Lingkaran {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan nilai Jari-jari lingkaran : ");
        //r merupakan singkatan dari jari-jari
        double r = ayu.nextDouble();
        double pi = 3.14;

        //Rumus mencari keliling dari linkgkaran
        double keliling = 2 * pi * r;
        //Rumus mencari luas 
        double luas = 2 * r * r;

        System.out.println("\nJari-Jari = " + r);
        System.out.println("Keliling = " + keliling);
        System.out.println("Luas = " + luas);
        System.out.println("\nKeliling lingkaran dengan jari-jari " + r + " adalah " + keliling);
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah " + luas);
    }
}
