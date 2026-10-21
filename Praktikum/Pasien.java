
import java.util.Locale;
import java.util.Scanner;

public class Pasien {

    String namaPasien;
    double suhuTubuh;

    public Pasien(String namaPasien, double suhuTubuh) {
        this.namaPasien = namaPasien;
        this.suhuTubuh = suhuTubuh;
    }

    private static String bacaNama(Scanner scanner) {
        while (true) {
            System.out.print("Masukkan Nama Pasien : ");
            String nama = scanner.nextLine().trim();
            if (!nama.isEmpty()) {
                return nama;
            }
            System.out.println("[PERINGATAN] Nama pasien tidak boleh kosong.");
        }
    }

    private static double bacaSuhu(Scanner scanner) {
        while (true) {
            System.out.print("Masukkan Suhu Tubuh  : ");
            String masukan = scanner.nextLine().trim();
            try {
                double suhu = Double.parseDouble(masukan);
                if (Double.isFinite(suhu) && suhu > 0.0) {
                    return suhu;
                }
                System.out.println("[PERINGATAN] Suhu harus berupa angka lebih besar dari 0.");
            } catch (NumberFormatException e) {
                System.out.println("[PERINGATAN] Suhu harus berupa angka yang valid.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pasien[] daftarPasien = new Pasien[5];
        double totalSuhu = 0.0;

        System.out.println("=== INPUT DATA PASIEN ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("Data Pasien ke-" + (i + 1));
            String nama = bacaNama(scanner);
            double suhu = bacaSuhu(scanner);

            daftarPasien[i] = new Pasien(nama, suhu);
            totalSuhu += suhu;
            System.out.println();
        }

        // Tahap Process: Menghitung rata-rata suhu tubuh
        double rataRata = totalSuhu / daftarPasien.length;

        // Tahap Output: Menampilkan seluruh data dan rata-rata
        System.out.println("=== DAFTAR REKAPITULASI PASIEN ===");
        for (int i = 0; i < daftarPasien.length; i++) {
            System.out.printf(Locale.ROOT, "%d. Nama: %-15s | Suhu: %.1f C%n",
                    (i + 1), daftarPasien[i].namaPasien, daftarPasien[i].suhuTubuh);
        }
        System.out.println("----------------------------------------");
        System.out.printf(Locale.ROOT, "Rata-rata Suhu Tubuh Seluruh Pasien: %.2f C%n", rataRata);
    }
}
