package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day59_LoopingForEach {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = ayu.nextLine();

        // Menggunakan for-each untuk mengiterasi setiap kata dalam kalimat 
        for (String kata : kalimat.split(" ")) {
            System.out.println("Kata : " + kata);
        }
    }
}
