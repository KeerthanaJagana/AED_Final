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
public class PSH_EnterCatag_Theatre extends PSH_EnterpriseCatalog{
    private List<PSH_Manager> listOfManager;
    private List<PSH_Theatre_MagicianOrg> listOfMagicians;
    private List<PSH_Theatre_MusicBandOrg> listOfMusicBand;
    private List<PSH_Theatre_StandUpComedyOrg> listOfComedians;

    PSH_EnterCatag_Theatre(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        listOfMagicians = new ArrayList<>();
        listOfMusicBand = new ArrayList<>();
        listOfComedians = new ArrayList<>();
    }

    public List<PSH_Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<PSH_Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

   

    

    

    public PSH_Manager addManager(String name, String username, String password) {
        PSH_Manager manager = new PSH_Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

    public PSH_Manager findManager(String username) {
        for (PSH_Manager supr : listOfManager) {
            if (supr.getUsername().equals(username)) {
                return supr;
            }
        }
        return null;
    }

    public void addMagicianORG(String name, String contact, String city) {
        PSH_Theatre_MagicianOrg magicianOrg = new PSH_Theatre_MagicianOrg(name, contact, city);
        listOfMagicians.add(magicianOrg);
    }

    public void addMusicBandORG(String name, String contact, String city) {
        PSH_Theatre_MusicBandOrg singerorg = new PSH_Theatre_MusicBandOrg(name, contact, city);
        listOfMusicBand.add(singerorg);
    }

    public void addStandUpComedyORG(String name, String contact, String serviceLocationName) {
        PSH_Theatre_StandUpComedyOrg com = new PSH_Theatre_StandUpComedyOrg(name, contact, serviceLocationName);
        listOfComedians.add(com);
    }
    
    public String toString() {
        return name;
    }

    public void deleteManager(PSH_Manager supr) {
        listOfManager.remove(supr);
    }

    public void deleteMagician(PSH_Theatre_MagicianOrg magician) {
      listOfMagicians.remove(magician);
    }

    public void deleteComedian(PSH_Theatre_StandUpComedyOrg com) {
        listOfComedians.remove(com);
    }

    public void deleteMusicBand(PSH_Theatre_MusicBandOrg mb) {
           listOfMusicBand.remove(mb);
    }
}
