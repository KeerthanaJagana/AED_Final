/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nayankarumuri
 */
public class PSH_Customer {
    private String name;
    private String contact;
    private String address;
    private String city;
    private String password;
    private String userName;
    private List<PSH_RoomBooking> roombookingList;

    public PSH_Customer() {
        roombookingList = new ArrayList<>();
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public List<PSH_RoomBooking> getRoombookingList() {
        return roombookingList;
    }

    public void setRoombookingList(List<PSH_RoomBooking> roombookingList) {
        this.roombookingList = roombookingList;
    }

    

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PSH_RoomBooking addBooking(PSH_EnterCatag_Hotel hotel, PSH_location serviceLocation) {
        PSH_RoomBooking booking = new PSH_RoomBooking(hotel, serviceLocation);
        roombookingList.add(booking);
        return booking;
    }

    public String toString() {
        return userName;
    }
}
