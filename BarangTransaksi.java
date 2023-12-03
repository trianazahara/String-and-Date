class BarangTransaksi extends Barang implements TotalBayar {
    public BarangTransaksi(String kode, String nama, double harga) {
        super(kode, nama, harga);
    }

    // Implementasi metode interface TotalBayar
    @Override
    public double hitungTotalBayar(double harga, int jumlah) {
        return harga * jumlah;
    }
}