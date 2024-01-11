package PHASE2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            System.out.println("Connected to the database");

            // Create a statement object
            try (Statement statement = connection.createStatement()) {
                // Create a table
                String createTableSQL = "CREATE TABLE Enseignant" + "( id int primary key auto_increment," +
                        "Nom VARCHAR (30)," + "Prenom VARCHAR(50)," + " email VARCHAR(30)," + "grade VARCHAR(8)," + "dept VARCHAR(30))";
                statement.executeUpdate(createTableSQL);
                System.out.println("Table 'Enseignant' created");

                // Insert data into the table
                String insertDataSQL =  "INSERT INTO enseignant (id, nom, prenom ,email,grade, dept) VALUES (1, 'ayman', 'abbad','ayman12qmail.com', 'chef','info')";

                statement.executeUpdate(insertDataSQL);
                System.out.println("Data inserted into the 'users' table");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
