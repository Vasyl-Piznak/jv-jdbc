package mate.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cant load JDBC driver for my SQL", e);
        }

    }

    public static Connection getConnection() {
        try {
            Properties dbProperties = new Properties();
            dbProperties.put("user", "root");
            dbProperties.put("password", "dfcz555553145");
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/library_db", dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Cant create connection to DB", e);
        }
    }
}
