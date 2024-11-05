package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day65_NestedLoop {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = ayu.nextInt();

        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
