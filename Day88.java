package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day88_Soal {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input Jari-jari \t: ");
        double JariJari = ayu.nextDouble();
        System.out.print("Input Tinggi Tabung\t: ");
        double tinggi = ayu.nextDouble();

        final double PI = Math.PI;
        double formula = PI * JariJari * JariJari * tinggi;
        System.out.printf("Volume Tabung\t\t: %.2f m3 %n", formula);
    }

}
