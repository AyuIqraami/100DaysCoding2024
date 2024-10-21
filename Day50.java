package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day50_Percabanganif_elseif_else {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Input Umur : ");
        int umur = ayu.nextInt();
        if (umur < 0) {
            System.out.println("Umur Tidak Valid");
        } else if (umur <= 12) {
            System.out.println("Anda adalah seorang anak");
        } else if (umur <= 18) {
            System.out.println("Anda adalah seorang remaja");
        } else if (umur <= 59) {
            System.out.println("Anda adalah seorang dewasa");
        } else {
            System.out.println("Anda adalah seorang lansia");
        }
    }
}
