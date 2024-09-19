package Day18;

import java.util.Scanner;

public class operator_aritmatika {

    public static void main(String[] args) {
        Scanner ayuu = new Scanner(System.in);
        System.out.print("Input Angka-1 : ");
        double data1 = ayuu.nextDouble();
        System.out.print("Input Angka-2 : ");
        double data2 = ayuu.nextDouble();

        double perkalian = data1 * data2;
        double pembagian = data1 / data2;
        double modulu = data1 % data2;

        System.out.println("\n================================");
        System.out.println("Hasil Perkalian = " + perkalian);
        System.out.println("Hasil pembagian = " + pembagian);
        System.out.println("Sisa Bagi       = " + modulu);
    }
}
