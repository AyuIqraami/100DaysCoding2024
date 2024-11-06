package fromDay25Till_THE_END;

public class Day66_PolaPersegiDanPersegiPanjang {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("=========PERSEGI==========");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=====PERSEGI PANJANG=====");
        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
