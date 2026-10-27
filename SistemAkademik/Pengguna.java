public class Pengguna {
    private String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama      : " + nama);
    }
}