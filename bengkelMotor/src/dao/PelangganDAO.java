package bengkelMotor.src.dao;

package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import koneksi.Koneksi;
import model.Pelanggan;

public class PelangganDAO {
    public static void insert(Pelanggan pelanggan) {
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "INSERT INTO pelanggan (nama_pelanggan, jenis_kelamin, alamat, no_telp) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pelanggan.getNamaPelanggan());
            stmt.setString(2, pelanggan.getJenisKelamin().name());
            stmt.setString(3, pelanggan.getAlamat());
            stmt.setString(4, pelanggan.getNoTelp());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
