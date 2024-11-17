package fromDay25Till_THE_END;

public class Day77_StringMethod_equals {

    public static void main(String[] args) {
        String a = "Ayu";
        String b = "ayu";
        String c = "Ayu";

        if (a.equals(b)) {
            System.out.println("a dan b memiliki nilai yang sama");

        } else {
            System.out.println("a dan b memiliki nilai yang berbeda");
        }

        if (a.equals(c)) {
            System.out.println("a dan c memiliki nilai yang sama");

        } else {
            System.out.println("a dan c  memiliki nilai yang berbeda");
        }

    }
}
