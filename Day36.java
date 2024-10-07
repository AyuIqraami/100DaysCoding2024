package Day36;

import java.util.Scanner;

public class OperatorAritmatikaPerkalianPembagianModulo {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama : ");
        double a = ayu.nextDouble();
        System.out.print("Masukkan Angka Kedua   : ");
        double b = ayu.nextDouble();

        double perkalian = a * b;
        double pembagian = a / b;
        double mod = a % b;

        System.out.println("===============================");
        System.out.println("Hasil Perkalian : " + perkalian);
        System.out.println("Hasil Pembagian : " + pembagian);
        System.out.println("Sisa Bagi \t: " + mod);

    }

}
