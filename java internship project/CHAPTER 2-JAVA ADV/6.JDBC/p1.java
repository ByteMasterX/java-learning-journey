
import java.sql.*;

public class p1 {

    static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    static final String dbURL = "jdbc:mysql://localhost/mytestdb";

    public static void main(String[] args) {

        Connection conn = null;

        try {

            Class.forName(jdbcDriver);

            conn = DriverManager.getConnection(
                    dbURL,
                    "root",
                    "12345"
            );

            System.out.println("Database connected successfully!");

        } catch (ClassNotFoundException e) {

            System.out.println("JDBC Driver not found");
            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("Database connection failed");
            e.printStackTrace();

        } finally {

            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}