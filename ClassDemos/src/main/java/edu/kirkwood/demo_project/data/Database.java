package edu.kirkwood.demo_project.data;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Database {
    public static Connection getConnection() {
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
// Does the driver exist?
            Class.forName(driver);
//            System.out.println("Driver found");
        } catch (ClassNotFoundException e) {
//            System.out.println("Driver not found");
            return null;
        }
        Dotenv dotenv = Dotenv.load();
        String connectionString = dotenv.get("DB_CONNECTION_HOTEL");
        String username = dotenv.get("DB_USERNAME");
        String password = dotenv.get("DB_PASSWORD");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
//            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
//            System.out.println("Connection failed");
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
