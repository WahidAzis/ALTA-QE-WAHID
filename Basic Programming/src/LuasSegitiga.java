import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        System.out.println("+++Menghitung Luas Alas Segitiga+++");
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        double luasAlas = 0.0;
        if (alas > 0 && tinggi > 0) {
            double i = 1.0;
            do {
                luasAlas += alas;
                i++;
            } while (i <= tinggi);
            luasAlas /= 2;

            System.out.println("Luas alas segitiga adalah: " + luasAlas);
        } else {
            System.out.println("Masukkan panjang alas dan tinggi yang valid (lebih dari 0).");
        }
        System.out.println("Apakah ingin menghitung luas alas segitiga lagi? (Ya/Tidak): ");
        String pilihan = input.next();

        if (!pilihan.equalsIgnoreCase("Ya")) {
            lanjut = false;
        }
        System.out.println("Program selesai. Terimakasih");
        }

        input.close();
    }
}