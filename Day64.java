package fromDay25Till_THE_END;

public class Day64_break_label {

    public static void main(String[] args) {
        loop1: // Label pertama
        for (int i = 1; i < 5; i++) {
            loop2: // Label kedua
            for (int j = 1; j < 5; j++) {
                if (i == 3 && j == 3) {
                    break loop1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Loop selesai.");
    }
}
