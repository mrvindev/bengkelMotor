package bengkelMotor.src.model;

import java.time.LocalDate;

public class Pembayaran {
    public enum MetodePembayaran {
        TUNAI("Tunai"),
        TRANSFER("Transfer"),
        QRIS("QRIS");

        private final String label;

        MetodePembayaran(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public static MetodePembayaran fromLabel(String label) {
            for (MetodePembayaran metode : values()) {
                if (metode.label.equalsIgnoreCase(label)) {
                    return metode;
                }
            }
            return TUNAI;
        }
    }

    public enum StatusPembayaran {
        LUNAS("Lunas"),
        BELUM_LUNAS("Belum Lunas");

        private final String label;

        StatusPembayaran(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public static StatusPembayaran fromLabel(String label) {
            for (StatusPembayaran status : values()) {
                if (status.label.equalsIgnoreCase(label)) {
                    return status;
                }
            }
            return BELUM_LUNAS;
        }
    }

    private int idPembayaran;
    private int idServis;
    private LocalDate tanggalPembayaran;
    private MetodePembayaran metodePembayaran;
    private double totalPembayaran;
    private StatusPembayaran statusPembayaran;

    public Pembayaran(int idPembayaran, int idServis, LocalDate tanggalPembayaran,
            MetodePembayaran metodePembayaran, double totalPembayaran,
            StatusPembayaran statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.idServis = idServis;
        this.tanggalPembayaran = tanggalPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.totalPembayaran = totalPembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    //getter & setter
    public int getIdPembayaran() {
        return idPembayaran;
    }
    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }
    public int getIdServis() {
        return idServis;
    }
    public void setIdServis(int idServis) {
        this.idServis = idServis;
    }
    public LocalDate getTanggalPembayaran() {
        return tanggalPembayaran;
    }
    public void setTanggalPembayaran(LocalDate tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }
    public MetodePembayaran getMetodePembayaran() {
        return metodePembayaran;
    }
    public void setMetodePembayaran(MetodePembayaran metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    public double getTotalPembayaran() {
        return totalPembayaran;
    }
    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }
    public StatusPembayaran getStatusPembayaran() {
        return statusPembayaran;
    }
    public void setStatusPembayaran(StatusPembayaran statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
}
