package edu.kirkwood.demo_project.model;

import edu.kirkwood.demo_project.data.RoomDAO;
import edu.kirkwood.demo_project.data.UserDAO;
import edu.kirkwood.shared.Helpers;
import edu.kirkwood.shared.UIUtility;

import java.util.ArrayList;

public class Room {
    private String roomNumber;
    private RoomType roomType;
    private double price;
    private boolean handicapAccessible;

    public Room(String roomNumber, RoomType roomType, double price, boolean handicapAccessible) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.handicapAccessible = handicapAccessible;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHandicapAccessible() {
        return handicapAccessible;
    }

    public static void printTableHeader() {
        UIUtility.printLine(72);
        System.out.printf("| %-12s | %-15s | %-13s | %-19s |\n",
                "Room Number", "Price Per Night", "Room Type", "Handicap Accessible");
        UIUtility.printLine(72);
    }

    public String toString() {
        return String.format("| %12s | %15s | %-13s | %-19s |",
                roomNumber, Helpers.toCurrency(price), roomType, handicapAccessible ? "Yes" : "No");
    }

    public static void printTable() {
        printTableHeader();
        ArrayList<Room> rooms = RoomDAO.getAllRooms();
        for(Room room : rooms) {
            System.out.println(room);
        }
    }
}
