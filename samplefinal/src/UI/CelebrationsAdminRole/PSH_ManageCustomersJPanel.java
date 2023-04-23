/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CelebrationsAdminRole;

import Model.PSH_Business;
import Model.PSH_Customer;
import Model.PSH_CustomerDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Validation;


/**
 *
 * @author keerthanajagana
 */
public class PSH_ManageCustomersJPanel extends javax.swing.JPanel {

     private PSH_Business enterpriseAdmin;
    private Runnable callMethod;
    
    /**
     * Creates new form PSH_ManageCustomersJPanel
     */
    public PSH_ManageCustomersJPanel(PSH_Business enterpriseAdmin,Runnable callMethod) {
        initComponents();
        this.enterpriseAdmin=enterpriseAdmin;
        this.callMethod=callMethod;
//        if(this.enterpriseAdmin.getCustomerDirectory().getListOfCustomer().size()!=0){
//        populateTable();
//    }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 34, -1, -1));

        lblsysadmin.setText("MANAGE CLIENTS");
        add(lblsysadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 47, 136, -1));

        customerTable.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLIENT NAME", "MOBILE NO", "STREET", "CITY", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 846, 154));

        addButton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 104, -1));

        updateButton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        deleteBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("CLIENT NAME:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 406, 168, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setText("CITY:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 111, -1));
        add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 482, 168, -1));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel9.setText("STREET:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 111, -1));
        add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 560, 168, -1));
        add(contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 168, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("MOBILE NO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 131, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("USERNAME:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 126, -1));
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 166, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setText("PASSWORD:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 129, -1));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean validateContactNum() {
        if (contactField.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contact: contact should contain only 10 digits");
            return false;
        }
    }

    public boolean validateCity() {
        if (cityField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : city should contain only alphabets");
            return false;
        }
    }

    public boolean validateAddress() {
        if (txtStreet.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : address should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (passwordField.getText().matches("[a-zA-Z]{3}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain only 3 inputs");
            return false;
        }
    }
    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        String clientName = model.getValueAt(customerTable.getSelectedRow(), 0).toString();
        String clientContact = model.getValueAt(customerTable.getSelectedRow(), 1).toString();
        String clientCity = model.getValueAt(customerTable.getSelectedRow(), 2).toString();
        String clientStreet = model.getValueAt(customerTable.getSelectedRow(), 3).toString();
        String username = model.getValueAt(customerTable.getSelectedRow(), 4).toString();
        String password = model.getValueAt(customerTable.getSelectedRow(), 5).toString();
        nameField.setText(clientName);
        contactField.setText(clientContact);
        cityField.setText(clientCity);
        txtStreet.setText(clientStreet);
        usernameField.setText(username);
        passwordField.setText(password);
        usernameField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_customerTableMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = nameField.getText();
        String contact = contactField.getText();
        String city = cityField.getText();
        String street = txtStreet.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!Validation.validateName(this, name) || !Validation.validateUserName(this, username)
            || !Validation.validatePassword(this, password)) {
            return;
        }

        if (enterpriseAdmin.userExistsInSystem(username)) {
            JOptionPane.showMessageDialog(this, "Username already exists.");
            return;
        }

        PSH_Customer client = this.enterpriseAdmin.getCustomerDirectory().addCustomer();  //add client to directory in system
        client.setName(name);
        client.setContact(contact);
        client.setCity(city);
        client.setAddress(street);
        client.setUserName(username);
        client.setPassword(password);
        populateTable();
        

        enterpriseAdmin.addUser(username, password, "Customer");
        JOptionPane.showMessageDialog(this, "Customer added successfully");

        nameField.setText("");
        contactField.setText("");
        cityField.setText("");
        usernameField.setText("");
        txtStreet.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (customerTable.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        if (customerTable.getSelectedRowCount() == 1) {
            String user = usernameField.getText();
            PSH_Customer client = enterpriseAdmin.findCustomer(user);
            client.setAddress(txtStreet.getText());
            client.setName(nameField.getText());
            client.setContact(contactField.getText());
            client.setCity(cityField.getText());
            JOptionPane.showMessageDialog(this, "updated Successfully");
            populateTable();

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        String username = model.getValueAt(customerTable.getSelectedRow(), 4).toString();
        PSH_CustomerDirectory cusDirectory = enterpriseAdmin.getCustomerDirectory();
        if (cusDirectory.getListOfCustomer() != null) {
            for (PSH_Customer cus : cusDirectory.getListOfCustomer()) {
                if (cus.getUserName().equals(username)) {
                    enterpriseAdmin.deleteCustomer(cus);
                    populateTable();
                    JOptionPane.showMessageDialog(this, "Customer deleted successfully");
                    return;
                }
            }
        }
           
    }//GEN-LAST:event_deleteBtnActionPerformed

   private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (PSH_Customer cus : enterpriseAdmin.getCustomerDirectory().getListOfCustomer()) {
            row[0] = cus.getName();
            row[1] = cus.getContact();
            row[2] = cus.getCity();
            row[3] = cus.getAddress();
            row[4] = cus.getUserName();
            row[5] = cus.getPassword();
            model.addRow(row);
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
