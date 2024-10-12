package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.println("=======Menghitung rata rata nilai=======");
        System.out.print("Input Nilai 1 : ");
        double a = ayu.nextDouble();
        System.out.print("Input Nilai 2 : ");
        double b = ayu.nextDouble();
        System.out.print("Input Nilai 3 : ");
        double c = ayu.nextDouble();
        System.out.print("Input max rata-rata nilai : ");
        double d = ayu.nextDouble();

        System.out.println("========================================");
        double jumlah = a + b + c;
        double ratarata = jumlah / 3;
        boolean perbandingan = ratarata > d;
        System.out.println("Jumlah keseluruhan nilai = " + jumlah);
        System.out.println("Rata-Rata Nilai \t = " + ratarata);
        System.out.println("Rata-rata nilai > " + d + "\t = " + perbandingan);
    }
}
