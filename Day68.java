package fromDay25Till_THE_END;

public class Day68_Method_NonVoid {

    public int penjumlahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int c, int d) {
        return c - d;
    }

    public static void main(String[] args) {
        Day68_Method_NonVoid ayu = new Day68_Method_NonVoid();
        int hasil1 = ayu.penjumlahan(7, 7);
        int hasil2 = ayu.pengurangan(31, 4);
        System.out.println(hasil1);
        System.out.println(hasil2);
    }
}
