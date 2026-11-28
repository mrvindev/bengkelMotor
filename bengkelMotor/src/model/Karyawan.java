package bengkelMotor.src.model;

public class Karyawan {
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

    private int idKaryawan;
    private String namaKaryawan;
    private JenisKelamin jenisKelamin;
    private String alamat;
    private String noTelp;
    private String jabatan;

    public Karyawan(int idKaryawan, String namaKaryawan, JenisKelamin jenisKelamin, String alamat, String noTelp, String jabatan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jabatan = jabatan;
    }

    //getter & setter
    public int getIdKaryawan() {
        return idKaryawan;
    }
    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
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
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
