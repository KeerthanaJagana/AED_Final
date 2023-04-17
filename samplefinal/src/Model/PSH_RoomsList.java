/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.PSH_RoomType.RoomType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nayankarumuri
 */
public class PSH_RoomsList {
    private List<PSH_RoomType> PSH_RoomsList;
    private int nextRoomNumber = 1;

    public PSH_RoomsList() {
        PSH_RoomsList = new ArrayList<>();
    }

    public List<PSH_RoomType> getPSH_RoomsList() {
        return PSH_RoomsList;
    }

    public void setPSH_RoomsList(List<PSH_RoomType> PSH_RoomsList) {
        this.PSH_RoomsList = PSH_RoomsList;
    }

    public int getNextRoomNumber() {
        return nextRoomNumber;
    }

    public void setNextRoomNumber(int nextRoomNumber) {
        this.nextRoomNumber = nextRoomNumber;
    }

    

    public void setListOfRooms(List<PSH_RoomType> listOfRooms) {
        this.PSH_RoomsList = listOfRooms;
        if (listOfRooms != null && listOfRooms.size() > 0) {
            nextRoomNumber = listOfRooms.get(listOfRooms.size() - 1).getRoomNo() + 1;
        }
    }

    public void createHallRoom(RoomType type) {
        PSH_RoomType room = new PSH_RoomType(type, nextRoomNumber);
        nextRoomNumber++;
        PSH_RoomsList.add(room);
    }

    public String toString() {
        return PSH_RoomsList.toString();
    }
}
