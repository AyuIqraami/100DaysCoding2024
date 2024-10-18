package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day47_Percabangan_if {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.println("==========Input 2 angka==========");
        System.out.print("Angka 1 \t = ");
        double a = ayu.nextDouble();
        System.out.print("Angka 2 \t = ");
        double b = ayu.nextDouble();
        System.out.println("Hasil Pembagian = " + a / b);
        if (a % b == 0) {
            System.out.println("Angka yang diinput merupakan Bilangan genap");
        }
    }
}
