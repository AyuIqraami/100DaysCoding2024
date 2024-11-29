package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day89_Soal {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Input Palindrome : ");
        String input = ayu.nextLine();

        if (input.length() > 100) {
            System.out.println("Input maksimal 100 karakter!!");
        } else {
            String str = new StringBuilder(input).reverse().toString();

            if (input.equals(str)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
    }
}
