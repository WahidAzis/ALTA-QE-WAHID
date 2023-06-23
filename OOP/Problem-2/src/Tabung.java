import java.util.Scanner;
public class Tabung {
    private double jariJari;
    private double tinggi;

    public void inputData() {
        Scanner stabung = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        jariJari = stabung.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        tinggi = stabung.nextDouble();
    }

    public void hitungVolume() {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung: " + volume);
    }
}
