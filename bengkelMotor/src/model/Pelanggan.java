package bengkelMotor.src.model;

public class Pelanggan {
    private int idPelanggan;
    private String namaPelanggan;
    private enum JenisKelamin {
        LAKI_LAKI,
        PEREMPUAN
    }
    private String Alamat;
    private String NoTelp;

    public Pelanggan(int IdPelanggan, String namaPelanggan, JenisKelamin jenisKelamin, String Alamat, String NoTelp) {
        this.idPelanggan = IdPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.jenisKelamin = jenisKelamin;
        this.Alamat = Alamat;
        this.NoTelp = NoTelp;
    }

    //getter & setter
    public String getIdPelanggan() {
        return String.valueOf(idPelanggan);
    }
    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    public String getNoTelp() {
        return NoTelp;
    }
    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }
}
