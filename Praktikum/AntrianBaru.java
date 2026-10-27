import java.util.Scanner;

public class AntrianBaru {

    String namaPasien;
    String nomorAntrian;

    public AntrianBaru(String namaPasien, String nomorAntrian) {
        this.namaPasien = namaPasien;
        this.nomorAntrian = nomorAntrian;
    }

    private static String bacaTeksWajib(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String nilai = scanner.nextLine().trim();
            if (!nilai.isEmpty()) {
                return nilai;
            }
            System.out.println("[PERINGATAN] Input tidak boleh kosong.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilai = scanner.nextInt();
        scanner.nextLine();
        Antrian[] antrianKlinik = new Antrian[nilai];

        System.out.println("=== SISTEM REGISTRASI ANTRIAN KLINIK ===");
        for (int i = 0; i < nilai; i++) {
            System.out.println("Registrasi Antrian ke-" + (i + 1));
            String noAntrian = bacaTeksWajib(scanner,
                    "Masukkan Nomor Antrian (misal: A-0" + (i + 1) + ") : ");
            String nama = bacaTeksWajib(scanner, "Masukkan Nama Pasien : ");

            antrianKlinik[i] = new Antrian(nama, noAntrian);
            System.out.println();
        }

        System.out.println("=== DAFTAR ANTRIAN PEMERIKSAAN ===");
        for (int i = 0; i < antrianKlinik.length; i++) {
            System.out.println("Urutan " + (i + 1) + " -> [No: " + antrianKlinik[i].nomorAntrian
                    + "] Nama Pasien: " + antrianKlinik[i].namaPasien);
        }
        System.out.println("----------------------------------------");
        System.out.println("Jumlah Total Pasien Mengantre: " + antrianKlinik.length + " orang.");
    }
}
