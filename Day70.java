package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day70_Evaluasi {

    // Method 1 untuk mencetak Pola 1
    public void pola1(int tinggi) {
        for (int i = 0; i < tinggi; i++) { // Loop untuk setiap baris
            for (int j = 0; j < tinggi - i; j++) { // Loop untuk mencetak spasi di setiap baris
                System.out.print(" "); // Mencetak spasi
            }
            int number = 1; // Angka pertama yang akan dicetak di setiap baris 
            for (int j = 0; j <= i; j++) { // Loop untuk mencetak angka pada baris i
                System.out.print(number + " "); // Mencetak angka diikuti dengan spasi
                number = number * (i - j) / (j + 1); //Menghitung nilai berikutnya dalam baris
            }
            System.out.println(); // Pindah ke baris berikutnya 
        }
    }

    //Method 2 untuk mencetak pola 2
    public void pola2(int tinggi) {
        for (int i = tinggi; i > 0; i--) { // Loop untuk setiap baris, dimulai dari tinggi dan berkurang
            for (int j = 0; j < tinggi - i; j++) { // Loop untuk mencetak spasi di setiap baris
                System.out.print(" "); // Mencetak spasi
            }
            for (int j = tinggi - 1; j >= tinggi - i; j--) { // Loop untuk mencetak angka mulai dari tinggi-1 hingga tinggi-i
                System.out.print(j + " "); // Mencetak angka di baris ini diikuti dengan spasi

            }
            System.out.println(); // Pindah ke baris berikutnya 
        }
    }

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna
        System.out.print("Input Tinggi Pola : "); // Menampilkan pesan untuk meminta input dari pengguna
        int tinggi = ayu.nextInt(); // Membaca input tinggi dari pengguna

        Day70_Evaluasi pola = new Day70_Evaluasi(); // Membuat objek dari kelas Day70_Evaluasi
        System.out.println("===POLA 1==="); // Menampilkan judul untuk Pola 1
        pola.pola1(tinggi); // Memanggil metode pola1 dengan parameter tinggi yang diberikan oleh pengguna
        System.out.println("\n===POLA 2==="); // Menampilkan judul untuk Pola 2
        pola.pola2(tinggi); // Memanggil metode pola2 dengan parameter tinggi yang diberikan oleh pengguna
    }
}
