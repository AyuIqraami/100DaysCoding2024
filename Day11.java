package Day11;

public class evaluasi {

    public static void main(String[] args) {
        //deklarasi 2 variabel
        byte va1, var2; //mendeklarsikan 2 variabel dengan tipe data byte dan nama variabel var1 dan var2

        //deklarasi dan inisialisasi variabel
        String var3 = "Ethan Lee"; //variabel bertipe data String dengan nama variabel var3 dengan nilai awal Ethan Lee 
        final int var4 = 13775; //variabel bertipe final int dengan nama variabel var4 dengan nilai variabel 13775
        short var5 = 4; //variabel bertipe data short dengan nama variabel var5 dengan nilai awal 4

        //print variabel menggunakan format
        System.out.printf("var3 : %s %n", var3); //mencetak nilai dari var3 menggunakan printf
        System.out.printf("var4 : %d %n", var4); //mencetak nilai dari var4 menggunakan printf
        System.out.printf("var5 : %d %n", var5); //mencetak nilai dari var5 menggunakan printf

        //update nilai variabel
        var3 = "Evan Lee"; //memperbarui nilai var3 dari Ethan Lee menjadi Evan Lee
        var5 = 22; //memperbarui nilai var5 dari 4 menjadi 22

        //mencetak nilai variabel setelah di-update
        System.out.println("\nAfter Updating values of var3 and var5"); //mencetak sebuah teks String kekonsol menggunakan pritln sebagai penanda nilai setelah diperbarui
        System.out.printf("var3 : %s %n", var3); //mencetak nilai yang telah diperbarui dari var3
        System.out.printf("var5 : %d %n", var5); //mencetak nilai yang telah diperbarui dari var5

    }
}
