package fromDay25Till_THE_END;

import java.util.Arrays;

public class Day87_MengubahNilaiArray1D {

    public static void main(String[] args) {
        String Hewan[] = new String[3];
        Hewan[0] = "Panda";
        Hewan[1] = "Bambi";
        Hewan[2] = "Cat";
        System.out.println("Nilai Array sebelum diubah : " + Arrays.toString(Hewan));

        // Mengubah nilai elemen pada indeks 2
        Hewan[2] = "Kucing";
        System.out.println("Nilai Array setelah diubah : " + Arrays.toString(Hewan));
    }
}
