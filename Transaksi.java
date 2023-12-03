// Kelas transaksi sebagai child class dari BarangTransaksi dan menggunakan Exception Handling
class Transaksi extends BarangTransaksi {
    private String noFaktur;
    private String namaPelanggan;
    private String noHP;
    private String alamat;
    private int jumlahBeli;

    

    public Transaksi(String noFaktur, String namaPelanggan, String noHP, String alamat, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) throws JumlahBarangException {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.noHP = noHP;
        this.alamat = alamat;
        

        if (jumlahBeli <= 0) {
            throw new JumlahBarangException("Jumlah barang tidak valid");
        }

        this.jumlahBeli = jumlahBeli;
    }

    // Getter untuk nomor faktur
    public String getNoFaktur() {
        return noFaktur;
    }

    // Getter untuk nama pelanggan
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    // Getter untuk nomor HP
    public String getNoHP() {
        return noHP;
    }

    // Getter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    // Getter untuk jumlah beli
    public int getJumlahBeli() {
        return jumlahBeli;
    }
    
    // Metode untuk menampilkan detail transaksi
    public void tampilkanDetailTransaksi() {
        System.out.println("==============================================");
        System.out.println("\t\tDATA PELANGGAN");
        System.out.println("---------------------");
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No. HP\t: " + noHP);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t\tDATA PEMBELIAN BARANG\t");
        System.out.println("-----------------------------");
        System.out.println("Kode Barang\t: " + kode);
        System.out.println("Nama Barang\t: " + nama);
        System.out.println("Harga Barang\t: " + harga);
        System.out.println("Jumlah Beli\t: " + jumlahBeli);
        System.out.println("TOTAL BAYAR\t: " + hitungTotalBayar(getHarga(), jumlahBeli));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Kasir\t:" + "Triana Zahara");
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("Uppercase\t: " + namaPelanggan.toUpperCase());
    }
}
