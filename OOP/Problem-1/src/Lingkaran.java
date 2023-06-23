import java.util.Scanner;
public class Lingkaran {
    private double jariJari;

    public void inputData() {
        Scanner jrlingkaran = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = jrlingkaran.nextDouble();
    }

    public void hitungLuas() {
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran: " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
