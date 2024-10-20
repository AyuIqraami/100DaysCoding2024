package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day49_Percabanganif_elseif {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input Nilai : ");
        double nilai = ayu.nextDouble();
        if (nilai >=65) {
            System.out.println("Good Job");
        } else if (nilai <65) {
            System.out.println("Nice Try");
        }
    }
}
