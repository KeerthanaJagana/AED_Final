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
public class PSH_Theatre_MusicBandOrg extends PSH_Organization{
    List<PSH_Theatre_MusicBand> listOfMusicBand;

    public PSH_Theatre_MusicBandOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfMusicBand = new ArrayList<>();
    }

    public List<PSH_Theatre_MusicBand> getListOfMusicBand() {
        return listOfMusicBand;
    }

    public void setListOfMusicBand(List<PSH_Theatre_MusicBand> listOfMusicBand) {
        this.listOfMusicBand = listOfMusicBand;
    }

    

    

    public void addMusicBand(String name, String city, String user, String password1) {
        PSH_Theatre_MusicBand mb = new PSH_Theatre_MusicBand(name, city, user, password1);
        listOfMusicBand.add(mb);
      
    }

    public void deleteManager(PSH_Manager mgr) {
        listOfManager.remove(mgr);
    }
}
