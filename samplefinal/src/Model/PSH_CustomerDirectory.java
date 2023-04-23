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
public class PSH_CustomerDirectory {
    private List<PSH_Customer> listOfCustomer;

    public PSH_CustomerDirectory() {
        listOfCustomer = new ArrayList<>();
     
    }

    public List<PSH_Customer> getListOfCustomer() {
        return listOfCustomer;
    }

    public void setListOfCustomer(List<PSH_Customer> listOfCustomer) {
        this.listOfCustomer = listOfCustomer;
    }

    

    public PSH_Customer addCustomer() {
        PSH_Customer cus = new PSH_Customer();       
        listOfCustomer.add(cus);
        return cus;
    }

    public PSH_Customer findCustomerUsername(String username) {
        for (int i = 0; i < listOfCustomer.size(); i++) {
            if (listOfCustomer.get(i).getUserName().equals(username)) {
                return listOfCustomer.get(i);
            }
        }
        return null;
    }
}
