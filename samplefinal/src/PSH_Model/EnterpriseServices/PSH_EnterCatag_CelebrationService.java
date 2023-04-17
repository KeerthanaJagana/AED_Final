/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PSH_Model.EnterpriseServices;

import Model.PSH_EnterCatag_Celebration;
import Model.PSH_RoomBooking;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nayankarumuri
 */
public class PSH_EnterCatag_CelebrationService extends PSH_EnterCatagService{
    private PSH_RoomBooking id;

    public static enum CelebrationServiceType {
        WEDDING,
        BIRTHDAYPARTY,
        ANNIVERSARY
    }

    private Map<CelebrationServiceType, Integer> CelebratServiceTypes;

   public PSH_EnterCatag_CelebrationService(PSH_EnterCatag_Celebration celeb, Date eventDate) {
        super(celeb, ServiceType.CELEBRATION, eventDate);
        this.CelebratServiceTypes=new HashMap<>();
        
    }

    public Map<CelebrationServiceType, Integer> getCelebratServiceTypes() {
        return CelebratServiceTypes;
    }

    public void setCelebratServiceTypes(Map<CelebrationServiceType, Integer> CelebratServiceTypes) {
        this.CelebratServiceTypes = CelebratServiceTypes;
    }

    

    public void addService(CelebrationServiceType type, int cost) {
        CelebratServiceTypes.put(type, cost);
        totalCost += cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nEvent service details:");
        sb.append("\n").append(TAB).append("Organization conducting celebration: ").append(enterpriseCatalog);
        sb.append("\n").append(TAB).append("Date of celebration: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (CelebratServiceTypes == null || CelebratServiceTypes.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for the celebration:");
            for (Map.Entry<CelebrationServiceType, Integer> entry : CelebratServiceTypes.entrySet()) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", entry.getKey(), entry.getValue()));
            }
            sb.append("\n").append(TAB).append("Total cost for Celebration: $").append(totalCost);
        }
        return sb.toString();
    }
}
