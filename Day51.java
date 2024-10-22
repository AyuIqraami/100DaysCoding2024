package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day51_PercabanganSwitchCase {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.println("Input angka hari 1-7 : ");
        int Days = ayu.nextInt();
        String Hari;
        switch (Days) {
            case 1:
                Hari = "Senin";
                break;
            case 2:
                Hari = "Selasa";
                break;
            case 3:
                Hari = "Rabu";
                break;
            case 4:
                Hari = "Kamis";
                break;
            case 5:
                Hari = "Jumat";
                break;
            case 6:
                Hari = "Sabtu";
                break;
            case 7:
                Hari = "Minggu";
                break;
            default:
                Hari = "Invalid Day";
                break;
        }
        System.out.println(Hari);
    }
}
