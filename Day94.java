package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day94_AsteriskPatternSegitiga {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input tinggi segitiga : ");
        int tinggi = ayu.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

