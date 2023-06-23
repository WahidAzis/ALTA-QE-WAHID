class Penjumlahan extends OperasiMatematika{
    public Penjumlahan(double angka1, double angka2) {
        super(angka1, angka2);
    }

    @Override
    public void operasi() {
        double hasilTambah = angka1 + angka2;
        System.out.println("Hasil Penjumlahan(+): "+hasilTambah);
    }
}
