package bengkelMotor.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bengkelMotor.src.koneksi.Koneksi;
import bengkelMotor.src.model.Karyawan;

public class KaryawanDAO {
    public static void insert(Karyawan karyawan) {
        String sql = "INSERT INTO karyawan (nama_karyawan, jenis_kelamin, alamat, no_telepon, jabatan) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, karyawan.getNamaKaryawan());
            stmt.setString(2, karyawan.getJenisKelamin().getKode());
            stmt.setString(3, karyawan.getAlamat());
            stmt.setString(4, karyawan.getNoTelp());
            stmt.setString(5, karyawan.getJabatan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Karyawan> findAll() {
        List<Karyawan> list = new ArrayList<>();
        String sql = "SELECT * FROM karyawan ORDER BY id_karyawan";
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

    public static Karyawan findById(int idKaryawan) {
        String sql = "SELECT * FROM karyawan WHERE id_karyawan = ?";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idKaryawan);
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

    public static void update(Karyawan karyawan) {
        String sql = "UPDATE karyawan SET nama_karyawan = ?, jenis_kelamin = ?, alamat = ?, no_telepon = ?, jabatan = ? WHERE id_karyawan = ?";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, karyawan.getNamaKaryawan());
            stmt.setString(2, karyawan.getJenisKelamin().getKode());
            stmt.setString(3, karyawan.getAlamat());
            stmt.setString(4, karyawan.getNoTelp());
            stmt.setString(5, karyawan.getJabatan());
            stmt.setInt(6, karyawan.getIdKaryawan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int idKaryawan) {
        String sql = "DELETE FROM karyawan WHERE id_karyawan = ?";
        try (Connection conn = Koneksi.getKoneksi();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idKaryawan);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Karyawan map(ResultSet rs) throws SQLException {
        return new Karyawan(
                rs.getInt("id_karyawan"),
                rs.getString("nama_karyawan"),
                toJenisKelamin(rs.getString("jenis_kelamin")),
                rs.getString("alamat"),
                rs.getString("no_telepon"),
                rs.getString("jabatan"));
    }

    private static Karyawan.JenisKelamin toJenisKelamin(String kode) {
        return "P".equalsIgnoreCase(kode)
                ? Karyawan.JenisKelamin.PEREMPUAN
                : Karyawan.JenisKelamin.LAKI_LAKI;
    }
}
