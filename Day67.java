package fromDay25Till_THE_END;

public class Day67_MethodVoid {

    // Metode void dengan parameter
    public void Nama(String nama) {
        System.out.print(nama);
    }

    // Metode void yang tidak menerima parameter
    public void Prodi() {
        System.out.print(" Informatika ");
    }

    public void angkatan(int angkatan) {
        System.out.print(angkatan);
    }

    public static void main(String[] args) {
        Day67_MethodVoid MethodVoid = new Day67_MethodVoid();
        MethodVoid.Nama("Ayu");
        MethodVoid.Prodi();
        MethodVoid.angkatan(23);

        System.out.println();

    }
}
