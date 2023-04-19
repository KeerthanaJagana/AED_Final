/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PSH_Model.EnterpriseServices;

import Model.PSH_EnterCatag_Hotel;
import Model.PSH_RoomsList;
import java.util.ArrayList;
import java.util.List;
import main.DateUtilities;

/**
 *
 * @author nayankarumuri
 */
public class PSH_EnterCatag_HotelService extends PSH_EnterCatagService{
    public static enum HotelServiceType {
        TOURGUIDE(20),
        SAFARISERVICE(20);

        private final int price;

        private HotelServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private PSH_RoomsList roomslist;
    private List<HotelServiceType> HotelServices;

    public PSH_EnterCatag_HotelService(PSH_EnterCatag_Hotel hotel) {
        super(hotel, PSH_EnterCatagService.ServiceType.HOTEL, DateUtilities.now());
        this.HotelServices = new ArrayList<>();
        this.roomslist = new PSH_RoomsList();
    }

    public PSH_RoomsList getRoomslist() {
        return roomslist;
    }

    public void setRoomslist(PSH_RoomsList roomslist) {
        this.roomslist = roomslist;
    }

    public List<HotelServiceType> getHotelServices() {
        return HotelServices;
    }

    public void setHotelServices(List<HotelServiceType> HotelServices) {
        this.HotelServices = HotelServices;
    }

    

    public void addService(PSH_EnterCatag_HotelService.HotelServiceType type) {
        HotelServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nResort service details:");
        sb.append("\n").append(TAB).append("Resort: ").append(enterpriseCatalog);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (HotelServices == null || HotelServices.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for your booking:");
            for (PSH_EnterCatag_HotelService.HotelServiceType service : HotelServices) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", service.toString(), service.getPrice()));
            }
            sb.append("\n").append(TAB).append("Total cost for hotel: $").append(totalCost);
        }
        return sb.toString();
    }
}
