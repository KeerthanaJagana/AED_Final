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

    

    public void addTheatre(String name, String contact) {
        PSH_EnterCatag_Theatre theatre = new PSH_EnterCatag_Theatre(name, contact);
        listOfTheatre.add(theatre);
    }

    public void addRestaurant(String name, String contact) {
        PSH_EnterCatag_Restaurant cres = new PSH_EnterCatag_Restaurant(name, contact);
        listOfRestaurants.add(cres);
    }

    public void addCelebration(String name, String contact) {
        PSH_EnterCatag_Celebration celeb = new PSH_EnterCatag_Celebration(name, contact);
        listOfCelebrations.add(celeb);
    }

    public void addHotel(String name, String contact) {
        PSH_EnterCatag_Hotel hotel = new PSH_EnterCatag_Hotel(name, contact);
        listOfHotels.add(hotel);
    }

    public PSH_EnterCatag_Hotel findHotel(String resortName) {
        for (PSH_EnterCatag_Hotel resort : listOfHotels) {
            if (resort.getName().equals(resortName)) {
                return resort;
            }
        }
        return null;
    }

    public PSH_EnterCatag_Theatre findTheatre(String entertainmentName) {
        for (PSH_EnterCatag_Theatre entr : listOfTheatre) {
            if (entr.getName().equals(entertainmentName)) {
                return entr;
            }
        }
        return null;
    }

    public PSH_EnterCatag_Restaurant findRestaurant(String name) {
        for (PSH_EnterCatag_Restaurant res : listOfRestaurants) {
            if (res.getName().equals(name)) {
                return res;
            }
        }
        return null;
    }

    public PSH_EnterCatag_Celebration findCelebration(String name) {
        for (PSH_EnterCatag_Celebration celeb : listOfCelebrations) {
            if (celeb.getName().equals(name)) {
                return celeb;
            }
        }
        return null;
    }

    public void deleteBusinessCatalogueCelebration(PSH_EnterCatag_Celebration celeb) {
        listOfCelebrations.remove(celeb);
    }

    public void deleteBusinessCatalogueTheatre(PSH_EnterCatag_Theatre Entertainment) {
        listOfTheatre.remove(Entertainment);
    }

    public void deleteBusinessCatalogueCatering(PSH_EnterCatag_Restaurant res) {
        listOfRestaurants.remove(res);
    }

    public void deleteBusinessCatalogueResort(PSH_EnterCatag_Hotel resort) {
        listOfHotels.remove(resort);
    }
}
