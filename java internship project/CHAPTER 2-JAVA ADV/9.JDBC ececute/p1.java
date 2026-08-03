import java.sql.*;

public class p1 {

    public static void main(String[] args) {

        String url = "jdbc:sqlite:test.db";

        try {

            Connection conn = DriverManager.getConnection(url);

            System.out.println("SQLite Connection Successful");

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM student"
            );

            while(rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age")
                );
            }

            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}