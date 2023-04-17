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
public class PSH_Theatre_StandUpComedyOrg extends PSH_Organization{
    List<PSH_Theatre_StandUpComedy> listOfComedians;

    public PSH_Theatre_StandUpComedyOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfComedians = new ArrayList<>();
    }

    public List<PSH_Theatre_StandUpComedy> getListOfComedians() {
        return listOfComedians;
    }

    public void setListOfComedians(List<PSH_Theatre_StandUpComedy> listOfComedians) {
        this.listOfComedians = listOfComedians;
    }

    
    public void addComedians(String name, String city, String user, String password1) {
        PSH_Theatre_StandUpComedy magician = new PSH_Theatre_StandUpComedy(name, city, user, password1);
        listOfComedians.add(magician);
        System.out.println("Comedian's manager added is " + listOfComedians.size());
    }

    public void deleteManager(PSH_Manager mgr) {
        listOfManager.remove(mgr);
    }
}
