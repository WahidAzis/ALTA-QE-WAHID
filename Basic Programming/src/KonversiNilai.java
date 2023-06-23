import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        System.out.println("==============Konversi Nilai Mahasiswa Universitas XYZ==============");
        Scanner input= new Scanner (System.in);
        int grade;
        String nama, nim;
        System.out.print("Masukan Nama Mahasiswa    : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM Mahasiswa     : ");
        nim = input.nextLine();
        System.out.print("Masukan Nilai Mahasiswa   : ");
        grade = input.nextInt();
        if( grade > 80 ){
            System.out.println("Nilai Grade Anda = A" );
        }
        else if( (grade < 80) && (grade > 65)){
            System.out.println("Nilai Grade Anda = B+" );
        }
        else if( (grade < 65) && (grade > 50)){
            System.out.println("Nilai Grade Anda = B" );
        }
        else if( (grade < 50) && (grade > 34)){
            System.out.println("Nilai Grade Anda = C" );
        }
        else{
            System.out.println("Nilai Grade Anda = D");
            
        }
    }
}