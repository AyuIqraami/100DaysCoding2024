package fromDay25Till_THE_END;

public class Day69_MethodParameter {

    public boolean genap(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Day69_MethodParameter parameter = new Day69_MethodParameter();
        boolean hasil = parameter.genap(7);
        System.out.println(hasil);
    }
}
