package fromDay25Till_THE_END;

import java.util.Arrays;

public class Day86_MencetakElemenArray1D {

    public static void main(String[] args) {
        String nama[] = new String[3];
        nama[0] = "Ayu";
        nama[1] = "Tisa";
        nama[2] = "Yulia";

        System.out.println("Mencetak array menggunakan for loop");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }

        int angka[] = {7, 7, 5, 12};

        System.out.println("\nMencetak array menggunakan for-each loop");
        for (int a : angka) {
            System.out.println(a);
        }

        System.out.println("\nMencetak array menggunakan Arrays.toString()");
        System.out.println(Arrays.toString(nama));
        System.out.println(Arrays.toString(angka));
    }
}
