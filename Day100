package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day100_TheLast_Calculator {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.println("======= Kalkulator Sederhana =======");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan (1-4)\t: ");
        int pilihan = ayu.nextInt();

        System.out.print("Masukkan angka pertama\t: ");
        double angka1 = ayu.nextDouble();
        System.out.print("Masukkan angka kedua\t: ");
        double angka2 = ayu.nextDouble();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan\t: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan\t: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian \t: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil pembagian \t: " + hasil);
                    break;
                }
            default:
                System.out.println("Inputan Tidak Valid");
        }

    }
}
