package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day90_Soal {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input jumlah bilangan : ");
        int jumlah = ayu.nextInt();
        int total = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = ayu.nextInt();

            total += bilangan;

            if (bilangan > max) {
                max = bilangan;
            }
        }
        double ratarata = (double) total / jumlah;

        System.out.println("===============================");
        System.out.println("Rata-Rata Bilangan : " + ratarata);
        System.out.println("Bilangan Terbesar  : " + max);

    }
}
