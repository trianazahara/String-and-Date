// Kelas barang sebagai parent class
class Barang {
    protected String kode;
    protected String nama;
    protected double harga;

    public Barang(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}