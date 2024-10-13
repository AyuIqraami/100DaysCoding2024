package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day42_OperatorPerbandingan2 {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.println("Input bilangan bulat");
        System.out.print("Bilangan bulat 1 : ");
        int data1 = ayu.nextInt();
        System.out.print("Bilangan bulat 2 : ");
        int data2 = ayu.nextInt();

        //Operator Perbandingan : Sama dengan dan tidak sama dengan
        boolean a = data1 == data2;
        boolean b = data1 != data2;
        System.out.println("==============================================");
        System.out.println("Bilangan bulat 1 == Bilangan bulat 2 = " + a);
        System.out.println("Bilangan bulat 1 != Bilangan bulat 2 = " + b);
    }
}
