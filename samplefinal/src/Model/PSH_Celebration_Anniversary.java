/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nayankarumuri
 */
public class PSH_Celebration_Anniversary extends PSH_Organization{
    public PSH_Celebration_Anniversary(String name, String contact, String city) {
        super(name, contact, city);
    }

    public enum AnniversaryType {
        DELUXE(1200, "DELUXE", "Includes decor and standard food for 50 guest"),
        PREMIUM(3000, "PREMIUM", "Includes flower decoration, two cuisines for Food and Projector for 150 guests"),
        ELITE(5500, "ELITE", "Includes decoration,Multi cuisine Food , Projector and customised items for 300 guests");

        private final int rate;
        private final String name;
        private final String description;

        private AnniversaryType(int rate, String name, String description) {
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

        public String getDescription() {
            return description;
        }

        public String toString() {
            return name + "(" + description + ")";
        }
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
