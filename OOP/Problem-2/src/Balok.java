import java.util.Scanner;
public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    public void inputData() {
        Scanner sbalok = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        panjang = sbalok.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        lebar = sbalok.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = sbalok.nextDouble();
    }

    public void hitungVolume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok: " + volume);
    }
}
