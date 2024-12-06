package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day96_AsteriskPatternDiamond {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input tinggi Diamond : ");
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
        for (int i = tinggi - 1; i >= 1; i--) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
