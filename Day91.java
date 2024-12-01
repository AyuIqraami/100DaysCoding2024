package fromDay25Till_THE_END;

import java.util.Scanner;

public class Day91_Soal {

    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int n = Integer.parseInt(ayu.nextLine());
        String[] kalimat = new String[n];

        for (int i = 0; i < n; i++) {
            String input = ayu.nextLine();
            if (input.length() <= 10000) {
                kalimat[i] = input;
            } else {
                System.out.println("Kalimat melebihi batas 10,000 karakter. Kalimat akan diabaikan.");
                kalimat[i] = ""; // Mengosongkan kalimat yang melebihi batas
            }
        }

        // Proses penghapusan kata yang berulang
        for (int i = 0; i < n; i++) {
            if (!kalimat[i].isEmpty()) { // Hanya memproses kalimat yang valid
                kalimat[i] = kalimat[i].replaceAll("(?i)\\b(\\w+)(\\s+\\1\\b)+", "$1");
            }
        }

        for (String sentence : kalimat) {
            if (!sentence.isEmpty()) {
                System.out.println(sentence);
            }
        }

    }
}
