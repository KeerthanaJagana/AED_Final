/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import main.DateUtilities;

/**
 *
 * @author nayankarumuri
 */
public class PSH_RoomType {
    
    public enum RoomType {
        SUITE(1500, "SUITE"),
        ELITE(1000, "ELITE"),
        STANDARD(250, "STANDARD");

        private final int rate;
        private final String name;

        private RoomType(int rate, String name) {
            this.rate = rate;
            this.name = name;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + rate + "$ per night)";
        }
    }

    private Set<Date> bookings;
    public RoomType roomType;
    private int roomNo;


    public PSH_RoomType(RoomType hallroomType, int hallroomNumber) {
        this.roomType = hallroomType;
        this.roomNo = hallroomNumber;
        this.bookings = new HashSet<>();
    }


    public Set<Date> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Date> bookings) {
        this.bookings = bookings;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    
    

    public boolean isAvailable(Date startDate, Date endDate) {
        Set<Date> bookingDates = daysBetween(startDate, endDate);
        for (Date date : bookingDates) {
            if (bookings.contains(date)) {
                return false;
            }
        }
        return true;
    }

    public void book(Date startDate, Date endDate) {
        if (isAvailable(startDate, endDate)) {
            bookings.addAll(daysBetween(startDate, endDate));
        } else {
            throw new IllegalArgumentException("Room not available");
        }
    }

    private Set<Date> daysBetween(Date startDate, Date endDate) {
        startDate = DateUtilities.formatDate(startDate);
        endDate = DateUtilities.formatDate(endDate);

        Set<Date> days = new HashSet<>();
        do {
            days.add(startDate);

            Calendar cal = Calendar.getInstance();
            cal.setTime(startDate);
            cal.add(Calendar.DATE, 1);
            startDate = cal.getTime();
        } while (startDate.getTime() <= endDate.getTime());

        return days;
    }

    public String toString() {
        return "Room:{" + roomNo + ", Bookings " + bookings + "}";
    }
}
