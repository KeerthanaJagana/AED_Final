/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.PSH_RoomType.RoomType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jerryreddy
 */
public class PSH_EnterCatag_Hotel extends PSH_EnterpriseCatalog {
    
    private PSH_RoomsList RoomListDirectory;
    private List<PSH_Manager> listOfManager;
    private List<PSH_TourGuideOrg> tourGuideORG;
    private List<PSH_SafariOrg> safariOrg;
    
    public PSH_EnterCatag_Hotel() {

    }

    public PSH_EnterCatag_Hotel(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        RoomListDirectory = new PSH_RoomsList();
        safariOrg = new ArrayList<>();
        tourGuideORG = new ArrayList<>();
    }

    public PSH_RoomsList getRoomListDirectory() {
        return RoomListDirectory;
    }

    public void setRoomListDirectory(PSH_RoomsList RoomListDirectory) {
        this.RoomListDirectory = RoomListDirectory;
    }

    public List<PSH_Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<PSH_Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<PSH_TourGuideOrg> getTourGuideORG() {
        return tourGuideORG;
    }

    public void setTourGuideORG(List<PSH_TourGuideOrg> tourGuideORG) {
        this.tourGuideORG = tourGuideORG;
    }

    public List<PSH_SafariOrg> getSafariOrg() {
        return safariOrg;
    }

    public void setSafariOrg(List<PSH_SafariOrg> safariOrg) {
        this.safariOrg = safariOrg;
    }

    

    public List<PSH_RoomType> availableRooms(Date startDate, Date endDate, RoomType roomType) {
        List<PSH_RoomType> availableRooms = new ArrayList<>();
        for (PSH_RoomType room : RoomListDirectory.getPSH_RoomsList()) {
            if (room.getRoomType().equals(roomType) && room.isAvailable(startDate, endDate)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<PSH_RoomType> bookRooms(Date startDate, Date endDate, int count, RoomType roomType) {
        List<PSH_RoomType> availableRooms = availableRooms(startDate, endDate, roomType);
        if (availableRooms.size() < count) {
            throw new IllegalArgumentException("This room is not available for the specified date.");
        }

        for (int i = 0; i < count; i++) {
            availableRooms.get(i).book(startDate, endDate);
        }

        // return booked hall list
        return availableRooms.subList(0, count);
    }

    

    public PSH_Manager addManager(String name, String username, String password) {
        PSH_Manager mgr = new PSH_Manager(name, username, password);
        listOfManager.add(mgr);
        return mgr;
    }

    public PSH_Manager findManager(String username) {
        for (PSH_Manager mgr : listOfManager) {
            if (mgr.getUsername().equals(username)) {
                return mgr;
            }
        }
        return null;
    }


    public void addTourGuideORG(String name, String contact, String city) {
        PSH_TourGuideOrg tourGuideOrg = new PSH_TourGuideOrg(name, contact, city);
        tourGuideORG.add(tourGuideOrg);
    }

    public void addSafariOrg(String name, String contact, String serviceLocationName) {
        PSH_SafariOrg to = new PSH_SafariOrg(name, contact, serviceLocationName);
        safariOrg.add(to);
    }

    public void deleteManager(PSH_Manager supr) {
        listOfManager.remove(supr);
    }

    public void deleteTourGuide(PSH_TourGuideOrg tourGuide) {
        tourGuideORG.remove(tourGuide);
    }

    public void deleteSafari(PSH_SafariOrg carService) {
        safariOrg.remove(carService);
    }
    
}
