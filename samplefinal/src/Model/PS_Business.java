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
public class PS_Business {
    private Map<String, String> mapType;
    private Map<String, String> userNamePasswordMap;
    public PS_Business(String uname,String pwd){
        mapType = new HashMap<>();
        userNamePasswordMap = new HashMap<>();
        userNamePasswordMap.put(uname, pwd);
        addUser(uname, pwd, "admin");
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
    public static PS_Business createSystemAdmin() {
        return new PS_Business("admin", "admin");
    }
}
