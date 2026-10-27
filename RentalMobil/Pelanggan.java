import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Mobil> daftarMobilSewa;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.daftarMobilSewa = new ArrayList<>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void sewaMobil(Mobil mobil) {
        daftarMobilSewa.add(mobil);
    }

    public double hitungTotalBiaya(int durasiHari) {
        double total = 0;
        for (Mobil m : daftarMobilSewa) {
            total += m.getTarifPerHari() * durasiHari;
        }
        return total;
    }

    public void tampilkanInfoSewa(int durasiHari) {
        System.out.println("========================================");
        System.out.println("ID Pelanggan    : " + idPelanggan);
        System.out.println("Nama Penyewa    : " + nama);
        System.out.println("Daftar Mobil yang Disewa (" + daftarMobilSewa.size() + " unit):");
        for (int i = 0; i < daftarMobilSewa.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + daftarMobilSewa.get(i).getNamaModel() +
                    " [" + daftarMobilSewa.get(i).getNoPlat() + "]");
        }
        System.out.printf("Total Biaya Sewa (%d Hari): Rp %,.2f%n", durasiHari, hitungTotalBiaya(durasiHari));
        System.out.println("========================================");
    }
}