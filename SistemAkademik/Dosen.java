public class Dosen extends Pengguna {
    private String nidn;

    public Dosen(String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void mengajar() {
        System.out.println("Dosen " + getNama() + " sedang mengajar perkuliahan.");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIDN      : " + nidn);
    }
}