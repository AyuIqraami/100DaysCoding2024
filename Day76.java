package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day76_toUpperCase {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String str = ayu.nextLine();

        String hasil = str.toUpperCase();
        System.out.println(hasil);
    }
}
