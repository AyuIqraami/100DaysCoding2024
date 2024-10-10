package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day39_OperatorPenugasanPengisiandanModulo {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan angka Pertama \t: ");
        double a = ayu.nextDouble();
        System.out.print("Masukkan angka Kedua \t: ");
        double b = ayu.nextDouble();

        System.out.println("===============================");
        double c = a % b;
        System.out.println("Sisa Bagi \t\t= " + c);
    }
}
