public class Main {
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("IF101", "Pemrograman Berorientasi Objek", 3);
        MataKuliah bd = new MataKuliah("IF102", "Basis Data", 3);
        MataKuliah jarkom = new MataKuliah("IF103", "Jaringan Komputer", 3);

        Mahasiswa ana = new Mahasiswa("Ana", "231001");
        ana.daftarKRS(pbo);
        ana.daftarKRS(bd);
        ana.daftarKRS(jarkom);

        Dosen dosenPbo = new Dosen("Dr. Rahmi Rizkiana Putri", "071201");

        Pengguna[] daftarPengguna = { ana, dosenPbo };

        System.out.println("=== REKAP DATA SISTEM AKADEMIK ===");
        for (Pengguna p : daftarPengguna) {
            p.tampilkanInfo();
            System.out.println("----------------------------------------");
        }
    }
}