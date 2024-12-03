package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day93_PolaVTerbalik {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input jumlah baris : ");
        int n = ayu.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                // cetak '*' pada posisi yang sesuai untuk membentuk pola V terbalik
                if (j == (n - 1 - i) || j == (n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
