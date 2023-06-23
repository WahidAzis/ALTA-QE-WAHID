import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        System.out.println("================Bangun Ruang Ver.1.1.0===============");

        while (true) {
            System.out.println("Pilih bangun ruang yang ingin dihitung volume:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Bola");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int choice = pilihan.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    Kubus kubus = new Kubus();
                    kubus.inputData();
                    kubus.hitungVolume();
                    break;
                case 2:
                    Balok balok = new Balok();
                    balok.inputData();
                    balok.hitungVolume();
                    break;
                case 3:
                    Tabung tabung = new Tabung();
                    tabung.inputData();
                    tabung.hitungVolume();
                    break;
                case 4:
                    Bola bola = new Bola();
                    bola.inputData();
                    bola.hitungVolume();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        }
        System.out.println("Terimakasih Menggunakan Bangun Ruang v.1.1.0 by. W.A.A.");
    }
}