/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jerryreddy
 */
public class PSH_EnterCatag_Celebration extends PSH_EnterpriseCatalog{
    private Date date;
    private List<PSH_Manager> listOfManager;
    private List<PSH_Celebration_Bday> listOfBirthdayParty;
    private List<PSH_Celebration_Wedding> listOfWeddings;
    private List<PSH_Celebration_Anniversary> listOfAnniversaries;

    public PSH_EnterCatag_Celebration(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        listOfBirthdayParty = new ArrayList<>();
        listOfWeddings = new ArrayList<>();
        listOfAnniversaries = new ArrayList<>();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<PSH_Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<PSH_Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<PSH_Celebration_Bday> getListOfBirthdayParty() {
        return listOfBirthdayParty;
    }

    public void setListOfBirthdayParty(List<PSH_Celebration_Bday> listOfBirthdayParty) {
        this.listOfBirthdayParty = listOfBirthdayParty;
    }

    public List<PSH_Celebration_Wedding> getListOfWeddings() {
        return listOfWeddings;
    }

    public void setListOfWeddings(List<PSH_Celebration_Wedding> listOfWeddings) {
        this.listOfWeddings = listOfWeddings;
    }

    public List<PSH_Celebration_Anniversary> getListOfAnniversaries() {
        return listOfAnniversaries;
    }

    public void setListOfAnniversaries(List<PSH_Celebration_Anniversary> listOfAnniversaries) {
        this.listOfAnniversaries = listOfAnniversaries;
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

    public void addBirthday(String name, String contact, String city) {
        PSH_Celebration_Bday bp = new PSH_Celebration_Bday(name, contact, city);
        System.out.println(name);
        listOfBirthdayParty.add(bp);
        
    }

    public void addWeddings(String name, String contact, String city) {
        PSH_Celebration_Wedding wed = new PSH_Celebration_Wedding(name, contact, city);
        listOfWeddings.add(wed);

    }

    public void addAnniversaries(String name, String contact, String city) {
        PSH_Celebration_Anniversary ann = new PSH_Celebration_Anniversary(name, contact, city);
        listOfAnniversaries.add(ann);
    }

    public void deleteManager(PSH_Manager mgr) {
        listOfManager.remove(mgr);
    }

    public void deleteBirthdayParty(PSH_Celebration_Bday birthdayParty) {
        listOfBirthdayParty.remove(birthdayParty);
    }

    public void deleteWeddingServices(PSH_Celebration_Wedding wed) {
        listOfWeddings.remove(wed);
    }

    public void deleteMeetings(PSH_Celebration_Anniversary met) {
        listOfAnniversaries.remove(met);
    }
}
