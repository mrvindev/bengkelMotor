package bengkelMotor.src.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Servis {
    public enum StatusServis {
        MENUNGGU("Menunggu"),
        DIKERJAKAN("Dikerjakan"),
        SELESAI("Selesai");

        private final String label;

        StatusServis(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public static StatusServis fromLabel(String label) {
            for (StatusServis status : values()) {
                if (status.label.equalsIgnoreCase(label)) {
                    return status;
                }
            }
            return MENUNGGU;
        }
    }

    private int idServis;
    private int idKendaraan;
    private int idKaryawan;
    private int idLayanan;
    private LocalDate tanggalServis;
    private LocalTime jamServis;
    private String keluhan;
    private StatusServis statusServis;
    private double totalBiaya;

    public Servis(int idServis, int idKendaraan, int idKaryawan, int idLayanan,
            LocalDate tanggalServis, LocalTime jamServis, String keluhan,
            StatusServis statusServis, double totalBiaya) {
        this.idServis = idServis;
        this.idKendaraan = idKendaraan;
        this.idKaryawan = idKaryawan;
        this.idLayanan = idLayanan;
        this.tanggalServis = tanggalServis;
        this.jamServis = jamServis;
        this.keluhan = keluhan;
        this.statusServis = statusServis;
        this.totalBiaya = totalBiaya;
    }

    //getter & setter
    public int getIdServis() {
        return idServis;
    }
    public void setIdServis(int idServis) {
        this.idServis = idServis;
    }
    public int getIdKendaraan() {
        return idKendaraan;
    }
    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }
    public int getIdKaryawan() {
        return idKaryawan;
    }
    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    public int getIdLayanan() {
        return idLayanan;
    }
    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }
    public LocalDate getTanggalServis() {
        return tanggalServis;
    }
    public void setTanggalServis(LocalDate tanggalServis) {
        this.tanggalServis = tanggalServis;
    }
    public LocalTime getJamServis() {
        return jamServis;
    }
    public void setJamServis(LocalTime jamServis) {
        this.jamServis = jamServis;
    }
    public String getKeluhan() {
        return keluhan;
    }
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    public StatusServis getStatusServis() {
        return statusServis;
    }
    public void setStatusServis(StatusServis statusServis) {
        this.statusServis = statusServis;
    }
    public double getTotalBiaya() {
        return totalBiaya;
    }
    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }
}
