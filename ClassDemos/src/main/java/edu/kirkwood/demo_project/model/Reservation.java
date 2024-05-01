package edu.kirkwood.demo_project.model;

import edu.kirkwood.demo_project.data.ReservationDAO;
import edu.kirkwood.demo_project.data.RoomDAO;
import edu.kirkwood.shared.Helpers;
import edu.kirkwood.shared.UIUtility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private int reservationId;
    private Room room;
    private User customer;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Reservation(int reservationId, Room room, User customer, LocalDate checkInDate, LocalDate checkOutDate) {
        this.reservationId = reservationId;
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public static void printTableHeader() {
        UIUtility.printLine(113);
        System.out.printf("| %-20s | %-11s | %-12s | %-27s | %-27s |\n",
                "Customer Name", "Room Number", "Room Type", "Check In", "Check Out");
        UIUtility.printLine(113);
    }

    public String toString() {
        return String.format("| %-20s | %11s | %-12s | %27s | %27s |",
                customer.getFirstName() + " " + customer.getLastName(),
                room.getRoomNumber(), room.getRoomType(),
                Helpers.formatDate(checkInDate), Helpers.formatDate(checkOutDate));
    }

    public static void printTable() {
        printTableHeader();
        ArrayList<Reservation> reservations = ReservationDAO.getAllReservations();
        for(Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}
