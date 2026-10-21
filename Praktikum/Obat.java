
import java.util.Scanner;

public class Obat {

    String namaObat;
    int stok;

    public Obat(String namaObat, int stok) {
        this.namaObat = namaObat;
        this.stok = stok;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Obat[] dataObat = new Obat[3];
        long totalStok = 0;

        System.out.println("=== PENDATAAN STOK OBAT ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Input Obat ke-" + (i + 1));
            String nama;
            while (true) {
                System.out.print("Masukkan Nama Obat : ");
                nama = scanner.nextLine().trim();
                if (!nama.isEmpty()) {
                    break;
                }
                System.out.println("[PERINGATAN] Nama obat tidak boleh kosong.");
            }

            int stokInput;
            while (true) {
                System.out.print("Masukkan Jumlah Stok (Minimal 10) : ");
                String masukan = scanner.nextLine().trim();
                try {
                    stokInput = Integer.parseInt(masukan);
                    if (stokInput >= 10) {
                        break;
                    }
                    System.out.println("[PERINGATAN] Stok tidak boleh kurang dari 10. Silakan ulangi!");
                } catch (NumberFormatException e) {
                    System.out.println("[PERINGATAN] Stok harus berupa bilangan bulat.");
                }
            }

            dataObat[i] = new Obat(nama, stokInput);
            totalStok += stokInput;
            System.out.println();
        }

        // Tahap Output
        System.out.println("=== LAPORAN STOK OBAT VALID ===");
        for (int i = 0; i < dataObat.length; i++) {
            System.out.println((i + 1) + ". Obat: " + dataObat[i].namaObat + " | Stok: " + dataObat[i].stok);
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Keseluruhan Stok Obat : " + totalStok);
    }
}
