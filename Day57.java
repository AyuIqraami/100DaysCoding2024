package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day57_while_increment {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        int batas = ayu.nextInt();
        int z = 1;
        while (z <= batas) {
            System.out.println("Nilai Z : " + z);
            z++;
        }
    }
}
