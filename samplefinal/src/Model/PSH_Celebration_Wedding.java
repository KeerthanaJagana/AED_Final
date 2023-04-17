/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nayankarumuri
 */
public class PSH_Celebration_Wedding extends PSH_Organization{
    public static enum WeddingType {
        DELUXE(10000, "DELUXE", "SERVICES: All basic decoration, Gift card and AV equipment 1 for 150 guest"),
        PREMIUM(18000, "PREMIUM", "SERVICES: Classic decoration, customised wedding cake, Gift card and AV eqipment 1 for 300 guest"),
        ELITE(25000, "ELITE", "SERVICES: Photographer, Classic decoration, Gift card, Customised wedding Cake and AV eqipment 2 for 500 guest");

        private final int rate;
        private final String name;
        private final String description;

        private WeddingType(int rate, String name, String description) {
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
            return getName() + " (" + description + ")";
        }
    }

    public PSH_Celebration_Wedding(String name, String contact, String city) {
        super(name, contact, city);
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
