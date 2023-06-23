import java.util.Scanner;

public class DrawXYZ {
    public static void main(String[] args) {
        System.out.println("=============GAMBAR XYZ=============");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan parameter tinggi: ");
        int height = input.nextInt();

        DrawXYZ(height);

        System.out.println("=============BERHASIL=============");
    }
    private static void DrawXYZ(int height){
            int a = 0;
            for (int i = 0; i < height; i++){
                System.out.println();
                for (int j = 1; j <= height; j++){

                    ++a;

                    if (a % 3 == 0){
                        System.out.print(" X ");
                    }
                    else if (a % 2 == 1){
                        System.out.print(" Y ");
                    }
                    else if (a % 2 == 0){
                        System.out.print(" Z ");
                    }
                }
            }
            System.out.println();
    }
}