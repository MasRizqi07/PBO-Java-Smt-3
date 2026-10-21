public class Karyawan {
    String nama;
    String idKaryawan;
    String posisi;

    // Constructor tanpa parameter
    public Karyawan() {
        this.nama = "Belum Terdaftar";
        this.idKaryawan = "KRY-000";
        this.posisi = "Trainee";
    }

    // Constructor dengan parameter
    public Karyawan(String nama, String idKaryawan, String posisi) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.posisi = posisi;
    }

    public static void tampilkanInfo(Karyawan k) {
        if (k == null) {
            throw new IllegalArgumentException("Data karyawan tidak boleh null.");
        }
        System.out.println("ID Karyawan : " + k.idKaryawan);
        System.out.println("Nama        : " + k.nama);
        System.out.println("Posisi      : " + k.posisi);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        // Objek 1: Constructor tanpa parameter
        Karyawan karyawan1 = new Karyawan();

        // Objek 2 dan 3: Constructor berparameter
        Karyawan karyawan2 = new Karyawan("Ahmad Rizqi", "KRY-101", "Software Engineer");
        Karyawan karyawan3 = new Karyawan("Dimas Satria", "KRY-102", "Quality Assurance");

        Karyawan.tampilkanInfo(karyawan1);
        Karyawan.tampilkanInfo(karyawan2);
        Karyawan.tampilkanInfo(karyawan3);
    }
}