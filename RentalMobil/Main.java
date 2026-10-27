public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("L 1024 AB", 450000.0, "Toyota Avanza", "Manual");
        Mobil mobil2 = new Mobil("L 7790 Dev", 850000.0, "Honda CR-V Turbo", "Automatic");

        Pelanggan p1 = new Pelanggan("CUST-001", "Ahmad Rizqi");
        p1.sewaMobil(mobil1);
        p1.sewaMobil(mobil2);

        p1.tampilkanInfoSewa(3);

        System.out.println("\n=== DEMO POLYMORPHISM KENDARAAN ===");
        Kendaraan[] armada = {
                mobil1,
                mobil2,
                new Kendaraan("B 9999 GEN", 250000.0)
        };

        for (Kendaraan k : armada) {
            k.tampilkanInfo();
            System.out.println("----------------------------------------");
        }
    }
}