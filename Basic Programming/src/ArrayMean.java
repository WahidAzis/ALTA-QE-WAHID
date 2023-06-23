import java.util.Scanner;

public class ArrayMean {
    public static void main(String[] args) {
        System.out.println("=============MEAN ARRAY ANGKA=============");
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = angka.nextInt();

        int[] array = new int[n];

        System.out.println("Masukkan elemen array: ");
        for (int i = 0; i < n; i++) {
            array[i] = angka.nextInt();
        }

        double mean = hitungMean(array);

        System.out.println("Mean dari array tersebut adalah: " + mean);
        System.out.println("=============Program Berhasil=============");
    }
    private static double hitungMean(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        double mean = (double) sum / array.length;
        return mean;
    }
}