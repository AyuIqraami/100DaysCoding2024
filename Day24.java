package Day24;

public class KonversiString1 {

    public static void main(String[] args) {
        //Konversi String ke tipe data primitif int dan long
        String data1 = "777";
        int change1 = Integer.parseInt(data1);
        System.out.println(change1);

        String data2 = "7775";
        long change2 = Long.parseLong(data2);
        System.out.println(change2);
    }
}
