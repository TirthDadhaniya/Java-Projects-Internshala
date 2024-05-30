package JDBC_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_delete {

    public static void main(String[] args) {

        // connection details
        String url = "jdbc:mysql://localhost:3306/javadb";
        String username = "root";
        String password = "tirth@G503";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.println("Enter employee number: ");
                int eno = Integer.parseInt(br.readLine());
                int count = statement.executeUpdate("delete from employee where No=" + eno);

                if (count == 1) {
                    System.out.println("Employee deleted successfully");
                }
                else{
                    System.out.println("No records deleted");
                }
                System.out.println("Do you want to delete more records? (y/n)");
                String answer = br.readLine();

                if (answer.equalsIgnoreCase("n")){
                    break;
                }
            }
        }
        catch (ClassNotFoundException | IOException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
