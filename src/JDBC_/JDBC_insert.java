package JDBC_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_insert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jabadb";
        String user = "root";
        String password = "tirth@G503";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
