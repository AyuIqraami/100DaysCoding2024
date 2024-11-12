package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day72_Method_Rekursif {

    public static int jumlah(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlah(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input Angka : ");
        int angka = ayu.nextInt(); 
        int hasil = jumlah(angka);
        System.out.println("Jumlah angka dari 1 sampai " + angka + " adalah: " + hasil);
    }
}
