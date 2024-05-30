package JDBC_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_update {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String password = "tirth@G503";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user, password);

            Statement statement = connection.createStatement();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter employee number: ");
            int eno = Integer.parseInt(br.readLine());
            System.out.println("Enter new salary: ");
            int salary = Integer.parseInt(br.readLine());
            int count = statement.executeUpdate("update employee set Salary=" +salary+ " where No=" +eno);

            if(count>0){
                System.out.println(count+ " records updated");
            }
            else {
                System.out.println("No records updated");
            }
        } catch (ClassNotFoundException | SQLException | IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
