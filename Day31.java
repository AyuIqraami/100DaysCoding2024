package fromDay25Till_THE_END;

public class KonversiString3_Day31 {

    public static void main(String[] args) {
        //konversi tipe data String ke tipe data char dan boolean
        String nama = "ayu";
        char change1 = nama.charAt(2);
        System.out.println(change1);

        String nilai = "False";
        boolean change2 = Boolean.parseBoolean(nilai);
        System.out.println(change2);
    }
}
