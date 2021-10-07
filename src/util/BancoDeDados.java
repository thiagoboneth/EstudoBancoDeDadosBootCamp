package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","CP1141rmftc@");
        return conn;
    }
}
