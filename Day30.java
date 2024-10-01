package fromDay25Till_THE_END;

import java.math.BigDecimal;

public class Day30_BigDecimal {

    public static void main(String[] args) {
        BigDecimal data1 = new BigDecimal("123.45");
        //operasi dalam BigDecimal
        BigDecimal data2 = data1.add(new BigDecimal("76.89"));
        BigDecimal data3 = data1.subtract(new BigDecimal("77.99"));
        BigDecimal data4 = data1.multiply(new BigDecimal("55.432"));

        System.out.println("Hasil Penjumahan \t: " + data2);
        System.out.println("Hasil Pengurangan \t: " + data3);
        System.out.println("Hasil Perkalian  \t: " + data4);

    }
}
