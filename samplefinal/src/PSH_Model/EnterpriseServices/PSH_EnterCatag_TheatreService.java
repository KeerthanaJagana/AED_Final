/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PSH_Model.EnterpriseServices;

import Model.PSH_EnterCatag_Theatre;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nayankarumuri
 */
public class PSH_EnterCatag_TheatreService  extends PSH_EnterCatagService{
    public static enum TheatreServiceType {
        MAGICIAN(60),
        STANDUPCOMEDY(60),
        MUSICBAND(60);

        private final int price;

        private TheatreServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
    
    private List<TheatreServiceType> TheatreServices;

    public PSH_EnterCatag_TheatreService(PSH_EnterCatag_Theatre theatre, Date date) {
        super(theatre, PSH_EnterCatagService.ServiceType.THEATRE, date);
        this.TheatreServices = new ArrayList<>();
    }

    public List<TheatreServiceType> getTheatreServices() {
        return TheatreServices;
    }

    public void setTheatreServices(List<TheatreServiceType> TheatreServices) {
        this.TheatreServices = TheatreServices;
    }

    public void addService(TheatreServiceType type) {
        TheatreServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nTheatre service details:");
        sb.append("\n").append(TAB).append("Theatre: ").append(enterpriseCatalog);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        if (TheatreServices == null || TheatreServices.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for your appointment:");
            for (TheatreServiceType service : TheatreServices) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", service.toString(), service.getPrice()));
            }
            sb.append("\n").append(TAB).append("Total cost for health club: $").append(totalCost);
        }
        return sb.toString();
    }
    
    
}
