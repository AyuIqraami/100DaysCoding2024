package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day54_Looping_forIncrement {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input angka yang ingin dihitung faktorialnya : ");
        int angka = ayu.nextInt();
        int faktorial = 1;

        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + angka + " adalah : " + faktorial);
    }
}
