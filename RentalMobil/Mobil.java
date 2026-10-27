public class Mobil extends Kendaraan {
    private String namaModel;
    private String tipeTransmisi;

    public Mobil(String noPlat, double tarifPerHari, String namaModel, String tipeTransmisi) {
        super(noPlat, tarifPerHari);
        this.namaModel = namaModel;
        this.tipeTransmisi = tipeTransmisi;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public String getTipeTransmisi() {
        return tipeTransmisi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Model Mobil     : " + namaModel);
        System.out.println("Transmisi       : " + tipeTransmisi);
    }
}