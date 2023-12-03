import java.util.*;
import java.text.*;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date hariSekarang = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("HH:mm:ss a zzz");

        try {
            System.out.print("No. Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("No. HP: ");
            String noHP = scanner.nextLine();

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Mendapatkan waktu saat ini
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy hh:mm:ss Z");

            // Membuat objek transaksi dengan Exception Handling
            Transaksi transaksi = new Transaksi(noFaktur, namaPelanggan, noHP, alamat, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan detail transaksi
            System.out.println("==============================================");
            System.out.println("\t\tMINIMARKET");
            System.out.println("----------------------------------------------");
            System.out.println("Tanggal\t: " + tanggal.format(hariSekarang));
            System.out.println("Waktu\t: " + waktu.format(hariSekarang));

            transaksi.tampilkanDetailTransaksi();
            

        } catch (JumlahBarangException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Input tidak valid");
        } finally {
            scanner.close();
        }
    }
}