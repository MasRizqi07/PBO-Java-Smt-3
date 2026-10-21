
public class Toko {

    String namaToko;
    String alamat;
    int jumlahKaryawan;

    public Toko(String namaToko, String alamat, int jumlahKaryawan) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.jumlahKaryawan = jumlahKaryawan;
    }

    public static void tampilkanData(Toko toko) {
        System.out.println("Nama Toko       : " + toko.namaToko);
        System.out.println("Alamat          : " + toko.alamat);
        System.out.println("Jumlah Karyawan : " + toko.jumlahKaryawan);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Toko toko1 = new Toko("Toko Sumber Rejeki", "Jl. Klampis Ngasem No. 12, Surabaya", 8);
        Toko.tampilkanData(toko1);
    }
}
