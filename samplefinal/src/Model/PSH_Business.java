/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author keerthanajagana
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PSH_Business {
    private List<PSH_location> listOfLocation;
    private PSH_CustomerDirectory customerDirectory;
    private Map<String, String> mapType;
    private Map<String, String> userNamePasswordMap;
    public PSH_Business(String uname,String pwd){
        listOfLocation = new ArrayList<>();
        listOfLocation.add(new PSH_location("Boston"));
        customerDirectory=new PSH_CustomerDirectory();
        mapType = new HashMap<>();
        userNamePasswordMap = new HashMap<>();
        userNamePasswordMap.put(uname, pwd);
        addUser(uname, pwd, "admin");
    }

    public List<PSH_location> getListOfLocation() {
        return listOfLocation;
    }

    public void setListOfLocation(List<PSH_location> listOfLocation) {
        this.listOfLocation = listOfLocation;
    }

    public PSH_CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(PSH_CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public Map<String, String> getMapType() {
        return mapType;
    }

    public void setMapType(Map<String, String> mapType) {
        this.mapType = mapType;
    }

    public Map<String, String> getUserNamePasswordMap() {
        return userNamePasswordMap;
    }

    public void setUserNamePasswordMap(Map<String, String> userNamePasswordMap) {
        this.userNamePasswordMap = userNamePasswordMap;
    }
    
    public void addLocation(String name) {
        PSH_location loc = new PSH_location(name);
        listOfLocation.add(loc);
    }

    public PSH_location findServiceLocation(String LocationName) {
        for (PSH_location loc : listOfLocation) {
            if (listOfLocation != null && loc.getName().equals(LocationName)) {
                return loc;
            }
        }
        return null;
    }
    
    public void addUser(String username, String password, String type) {
        mapType.put(username, type);
        userNamePasswordMap.put(username, password);
    }
    public boolean validateUserNamePassword(String userName, String password) {
        return userNamePasswordMap.containsKey(userName) && userNamePasswordMap.get(userName).equals(password);
    }
    public String findUserType(String username) {
        if (mapType.containsKey(username)) {
            return mapType.get(username);
        }
        return null;
    }
    public static PSH_Business createSystemAdmin() {
        return new PSH_Business("admin", "admin");
    }
    public boolean userExistsInSystem(String username) {
        return mapType.containsKey(username);
    }
    
    public void deleteCustomer(PSH_Customer customer) {
        customerDirectory.getListOfCustomer().remove(customer);
        mapType.remove(customer.getUserName());
    }

    public void updateUser(String username, String password) {
        if (userNamePasswordMap.containsKey(username)) {
            userNamePasswordMap.put(username, password);
        }
    }

    public PSH_Customer findCustomer(String user) {
        for (PSH_Customer custom : customerDirectory.getListOfCustomer()) {
            if (custom.getUserName().equals(user)) {
                return custom;
            }
        }
        return null;
    }
}
