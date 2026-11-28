package bengkelMotor.src.model;

public class Pelanggan {
    public enum JenisKelamin {
        LAKI_LAKI("L"),
        PEREMPUAN("P");

        private final String kode;

        JenisKelamin(String kode) {
            this.kode = kode;
        }

        public String getKode() {
            return kode;
        }
    }

    private int idPelanggan;
    private String namaPelanggan;
    private JenisKelamin jenisKelamin;
    private String alamat;
    private String noTelp;

    public Pelanggan(int idPelanggan, String namaPelanggan, JenisKelamin jenisKelamin, String alamat, String noTelp) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    //getter & setter
    public int getIdPelanggan() {
        return idPelanggan;
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
    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNoTelp() {
        return noTelp;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
}
