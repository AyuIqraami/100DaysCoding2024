package Day23;

import java.util.Scanner;

public class Aritmatika {

    public static void main(String[] args) {
        Scanner ayuu = new Scanner(System.in);
        System.out.print("Input bilangan bulat1 : ");
        int data1 = ayuu.nextInt();
        System.out.print("Input bilangan bulat2 : ");
        int data2 = ayuu.nextInt();

        int penjumlahan = data1 + data2;
        int pengurangan = data1 - data2;
        int perkalian = data1 * data2;
        int pembagian = data1 / data2;
        int mod = data1 % data2;
        
        System.out.println("============================");
        System.out.println("Hasil Penjumlahan : " + penjumlahan);
        System.out.println("Hasil Pengurangan : " + pengurangan);
        System.out.println("Hasil Perkalian : " + perkalian);
        System.out.println("Hasil Pembagian : " + pembagian);
        System.out.println("Hasil Sisa Bagi : " + mod);
    }
}
