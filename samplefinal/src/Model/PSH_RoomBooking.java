/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import PSH_Model.EnterpriseServices.PSH_EnterCatagService;
import PSH_Model.EnterpriseServices.PSH_EnterCatag_HotelService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import main.DateUtilities;

/**
 *
 * @author nayankarumuri
 */
public class PSH_RoomBooking {
    private static final String TAB = "      ";

    private Date checkin;
    private Date checkout;
    private String status;
    private int cost;
    private PSH_location location;

    private List<PSH_EnterCatagService> services;
    private String id;

    public PSH_RoomBooking() {
        
    }
    
    public PSH_RoomBooking(PSH_EnterCatag_Hotel hotel, PSH_location serviceLocation) {
        this.services = new ArrayList<>();
        this.services.add(new PSH_EnterCatag_HotelService(hotel));
        this.location = serviceLocation;
        this.id = UUID.randomUUID().toString();
    }

    public int getTotalCost() {
        int totalCost = this.cost;
        for (PSH_EnterCatagService service : services) {
            totalCost += service.getTotalCost();
        }
        return totalCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public PSH_location getLocation() {
        return location;
    }

    public void setLocation(PSH_location location) {
        this.location = location;
    }

    public List<PSH_EnterCatagService> getServices() {
        return services;
    }

    public void setServices(List<PSH_EnterCatagService> services) {
        this.services = services;
    }

    

    public void addService(PSH_EnterCatagService service) {
        this.services.add(service);
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = DateUtilities.formatDate(checkin);
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = DateUtilities.formatDate(checkout);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PSH_location getServiceLocation() {
        return location;
    }

    public void setServiceLocation(PSH_location serviceLocation) {
        this.location = serviceLocation;
    }

    public PSH_EnterCatag_HotelService getResortService() {
        for (PSH_EnterCatagService service : services) {
            if (service instanceof PSH_EnterCatag_HotelService) {
                return (PSH_EnterCatag_HotelService) service;
            }
        }

        throw new RuntimeException("Booking should always have an resort service");
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder("Below are your booking details -\n");
        sb.append("\n").append("RESORT BOOKING: ");
        sb.append("\n").append(TAB).append("City: ").append(location.getName());
        sb.append("\n").append(TAB).append("Checkin date: ").append(checkin);
        sb.append("\n").append(TAB).append("Checkout date: ").append(checkout);
        
        List<PSH_RoomType> listOfRooms = getResortService().getRoomslist().getPSH_RoomsList();
        int roomCost = 0;
        sb.append("\n").append(TAB).append(String.format("Below are the details of the %d Room booked:", listOfRooms.size()));
        for (PSH_RoomType room : listOfRooms) {
            roomCost += room.getRoomType().getRate();
            sb.append("\n").append(TAB).append(TAB).append("Room number: ")
                    .append(room.getRoomNo()).append(",Room type: ").append(room.getRoomType());
        }
        sb.append("\n").append(TAB).append("Total cost for your stay: $").append(roomCost);
        
        int totalCost = roomCost;
        for (PSH_EnterCatagService service : services) {
            totalCost += service.getTotalCost();
            sb.append("\n").append(service).append("\n");
        }
        
        sb.append("\nTotal cost of the booking including all services: $").append(getTotalCost()).append("\n");
     
        return sb.toString();
    }

    public String toString() {
        return id;
    }
}
