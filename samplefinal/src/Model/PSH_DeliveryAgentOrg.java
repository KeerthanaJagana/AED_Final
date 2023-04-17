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
public class PSH_DeliveryAgentOrg extends PSH_Organization{
    private List<PSH_DeliveryAgent> listOfDeliveryAgent;

  public PSH_DeliveryAgentOrg(String name, String contact, String city) {
        super(name, contact, city);
        this .listOfDeliveryAgent = new ArrayList<>();
    }

    public List<PSH_DeliveryAgent> getListOfDeliveryAgent() {
        return listOfDeliveryAgent;
    }

    public void setListOfDeliveryAgent(List<PSH_DeliveryAgent> listOfDeliveryAgent) {
        this.listOfDeliveryAgent = listOfDeliveryAgent;
    }
  
    

    public void addDeliveryAgent(String name, String city, String user, String password1) {
        PSH_DeliveryAgent del = new PSH_DeliveryAgent(name, city, user, password1);
        listOfDeliveryAgent.add(del);
        
    }

    public void deleteServiceAgent(PSH_DeliveryAgentOrg del) {
     listOfDeliveryAgent.remove(del);
    }

    public void deleteSupervisor(PSH_Manager mgr) {
      listOfManager.remove(mgr);
    }
}
