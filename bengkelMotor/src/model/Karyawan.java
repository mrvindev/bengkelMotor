package bengkelMotor.src.model;

public class Karyawan {
    private int idKaryawan;
    private String namaKaryawan;
    private enum JenisKelamin {
        LAKI_LAKI,
        PEREMPUAN
    }
    private String Alamat;
    private String NoTelp;
    privte String Jabatan;



    public Karyawan(int IdKaryawan, String namaKaryawan, JenisKelamin jenisKelamin, String Alamat, String NoTelp, String Jabatan) {
        this.idKaryawan = IdKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.jenisKelamin = jenisKelamin;
        this.Alamat = Alamat;
        this.NoTelp = NoTelp;
        this.Jabatan = Jabatan;
    }

    //getter & setter
    public String getIdKaryawan() {
        return String.valueOf(idKaryawan);
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
    public String getJabatan() {
        return Jabatan;
    }
    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }
}
