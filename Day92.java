package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day92_AsteriskPatternPolaV {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input jumlah baris : ");
        int n = ayu.nextInt();

        for (int i =0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                // Menentukan posisi untuk mencetak bintang
                if (j == i || j == (2 * n - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
