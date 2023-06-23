import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        System.out.println("================Bangun Datar Ver.3.1.0===============");

        while (true) {
            System.out.println("Silahkan pilih bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int choice = pilihan.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    Persegi persegi = new Persegi();
                    persegi.inputData();
                    persegi.hitungLuas();
                    persegi.hitungKeliling();
                    break;
                case 2:
                    Segitiga segitiga = new Segitiga();
                    segitiga.inputData();
                    segitiga.hitungLuas();
                    segitiga.hitungKeliling();
                    break;
                case 3:
                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    persegiPanjang.inputData();
                    persegiPanjang.hitungLuas();
                    persegiPanjang.hitungKeliling();
                    break;
                case 4:
                    Lingkaran lingkaran = new Lingkaran();
                    lingkaran.inputData();
                    lingkaran.hitungLuas();
                    lingkaran.hitungKeliling();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        }
        System.out.println("Terimakasih Menggunakan Bangun Datar v.3.1.0 by. W.A.A.");
    }
}