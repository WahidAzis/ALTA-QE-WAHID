import java.util.Scanner;
public class Kubus {
    private double sisi;

    public void inputData() {
        Scanner skubus = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = skubus.nextDouble();
    }

    public void hitungVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Volume kubus: " + volume);
    }
}
