import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        System.out.println("=============Bilangan Prima=============");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Bilangan: ");
        int number = input.nextInt();

        boolean Prima = AngkaPrima(number);
        System.out.println(number + " adalah Bilangan Prima: " + Prima);
    }
    private static boolean AngkaPrima(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
