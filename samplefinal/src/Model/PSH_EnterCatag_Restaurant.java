/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerryreddy
 */
public class PSH_EnterCatag_Restaurant extends PSH_EnterpriseCatalog{
    private List<PSH_Manager> listOfManager;
    private List<PSH_Restaurant_orders> listOfRestaurantOrder;
    private List<PSH_Restaurant_Menu> listOfMenuItem;
    private List<PSH_DeliveryAgentOrg> listOfDeliveryAgentOrganisation;

    public PSH_EnterCatag_Restaurant(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        listOfRestaurantOrder = new ArrayList<>();
        listOfMenuItem = new ArrayList<>();
        listOfDeliveryAgentOrganisation = new ArrayList<>();
    }

    public List<PSH_Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<PSH_Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<PSH_Restaurant_orders> getListOfRestaurantOrder() {
        return listOfRestaurantOrder;
    }

    public void setListOfRestaurantOrder(List<PSH_Restaurant_orders> listOfRestaurantOrder) {
        this.listOfRestaurantOrder = listOfRestaurantOrder;
    }

    public List<PSH_Restaurant_Menu> getListOfMenuItem() {
        return listOfMenuItem;
    }

    public void setListOfMenuItem(List<PSH_Restaurant_Menu> listOfMenuItem) {
        this.listOfMenuItem = listOfMenuItem;
    }

    public List<PSH_DeliveryAgentOrg> getListOfDeliveryAgentOrganisation() {
        return listOfDeliveryAgentOrganisation;
    }

    public void setListOfDeliveryAgentOrganisation(List<PSH_DeliveryAgentOrg> listOfDeliveryAgentOrganisation) {
        this.listOfDeliveryAgentOrganisation = listOfDeliveryAgentOrganisation;
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

    public void addDeliveryAgentOrganisation(String name, String contact, String ServiceLocationName) {
        PSH_DeliveryAgentOrg del = new PSH_DeliveryAgentOrg(name, contact, ServiceLocationName);
        listOfDeliveryAgentOrganisation.add(del);
    }

    public void addMenuItem(String item, int price) {
        listOfMenuItem.add(new PSH_Restaurant_Menu(item, price));
    }

    public void deleteManager(PSH_Manager supr) {
        listOfManager.remove(supr);
    }
}
