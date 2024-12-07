package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day97_CetakBilanganPrima {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = ayu.nextInt();

        System.out.print("Bilangan prima dari 1 hingga " + n + " adalah : ");
        for (int i = 2; i <= n; i++) {
            if (BilanganPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Fungsi untuk memeriksa apakah suatu bilangan prima
    public static boolean BilanganPrima(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
}
