package fromDay25Till_THE_END;

import java.math.BigInteger;

public class Day29_BigInteger {

    public static void main(String[] args) {
        //penjumlahan BigInteger
        BigInteger data1 = new BigInteger("12345678");
        BigInteger data2 = new BigInteger("88899999");
        BigInteger penjumlahan = data1.add(data2);
        System.out.println("Hasil Penjumlahan = "+penjumlahan);
    }
}
