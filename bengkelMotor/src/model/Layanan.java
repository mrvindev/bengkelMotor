package bengkelMotor.src.model;

public class Layanan {
    private int idLayanan;
    private String namaLayanan;
    private String deskripsi;
    private double hargaLayanan;

    public Layanan(int idLayanan, String namaLayanan, String deskripsi, double hargaLayanan) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.deskripsi = deskripsi;
        this.hargaLayanan = hargaLayanan;
    }

    //getter & setter
    public int getIdLayanan() {
        return idLayanan;
    }
    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }
    public String getNamaLayanan() {
        return namaLayanan;
    }
    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public double getHargaLayanan() {
        return hargaLayanan;
    }
    public void setHargaLayanan(double hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }
}
