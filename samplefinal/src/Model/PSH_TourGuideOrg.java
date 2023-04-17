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
public class PSH_TourGuideOrg extends PSH_Organization{
    private List<PSH_TourGuideService> listOfTourGuideAgent;

    public PSH_TourGuideOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfTourGuideAgent = new ArrayList<>();
    }

    public List<PSH_TourGuideService> getListOfTourGuideAgent() {
        return listOfTourGuideAgent;
    }

    public void setListOfTourGuideAgent(List<PSH_TourGuideService> listOfTourGuideAgent) {
        this.listOfTourGuideAgent = listOfTourGuideAgent;
    }

    
    public void addTourGuide(String name, String city, String user, String password1) {
        PSH_TourGuideService TourGuideStaff = new PSH_TourGuideService(name, city, user, password1);
        listOfTourGuideAgent.add(TourGuideStaff);
        System.out.println("ToutGuideAgent manager added is " + listOfTourGuideAgent.size());
    }

    public void deleteManager(PSH_Manager mgr) {
       listOfManager.remove(mgr);
    }
}
