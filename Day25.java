package fromDay25Till_THE_END;

public class Day25_konversiString2 {

    public static void main(String[] args) {
        //konversi string ke tipe data primitif byte dan short
        String a = "120";
        byte y = Byte.parseByte(a);
        System.out.println(a);

        String u = "453";
        short f = Short.parseShort(u);
        System.out.println(f);
    }
}
