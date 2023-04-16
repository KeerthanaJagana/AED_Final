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
public class PSH_Organization {
    protected String name;
    protected String city;
    protected String contact;
    protected List<PSH_Manager> listOfManager;

    public PSH_Organization(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        this.listOfManager = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<PSH_Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<PSH_Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    
    
    public PSH_Manager addManager(String name, String city, String user, String password) {
        PSH_Manager manager = new PSH_Manager(name, user, password);
        listOfManager.add(manager);
        return manager;
    }
    
    
    public String toString() {
        return name;
    }
}
