class Perkalian extends OperasiMatematika {
    public Perkalian(double angka1, double angka2) {
        super(angka1, angka2);
    }

    @Override
    public void operasi() {
        double hasilKali = angka1 * angka2;
        System.out.println("Hasil Perkalian(*): " + hasilKali);
    }
}
