package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day95_SegitigaSikudansebaliknya {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input jumlah baris pola : ");
        int baris = ayu.nextInt();

        System.out.println("=======Segitiga Siku=======");
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n=======Segitiga Siku Terbalik=======");
        for (int k = baris; k >= 1; k--) {
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
