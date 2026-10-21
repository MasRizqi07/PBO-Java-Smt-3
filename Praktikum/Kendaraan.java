public class Kendaraan {
    private String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void tampilkanInfo() {
        System.out.println("Merk Kendaraan : " + merk);
    }

    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Toyota");
        kendaraan.tampilkanInfo();
    }
}