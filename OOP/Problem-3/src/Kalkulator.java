import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("================Kalkulator Sederhana v.2.1===============");
            System.out.println("Pilih Operasi Matematika:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = input.nextInt();

            if (pilihan == 5) {
                System.out.println("Terimakasih telah menggunakan Kalkulator Sederhana v.2.1 by W.A.A.");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            switch (pilihan) {
                case 1:
                    Penjumlahan penjumlahan = new Penjumlahan(angka1, angka2);
                    penjumlahan.operasi();
                    break;
                case 2:
                    Pengurangan pengurangan = new Pengurangan(angka1, angka2);
                    pengurangan.operasi();
                    break;
                case 3:
                    Perkalian perkalian = new Perkalian(angka1, angka2);
                    perkalian.operasi();
                    break;
                case 4:
                    Pembagian pembagian = new Pembagian(angka1, angka2);
                    pembagian.operasi();
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid.");
            }
        }
    }
}