package edu.kirkwood.demo_project.data;

import edu.kirkwood.demo_project.model.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO extends Database {
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        // try-with-resources
        try(Connection connection = getConnection()) {
            try(CallableStatement statement = connection.prepareCall("{CALL sp_get_all_users()}")) {
                try(ResultSet resultSet = statement.executeQuery();) { // call executeQuery with SELECT statements
                    while (resultSet.next()) {
                        int userId = resultSet.getInt("user_id");
                        String firstName = resultSet.getString("first_name");
                        String lastName = resultSet.getString("last_name");
                        String email = resultSet.getString("email");
                        User user = new User(userId, firstName, lastName, email);
                        users.add(user);
                    }
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    public static User getUser(String email) {
        User user = null;
        try(Connection connection = getConnection()) {
            try(CallableStatement statement = connection.prepareCall("{CALL sp_get_user(?)}")) {
                statement.setString(1, email);
                try(ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int userId = resultSet.getInt("user_id");
                        String firstName = resultSet.getString("first_name");
                        String lastName = resultSet.getString("last_name");
                        user = new User(userId, firstName, lastName, email);
                    }
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public static boolean addUser(User user) {
        boolean result = false;
        try(Connection connection = getConnection()) {
            try(CallableStatement statement = connection.prepareCall("{CALL sp_add_user(?, ?, ?)}")) {
                statement.setString(1, user.getFirstName());
                statement.setString(2, user.getLastName());
                statement.setString(3, user.getEmail());
                int rowsAffected = statement.executeUpdate(); // Use executeUpdate when INSERT, UPDATE, or DELETE
                result = (rowsAffected == 1);
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        getAllUsers().forEach(System.out::println);
    }

}
