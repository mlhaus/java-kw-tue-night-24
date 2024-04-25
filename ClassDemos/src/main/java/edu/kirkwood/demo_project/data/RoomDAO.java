package edu.kirkwood.demo_project.data;

import edu.kirkwood.demo_project.model.Room;
import edu.kirkwood.demo_project.model.RoomType;
import edu.kirkwood.demo_project.model.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomDAO extends Database {
    public static ArrayList<Room> getAllRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        // try-with-resources
        try(Connection connection = getConnection()) {
            try(CallableStatement statement = connection.prepareCall("{CALL sp_get_all_rooms()}")) {
                ResultSet resultSet = statement.executeQuery();
                while(resultSet.next()) {
                    String roomNumber = resultSet.getString("room_number");
                    double price = resultSet.getDouble("price");
                    RoomType roomType = RoomType.getRoomType(resultSet.getString("room_type"));
                    boolean handicapAccessible = resultSet.getBoolean("handicap_accessible");
                    Room room = new Room(roomNumber, roomType, price, handicapAccessible);
                    rooms.add(room);
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return rooms;
    }

    public static void main(String[] args) {
        getAllRooms().forEach(System.out::println);
    }
}
