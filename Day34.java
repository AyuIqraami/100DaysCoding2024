package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day34_Inputan {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan Nama \t: ");
        String nama = ayu.nextLine();
        System.out.print("Masukkan Usia \t: ");
        int age = ayu.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        double bb = ayu.nextDouble();

        System.out.println("============================");
        System.out.println("Nama \t: " + nama);
        System.out.println("Usia \t: " + age);
        System.out.println("Berat Badan : " + bb);
    }
}
