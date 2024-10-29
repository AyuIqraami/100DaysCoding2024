package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day58_WhileDecrement {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan angka positif : ");
        int batas = ayu.nextInt();
        while (batas >= 0) {
            System.out.print(batas+" ");
            batas--;
        }
        System.out.println();
    }
}
