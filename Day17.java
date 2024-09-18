package Day17;

import java.util.Scanner;

public class Operator_PenjumlahanPengurangan {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan angka Pertama\t: ");
        double num1 = ayu.nextDouble();
        System.out.print("Maukkan angka kedua\t: ");
        double num2 = ayu.nextDouble();

        double penjumlahan = num1 + num2;
        double pengurangan = num1 - num2;

        System.out.println("================================");
        System.out.println("Hasil penjumlahan : " + penjumlahan);
        System.out.println("Hasil pengurangan : " + pengurangan);
    }
}
