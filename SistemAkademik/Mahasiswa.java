import java.util.ArrayList;

public class Mahasiswa extends Pengguna {
    private String nim;
    private ArrayList<MataKuliah> daftarMK;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.daftarMK = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public void daftarKRS(MataKuliah mk) {
        daftarMK.add(mk);
    }

    public int hitungTotalSks() {
        int total = 0;
        for (MataKuliah mk : daftarMK) {
            total += mk.getSks();
        }
        return total;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM       : " + nim);
        System.out.println("Total SKS : " + hitungTotalSks());
        System.out.println("Daftar Mata Kuliah Diambil:");
        for (int i = 0; i < daftarMK.size(); i++) {
            MataKuliah mk = daftarMK.get(i);
            System.out.println(
                    "  " + (i + 1) + ". [" + mk.getKode() + "] " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }
    }
}