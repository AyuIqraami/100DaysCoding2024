package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day52_Ternary {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input angka bilangan bulat : ");
        int angka = ayu.nextInt();
        
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka yang di input adalah bilangan " + hasil);
    }
}
