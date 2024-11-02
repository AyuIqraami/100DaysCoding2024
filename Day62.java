package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day62_keyword_break {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int angka;
        while (true) { 
            System.out.print("Masukkan angka negatif untuk berhenti : ");
            angka = ayu.nextInt();
            if (angka < 0) {
                break; 
            }
            System.out.println("Anda memasukkan angka : " + angka);
        }
        System.out.println("Loop selesai.");
    }
}
