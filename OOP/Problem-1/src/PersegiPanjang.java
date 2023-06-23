import java.util.Scanner;
public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public void inputData() {
        Scanner pp = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang: ");
        panjang = pp.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        lebar = pp.nextDouble();
    }

    public void hitungLuas() {
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}
