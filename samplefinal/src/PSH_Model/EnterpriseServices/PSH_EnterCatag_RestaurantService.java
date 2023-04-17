/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PSH_Model.EnterpriseServices;

import Model.PSH_EnterCatag_Restaurant;
import java.util.Date;

/**
 *
 * @author nayankarumuri
 */
public class PSH_EnterCatag_RestaurantService extends PSH_EnterCatagService{
    private String menuItem;

    public PSH_EnterCatag_RestaurantService(PSH_EnterCatag_Restaurant res, Date eventDate, String menuItem, int cost) {
        super(res, PSH_EnterCatagService.ServiceType.RESTAURANT, eventDate);
        this.menuItem = menuItem;
        super.totalCost = cost;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nRestaurant order details:");
        sb.append("\n").append(TAB).append("Restaurant's name: ").append(enterpriseCatalog);
        sb.append("\n").append(TAB).append("Order item: ").append(menuItem);
        sb.append("\n").append(TAB).append("Total cost for Order: $").append(totalCost);
        sb.append("\n").append(TAB).append("Date of order: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        return sb.toString();
    }
    
}
