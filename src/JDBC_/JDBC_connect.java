package JDBC_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_connect {

    public static void main(String[] args) {

        // connection details
        String url = "jdbc:mysql://localhost:3306/javadb";
        String username = "root";
        String password = "tirth@G503";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Get a connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");

            // Create a statement
            Statement statement = connection.createStatement();
            System.out.println("Statement created");

            //create table
            statement.executeUpdate("create table employee (No int, Name varchar(30), Salary int)");
            System.out.println("Table created");
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}