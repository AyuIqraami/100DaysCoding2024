package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day48_Percabanganif_else {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input angka : ");
        int a = ayu.nextInt();
        if (a % 2 == 0) {
            System.out.println("Angka yang di-input adalah bilangan genap");
        } else {
            System.out.println("Angka yang di-input adalah bilangan ganjil");
        }
    }
}
