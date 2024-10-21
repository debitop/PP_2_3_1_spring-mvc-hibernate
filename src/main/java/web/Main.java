package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/spring_mvc_hiber?verifyServerCertificate=false&useSSL=false&requireSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root",
                    "root"
            );
            System.out.println("Connection successful!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
