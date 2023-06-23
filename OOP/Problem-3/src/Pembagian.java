class Pembagian extends OperasiMatematika {
    public Pembagian(double angka1, double angka2) {
        super(angka1, angka2);
    }

    public void operasi() {
        if (angka2 == 0) {
            System.out.println("OOPS!!!: Pembagian oleh nol tidak valid/invalid.");
        } else {
            double hasilBagi = angka1 / angka2;
            System.out.println("Hasil Pembagian: " + hasilBagi);
        }
    }
}
