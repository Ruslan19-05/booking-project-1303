package az.edu.turing.confing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/projectTask";
        String user = "postgres";
        String password = "nusrtcrkz@1";
        return DriverManager.getConnection(url, user, password);
    }
}
