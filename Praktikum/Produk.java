import java.text.NumberFormat;
import java.util.Locale;

public class Produk {
    String namaProduk;
    String kategori;
    double harga;

    public Produk(String namaProduk, String kategori, double harga) {
        this.namaProduk = namaProduk;
        this.kategori = kategori;
        this.harga = harga;
    }

    public static void tampilkanInfo(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Data produk tidak boleh null.");
        }
        NumberFormat formatHarga = NumberFormat.getIntegerInstance(Locale.forLanguageTag("id-ID"));
        System.out.println("Nama Produk : " + produk.namaProduk);
        System.out.println("Kategori    : " + produk.kategori);
        System.out.println("Harga       : Rp " + formatHarga.format(produk.harga));
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Produk item1 = new Produk("Laptop Gaming Asus", "Elektronik", 14500000.0);
        Produk item2 = new Produk("Mouse Wireless", "Aksesoris", 175000.0);

        Produk.tampilkanInfo(item1);
        Produk.tampilkanInfo(item2);
    }
}