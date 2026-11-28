package bengkelMotor.src.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/bengkel_motor";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conn;

    private Koneksi() {
    }

    public static Connection getKoneksi() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}
