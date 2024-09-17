package Day16;

import java.util.Scanner;

public class Scannnerr {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Nama \t: ");
        String nama = ayu.nextLine();
        System.out.print("NIM \t: ");
        String NIM = ayu.nextLine();
        System.out.print("Prodi \t: ");
        String prodi = ayu.nextLine();

        System.out.println("\n=======================");
        System.out.println("Data Mahasiswa");
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + NIM);
        System.out.println("Prodi \t: " + prodi);
        System.out.println("=======================");
    }
}
