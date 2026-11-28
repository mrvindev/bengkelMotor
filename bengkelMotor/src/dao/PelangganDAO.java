package bengkelMotor.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bengkelMotor.src.koneksi.Koneksi;
import bengkelMotor.src.model.Pelanggan;

public class PelangganDAO {
    public static void insert(Pelanggan pelanggan) {
        String sql = "INSERT INTO pelanggan (nama_pelanggan, jenis_kelamin, alamat, no_telepon) VALUES (?, ?, ?, ?)";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pelanggan.getNamaPelanggan());
            stmt.setString(2, pelanggan.getJenisKelamin().getKode());
            stmt.setString(3, pelanggan.getAlamat());
            stmt.setString(4, pelanggan.getNoTelp());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Pelanggan> findAll() {
        List<Pelanggan> list = new ArrayList<>();
        String sql = "SELECT * FROM pelanggan ORDER BY id_pelanggan";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                list.add(map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static Pelanggan findById(int idPelanggan) {
        String sql = "SELECT * FROM pelanggan WHERE id_pelanggan = ?";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPelanggan);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return map(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void update(Pelanggan pelanggan) {
        String sql = "UPDATE pelanggan SET nama_pelanggan = ?, jenis_kelamin = ?, alamat = ?, no_telepon = ? WHERE id_pelanggan = ?";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pelanggan.getNamaPelanggan());
            stmt.setString(2, pelanggan.getJenisKelamin().getKode());
            stmt.setString(3, pelanggan.getAlamat());
            stmt.setString(4, pelanggan.getNoTelp());
            stmt.setInt(5, pelanggan.getIdPelanggan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int idPelanggan) {
        String sql = "DELETE FROM pelanggan WHERE id_pelanggan = ?";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPelanggan);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Pelanggan map(ResultSet rs) throws SQLException {
        return new Pelanggan(
                rs.getInt("id_pelanggan"),
                rs.getString("nama_pelanggan"),
                toJenisKelamin(rs.getString("jenis_kelamin")),
                rs.getString("alamat"),
                rs.getString("no_telepon"));
    }

    private static Pelanggan.JenisKelamin toJenisKelamin(String kode) {
        return "P".equalsIgnoreCase(kode)
                ? Pelanggan.JenisKelamin.PEREMPUAN
                : Pelanggan.JenisKelamin.LAKI_LAKI;
    }
}
