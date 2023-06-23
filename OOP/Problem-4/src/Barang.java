public class Barang {
    int panjang;
    int lebar;
    int tinggi;
    double berat;

    public Barang(int panjang, int lebar, int tinggi, double berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public double hitungHarga() {
        double dimensi = panjang * lebar * tinggi;
        double harga = 0;

        if (dimensi >= 50 && berat >= 1) {
            double beratPembulatan = Math.ceil(berat);
            harga = (dimensi / 50) * (beratPembulatan - 1) * 5000;
        }

        return harga;
    }
}

