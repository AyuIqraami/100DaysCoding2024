package Day13;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TipeData {

    public static void main(String[] args) {
        //deklarasi dan inisialisasi tipe data primitif
        byte data1 = 11;
        short data2 = 22;
        int data3 = 33;
        long data4 = 44;
        float data5 = 5.5f;
        double data6 = 6.6;
        char data7 = '7';
        boolean data8 = false;

        //Mencetak nilai variabel dari tipe data primitif menggunakan println
        System.out.println("==========Tipe Data Primitif==========");
        System.out.println("Value of byte : " + data1);
        System.out.println("Value of short : " + data2);
        System.out.println("Value of int : " + data3);
        System.out.println("Value of long : " + data4);
        System.out.println("Value of float : " + data5);
        System.out.println("Value of double : " + data6);
        System.out.println("Value of char : " + data7);
        System.out.println("Value of boolean : " + data8);

        //deklarasi dan inisialisasi tipe data reference
        String data9 = "F. Ayu Iqraami";
        Byte data10 = 8;
        Short data11 = 9;
        Integer data12 = 2077;
        Long data13 = 1110L;
        Float data14 = 12.3F;
        Double data15 = 34.5;
        Character data16 = 'A';
        
        // Deklarasi dan inisialisasi BigInteger dan BigDecimal dengan string
        BigInteger data17 = new BigInteger("763783465756");
        BigDecimal data18 = new BigDecimal("234.57275567");

        //Mencetak nilai variabel dari tipe data reference menggunakan println
        System.out.println("\n==========Tipe Data Reference==========");
        System.out.println("Value of String : " + data9);
        System.out.println("Value of Byte : " + data10);
        System.out.println("Value of Short : " + data11);
        System.out.println("Value of Integer : " + data12);
        System.out.println("Value of Long : " + data13);
        System.out.println("Value of Float : " + data14);
        System.out.println("Value of Double : " + data15);
        System.out.println("Value of Character : " + data16);
        System.out.println("Value of BigInteger : " + data17);
        System.out.println("Value of BigDecimal : " + data18);
    }
}
