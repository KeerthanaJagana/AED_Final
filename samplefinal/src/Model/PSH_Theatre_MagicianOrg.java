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
public class PSH_Theatre_MagicianOrg extends PSH_Organization{
    List<PSH_Theatre_Magician> listOfMagician;

    public PSH_Theatre_MagicianOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfMagician = new ArrayList<>();
    }

    public List<PSH_Theatre_Magician> getListOfMagician() {
        return listOfMagician;
    }

    public void setListOfMagician(List<PSH_Theatre_Magician> listOfMagician) {
        this.listOfMagician = listOfMagician;
    }

    

    

    public void addMagician(String name, String city, String user, String password1) {
        PSH_Theatre_Magician magician = new PSH_Theatre_Magician(name, city, user, password1);
        listOfMagician.add(magician);
        System.out.println("Magician's manager added is " + listOfMagician.size());
    }

    public void deleteManager(PSH_Manager mgr) {
        listOfManager.remove(mgr);
    }
}
