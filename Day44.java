package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day44_OperatorLogika_AND {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input Nilai a : ");
        double a = ayu.nextDouble();
        System.out.print("Input Nilai b : ");
        double b = ayu.nextDouble();

        boolean c = a >= b;
        boolean d = a <= b;
        boolean e = c && d;

        System.out.println("====================================");
        System.out.printf("Nilai a %.1f >= nilai b %.1f = %b%n", a, b, c);
        System.out.printf("Nilai a %.1f <= nilai b %.1f = %b%n", a, b, d);
        System.out.printf("Hasil dari a AND b adalah  = %b %n", e);
    }
}
