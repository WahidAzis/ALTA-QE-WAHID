import java.util.Scanner;

public class PALINDROME {
    public static void main(String[] args) {
        System.out.println("=============Palindrome atau Palindrome=============");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata/kalimat: ");
        String kata = input.nextLine();

        if (iniPalindrome(kata)) {
            System.out.println("Kalimat tersebut adalah PALINDROME.");
        } else {
            System.out.println("Kalimat tersebut bukan PALINDROME.");
        }
        System.out.println("=============BERHASIL=============");
    }
    private static boolean iniPalindrome(String kalimat) {
        // Untuk menghapus karakter yang tidak diperlukan dari inputan
        String hapusKalimat = kalimat.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Untuk mengecek apakah kata/kalimat yang di input merupakan Palindrome atau bukan
        String balikKalimat = new StringBuilder(hapusKalimat).reverse().toString();
        return hapusKalimat.equals(balikKalimat);
    }

}