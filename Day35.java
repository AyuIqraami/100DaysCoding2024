package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day35_OperatorAritmatikaPenjumlahanPengurangan {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan Angka pertama : ");
        double a = ayu.nextInt();
        System.out.print("Masukkan Angka kedua   : ");
        double b = ayu.nextInt();
        double penjumlahan = a + b;
        double pengurangan = a - b;
        System.out.println("=================================");
        System.out.println("Hasil Penjumlahan = " + penjumlahan);
        System.out.println("Hasil Pengurangan = " + pengurangan);
    }
}
