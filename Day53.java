package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day53_LoppingFor {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int bariss = ayu.nextInt(); 
        
        for (int i = 1; i <= bariss; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}
