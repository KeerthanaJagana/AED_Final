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
public class PSH_DeliveryAgent extends PSH_Person{
    private String city;
    List<PSH_Restaurant_orders> list = new ArrayList<>();

    public PSH_DeliveryAgent(String name, String city, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<PSH_Restaurant_orders> getList() {
        return list;
    }

    public void setList(List<PSH_Restaurant_orders> list) {
        this.list = list;
    }

    

    public void addOrder(PSH_Restaurant_orders order) {
        list.add(order);
    }

    public PSH_Restaurant_orders findOrder(String orderId) {
        for (int i = 0; i < list.size(); i++) {
            if (orderId.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
