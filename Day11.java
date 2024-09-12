package Day11;

public class evaluasi {

    public static void main(String[] args) {
        //deklarasi 2 variabel
        byte va1, var2;

        //inisialisasi variabel
        String var3 = "Ethan Lee";
        final int var4 = 13775;
        short var5 = 4;

        //print variabel menggunakan format
        System.out.printf("var3 : %s %n", var3);
        System.out.printf("var4 : %d %n", var4);
        System.out.printf("var5 : %d %n", var5);

        //update nilai variabel
        var3 = "Evan Lee";
        var5 = 22;

        //mencetak nilai variabel setelah di-update
        System.out.println("\nAfter Updating values of var3 and var5");
        System.out.printf("var3 : %s %n", var3);
        System.out.printf("var5 : %d %n", var5);

    }
}
