package Day14;

public class PersegiPanjang {

    public static void main(String[] args) {
        int panjang = 12;
        int lebar = 8;

        //rumus mencari luas dari persegi panjang
        int luas = panjang * lebar;
        //rumus mencari keliling dari persegi panjang
        int keliling = 2 * (panjang + lebar);

        System.out.println("==============================================");
        System.out.println("\tMenentukan Luas dan Keliling");
        System.out.println("\t\tPersegi Panjang");
        System.out.println("==============================================");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("\nLuas     : " + luas);
        System.out.println("Keliling : " + keliling);
        System.out.println("\nLuas dari persegi panjang dengan panjang " + panjang + " \ndan lebar " + lebar + " adalah " + luas);
        System.out.println("\nKeliling dari persegi panjang dengan panjang\n" + panjang + " dan lebar " + lebar + " adalah " + keliling);
        System.out.println("==============================================");
    }
}
