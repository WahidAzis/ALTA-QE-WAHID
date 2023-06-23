class Pengurangan extends OperasiMatematika {
    public Pengurangan(double angka1, double angka2) {
        super(angka1, angka2);
    }

    @Override
    public void operasi() {
        double hasilKurang = angka1 - angka2;
        System.out.println("Hasil Pengurangan(-): " + hasilKurang);
    }
}
