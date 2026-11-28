package bengkelMotor.src.model;

public class Kendaraan {
    private int idKendaraan;
    private int idPelanggan;
    private String nomorPolisi;
    private String merekMotor;
    private String tipeMotor;
    private int tahunMotor;
    private String warnaMotor;

    public Kendaraan(int idKendaraan, int idPelanggan, String nomorPolisi, String merekMotor,
            String tipeMotor, int tahunMotor, String warnaMotor) {
        this.idKendaraan = idKendaraan;
        this.idPelanggan = idPelanggan;
        this.nomorPolisi = nomorPolisi;
        this.merekMotor = merekMotor;
        this.tipeMotor = tipeMotor;
        this.tahunMotor = tahunMotor;
        this.warnaMotor = warnaMotor;
    }

    //getter & setter
    public int getIdKendaraan() {
        return idKendaraan;
    }
    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }
    public int getIdPelanggan() {
        return idPelanggan;
    }
    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNomorPolisi() {
        return nomorPolisi;
    }
    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }
    public String getMerekMotor() {
        return merekMotor;
    }
    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    public String getTipeMotor() {
        return tipeMotor;
    }
    public void setTipeMotor(String tipeMotor) {
        this.tipeMotor = tipeMotor;
    }
    public int getTahunMotor() {
        return tahunMotor;
    }
    public void setTahunMotor(int tahunMotor) {
        this.tahunMotor = tahunMotor;
    }
    public String getWarnaMotor() {
        return warnaMotor;
    }
    public void setWarnaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
    }
}
