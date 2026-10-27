public class Kendaraan {
    private String noPlat;
    private double tarifPerHari;

    public Kendaraan(String noPlat, double tarifPerHari) {
        this.noPlat = noPlat;
        this.tarifPerHari = tarifPerHari;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public double getTarifPerHari() {
        return tarifPerHari;
    }

    public void setTarifPerHari(double tarifPerHari) {
        if (tarifPerHari > 0) {
            this.tarifPerHari = tarifPerHari;
        }
    }

    public void tampilkanInfo() {
        System.out.println("No Plat         : " + noPlat);
        System.out.printf("Tarif Per Hari  : Rp %,.2f%n", tarifPerHari);
    }
}