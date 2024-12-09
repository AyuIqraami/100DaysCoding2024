package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("input Nilai x : ");
        int x = ayu.nextInt();
        System.out.print("input Nilai y : ");
        int y = ayu.nextInt();

        int jumlah = 0;

        if (x > y) {
            int a = x;
            x = y;
            y = a;
        }

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }
        System.out.println("Hasil: " + jumlah);
    }
}
