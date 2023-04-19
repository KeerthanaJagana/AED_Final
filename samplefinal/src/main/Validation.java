/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author keerthanajagana
 */
public class Validation {
    private Validation() {

    }

    public static boolean validateName(JPanel obj, String name) {
        if (name != null && name.matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(obj, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public static boolean validatePassword(JPanel obj, String password) {
        if (password != null && password.length() > 2) {
            return true;
        } else {
            JOptionPane.showMessageDialog(obj, "Invalid input : password should contain 3 or more characters.");
            return false;
        }
    }

    public static boolean validateUserName(JPanel obj, String username) {
        if (username != null && username.length() > 1) {
            return true;
        }
        JOptionPane.showMessageDialog(obj, "Invalid input : username should contain 2 or more charactewrs");
        return false;
    }
}
