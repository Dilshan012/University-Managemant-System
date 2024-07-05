import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DILSHAN-VIVOBOOK
 */

public class databaseConnection {
    // Define the database URL, username, and password as constants
    private static final String URL = "jdbc:mysql://localhost:3306/universitymanagement";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Static method to establish a database connection
    public static Connection connection() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create and return a connection to the database
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            // Handle the exception for the driver class not found
            System.out.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            // Handle the exception for database access errors
            System.out.println("Connection failed! Check output console");
            e.printStackTrace();
            return null;
        }
    }
}
