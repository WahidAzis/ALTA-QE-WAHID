import java.util.Scanner;
public class Persegi {
    private double sisi;

    public void inputData() {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = p.nextDouble();
    }

    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas);
    }

    public void hitungKeliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling persegi: " + keliling);
    }
}
