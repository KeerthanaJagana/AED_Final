/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author nayankarumuri
 */
public class PSH_Celebration_Bday extends PSH_Organization{
    
    public PSH_Celebration_Bday(String name, String contact, String city) {
        super(name, contact, city);
    }

    public enum BirthdayPartyType {
        DELUXE(1000, "DELUXE", "Includes basic Ballon Decor, Cake with Food for 100 guest"),
        PREMIUM(2500, "PREMIUM", "Includes Return gift, Ballon Decor, Customised Cake and Food for 300 guest"),
        ELITE(5000, "ELITE", "Includes PhotoBoth decor, baloon decor, customised Cake, Return Gift and food for 500 guest ");

        private final int rate;
        private final String name;
        private final String description;

        private BirthdayPartyType(int rate, String name, String description) {
            this.rate = rate;
            this.name = name;
            this.description = description;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + rate + "$ per night)";
        }
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

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<PSH_Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<PSH_Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    
    public PSH_Manager addManager(String name, String city, String user, String password1) {
        PSH_Manager mgr = new PSH_Manager(name, user, password1);
        listOfManager.add(mgr);
        return mgr;
    }

    public void deleteSupervisor(PSH_Manager mgr) {
        listOfManager.remove(mgr);
    }
}
