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
public class PSH_EnterpriseCatalogDirectory {
    private List<PSH_EnterCatag_Hotel> listOfHotels;
    private List<PSH_EnterCatag_Celebration> listOfCelebrations;
    private List<PSH_EnterCatag_Theatre> listOfTheatre;
    private List<PSH_EnterCatag_Restaurant> listOfRestaurants;

    public PSH_EnterpriseCatalogDirectory() {
        listOfHotels = new ArrayList<>();
        listOfCelebrations = new ArrayList<>();
        listOfTheatre = new ArrayList<>();
        listOfRestaurants = new ArrayList<>();
    }

    public List<PSH_EnterCatag_Hotel> getListOfHotels() {
        return listOfHotels;
    }

    public void setListOfHotels(List<PSH_EnterCatag_Hotel> listOfHotels) {
        this.listOfHotels = listOfHotels;
    }

    public List<PSH_EnterCatag_Celebration> getListOfCelebrations() {
        return listOfCelebrations;
    }

    public void setListOfCelebrations(List<PSH_EnterCatag_Celebration> listOfCelebrations) {
        this.listOfCelebrations = listOfCelebrations;
    }

    public List<PSH_EnterCatag_Theatre> getListOfTheatre() {
        return listOfTheatre;
    }

    public void setListOfTheatre(List<PSH_EnterCatag_Theatre> listOfTheatre) {
        this.listOfTheatre = listOfTheatre;
    }

    public List<PSH_EnterCatag_Restaurant> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public void setListOfRestaurants(List<PSH_EnterCatag_Restaurant> listOfRestaurants) {
        this.listOfRestaurants = listOfRestaurants;
    }

    

//    public void addTheatre(String name, String contact) {
//        PSH_EnterCatag_Theatre theatre = new PSH_EnterCatag_Theatre(name, contact);
//        listOfTheatre.add(theatre);
//    }
//
//    public void addCatering(String name, String contact) {
//        PSH_EnterCatag_Hotel catering = new PSH_EnterCatag_Hotel(name, contact);
//        listOfCatering.add(catering);
//    }
//
//    public void addEvents(String name, String contact) {
//        PSH_EnterCatag_Hotel event = new PSH_EnterCatag_Hotel(name, contact);
//        listOfEvents.add(event);
//    }
//
//    public void addResort(String name, String contact) {
//        PSH_EnterCatag_Hotel resort = new PSH_EnterCatag_Hotel(name, contact);
//        listOfResort.add(resort);
//    }
//
//    public PSH_EnterCatag_Hotel findResort(String resortName) {
//        for (PSH_EnterCatag_Hotel resort : listOfResort) {
//            if (resort.getName().equals(resortName)) {
//                return resort;
//            }
//        }
//        return null;
//    }
//
//    public PSH_EnterCatag_Hotel findEntertainment(String entertainmentName) {
//        for (PSH_EnterCatag_Hotel entr : listOfEntertainment) {
//            if (entr.getName().equals(entertainmentName)) {
//                return entr;
//            }
//        }
//        return null;
//    }
//
//    public PSH_EnterCatag_Hotel findCatering(String name) {
//        for (PSH_EnterCatag_Hotel entertainment : listOfCatering) {
//            if (entertainment.getName().equals(name)) {
//                return entertainment;
//            }
//        }
//        return null;
//    }
//
//    public PSH_EnterCatag_Hotel findEvents(String name) {
//        for (PSH_EnterCatag_Hotel event : listOfEvents) {
//            if (event.getName().equals(name)) {
//                return event;
//            }
//        }
//        return null;
//    }
//
//    public void deleteBusinessCatalogueEvents(PSH_EnterCatag_Celebration event) {
//        listOfCelebrations.remove(event);
//    }
//
//    public void deleteBusinessCatalogueEntertainment(PSH_EnterCatag_Theatre Entertainment) {
//        listOfEntertainment.remove(Entertainment);
//    }
//
//    public void deleteBusinessCatalogueCatering(PSH_EnterCatag_Restaurant cater) {
//        listOfCatering.remove(cater);
//    }
//
//    public void deleteBusinessCatalogueResort(PSH_EnterCatag_Hotel resort) {
//        listOfResort.remove(resort);
//    }
}
