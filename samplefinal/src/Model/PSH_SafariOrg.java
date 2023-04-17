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
public class PSH_SafariOrg extends PSH_Organization{
    private List<PSH_SafariService> listOfSafari;

    public PSH_SafariOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfSafari = new ArrayList<>();
    }

    public List<PSH_SafariService> getListOfSafari() {
        return listOfSafari;
    }

    public void setListOfSafari(List<PSH_SafariService> listOfSafari) {
        this.listOfSafari = listOfSafari;
    }


    public void addSafariServiceman(String name, String city, String user, String password1) {
        PSH_SafariService safariService = new PSH_SafariService(name, city, user, password1);
        listOfSafari.add(safariService);
        System.out.println("Service Agent manager added is " + listOfSafari.size());
    }

    public void deleteManger(PSH_Manager mgr) {
       listOfManager.remove(mgr);
    }
}
