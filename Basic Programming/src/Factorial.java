import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("========Faktor Bilangan========");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Bilangan: ");
        int nilai = input.nextInt();

        System.out.println("Faktor-faktor dari Bilangan " + nilai + " adalah:");

        for (int i = 1; i <= nilai; i++) {
            if (nilai % i == 0) {
                System.out.println("Angka-" + i);
            }
        }System.out.println("Perhitungan Selesai, Terimakasih");
    }
}