import java.util.Scanner;
public class Segitiga {
    private double alas;
    private double tinggi;

    public void inputData() {
        Scanner sst = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga: ");
        alas = sst.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = sst.nextDouble();
    }

    public void hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
    }

    public void hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double keliling = alas + tinggi + sisiMiring;
        System.out.println("Keliling segitiga: " + keliling);
    }
}
