import java.util.Scanner;
public class Ongkir {
    public static void main(String[] args) {
        System.out.println("======PERHITUNGAN HARGA ONGKIR SEDERHANA=====");
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan panjang (cm): ");
            int panjang = input.nextInt();

            System.out.print("Masukkan lebar (cm): ");
            int lebar = input.nextInt();

            System.out.print("Masukkan tinggi (cm): ");
            int tinggi = input.nextInt();

            System.out.print("Masukkan berat (kg): ");
            double berat = input.nextDouble();

            PengirimanBarang pengiriman = new PengirimanBarang(panjang, lebar, tinggi, berat);
            double harga = pengiriman.hitungHarga();

            System.out.println("Harga pengiriman: Rp " + harga);

            System.out.print("Lanjutkan? (Ya/Tidak): ");
            String lanjut = input.next();
            if (lanjut.equalsIgnoreCase("Tidak")) {
                break;
            }
        }
        System.out.print("======TERIMAKASIH By W.A.A. =====");
        input.close();
    }
}