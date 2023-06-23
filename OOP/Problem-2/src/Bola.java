import java.util.Scanner;
public class Bola {
    private double jariJari;

    public void inputData() {
        Scanner sbola = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola: ");
        jariJari = sbola.nextDouble();
    }

    public void hitungVolume() {
        double volume = (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
        System.out.println("Volume bola: " + volume);
    }
}
