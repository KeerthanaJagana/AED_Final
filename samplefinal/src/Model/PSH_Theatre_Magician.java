/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nayankarumuri
 */
public class PSH_Theatre_Magician extends PSH_Person{
    private String city;

    public PSH_Theatre_Magician(String name, String city, String username, String password) {
        this.name = name;
        this.city = city;
        this.username = username;
        this.password = password;
    }

    public String getCity() {
        return city;
    }
}
