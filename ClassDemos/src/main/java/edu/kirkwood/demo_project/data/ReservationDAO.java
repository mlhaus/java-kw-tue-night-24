package edu.kirkwood.demo_project.data;

import edu.kirkwood.demo_project.model.Reservation;
import edu.kirkwood.demo_project.model.Room;
import edu.kirkwood.demo_project.model.RoomType;
import edu.kirkwood.demo_project.model.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationDAO extends Database {
    public static ArrayList<Reservation> getAllReservations() {
        ArrayList<Reservation> reservations = new ArrayList<>();
        // try-with-resources
        try(Connection connection = getConnection()) {
            try(CallableStatement statement = connection.prepareCall("{CALL sp_get_all_reservations()}")) {
                ResultSet resultSet = statement.executeQuery();
                while(resultSet.next()) {
                    //reservation_id, check_in, check_out
                    int userId = resultSet.getInt("user_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");
                    User user = new User(userId, firstName, lastName, email);
                    String roomNumber = resultSet.getString("room_number");
                    double price = resultSet.getDouble("price");
                    RoomType roomType = RoomType.getRoomType(resultSet.getString("room_type"));
                    boolean handicapAccessible = resultSet.getBoolean("handicap_accessible");
                    Room room = new Room(roomNumber, roomType, price, handicapAccessible);
                    int reservationId = resultSet.getInt("reservation_id");
                    LocalDate checkIn = resultSet.getDate("check_in").toLocalDate();
                    LocalDate checkOut = resultSet.getDate("check_out").toLocalDate();
                    Reservation reservation = new Reservation(reservationId, room, user, checkIn, checkOut);
                    reservations.add(reservation);
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservations;
    }

    public static void main(String[] args) {
        getAllReservations().forEach(System.out::println);
    }

}
