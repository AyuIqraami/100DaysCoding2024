package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day40_OperatorPerbandingan1 {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        double a = ayu.nextDouble();
        System.out.print("Masukkan nilai b : ");
        double b = ayu.nextDouble();

        System.out.println("====================================");
        //Operator Perbandingan : Lebih besar dan lebih kecil 
        boolean c = a > b;
        boolean d = a < b;
        System.out.println("Nilai a lebih besar dari b = " + c);
        System.out.println("Nilai a lebih kecil dari c = " + d);

    }
}
