package JDBC_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_insert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String password = "tirth@G503";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            // PREPARED Statement
            PreparedStatement prepareStatement = connection.prepareStatement("insert into employee values (?, ?, ?)");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Enter employee Number: ");
                int eno = Integer.parseInt(br.readLine());

                System.out.println("Enter employee Name: ");
                String ename = br.readLine();

                System.out.println("Enter employee Salary: ");
                int esalary = Integer.parseInt(br.readLine());

                // INSERT
                prepareStatement.setInt(1,eno);
                prepareStatement.setString(2,ename);
                prepareStatement.setInt(3,esalary);

                int count = prepareStatement.executeUpdate();

                if (count > 0){
                    System.out.println(count+ " Row updated");
                }
                else {
                    System.out.println("No row updated");
                }

                System.out.println("Do you want to add more records? yes/no : ");
                String choice = br.readLine();
                if (choice.equalsIgnoreCase("no")){
                    System.out.println("Record updated");
                    break;
                }
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            System.out.println("Error occurred: "+e);
        }


    }
}
