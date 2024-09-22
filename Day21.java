package Day21;

import java.util.Scanner;

public class OperatorPenugasan3 {

    public static void main(String[] args) {
        //pengisian dan modulu
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input angka pertama : ");
        double data = ayu.nextDouble();
        System.out.print("Input angka kedua   : ");
        data %= ayu.nextDouble();
        System.out.println("value of data = " + data);
    }
}
