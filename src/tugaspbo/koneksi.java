package tugaspbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/kacamoo_pbo_db", "root", "");
    }

    void Connection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

