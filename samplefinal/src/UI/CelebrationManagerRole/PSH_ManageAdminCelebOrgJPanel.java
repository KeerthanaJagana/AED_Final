/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CelebrationManagerRole;

import Model.PSH_Business;
import Model.PSH_Celebration_Anniversary;
import Model.PSH_Celebration_Bday;
import Model.PSH_Celebration_Wedding;
import Model.PSH_EnterCatag_Celebration;
import Model.PSH_EnterpriseCatalogDirectory;
import Model.PSH_Manager;
import Model.PSH_location;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Validation;

/**
 *
 * @author keerthanajagana
 */
public class PSH_ManageAdminCelebOrgJPanel extends javax.swing.JPanel {

    private PSH_Business enterpriseAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private PSH_location location;
    /**
     * Creates new form PSH_ManageAdminCelebOrgJPanel
     */
    public PSH_ManageAdminCelebOrgJPanel(PSH_Business enterpriseAdmin, Runnable callOnCreateMethod, String user, String type, PSH_location location) {
        
        initComponents();
        this.enterpriseAdmin = enterpriseAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.location = location;
        locationName.setText(location.getName());
        locationName.setEditable(false);
        populateTable();
        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        locationName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        orgName = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ADMIN CELEBRATION ORGANIZATION");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION", "ORGANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        addBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel7.setText("LOCATION");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("ORGANIZATION TYPE ");

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an organisation type", "Anniversary", "Wedding", "BirthdayParty" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("ORGANIZATION NAME");

        orgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select organisation Name" }));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setText("PASSWORD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(backButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(updateBtn)
                .addGap(126, 126, 126)
                .addComponent(deleteBtn))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(378, 378, 378)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(locationName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2)
                .addGap(294, 294, 294)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(backButton)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String city = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String managerName = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String managerUsername = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(jTable1.getSelectedRow(), 5).toString();

        nameField.setText(managerName);
        usernameField.setText(managerUsername);
        passwordField.setText(managerPassword);
        usernameField.setEnabled(false);
        orgCombo.setSelectedItem(orgType);
        orgName.setSelectedItem(oName);
    }//GEN-LAST:event_jTable1MouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String orgType = orgCombo.getSelectedItem().toString();
        String orgName1 = orgName.getSelectedItem().toString();
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!Validation.validateName(this, name) || !Validation.validateUserName(this, username)
                || !Validation.validatePassword(this, password)) {
            return;
        }
        
        PSH_EnterpriseCatalogDirectory enterCatalogueDirectory = location.getEnterpriseCatalogDirectory();
        List<PSH_EnterCatag_Celebration> list = enterCatalogueDirectory.getListOfCelebrations();
        if (!enterpriseAdmin.userExistsInSystem(username)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findManager(user) != null) {    //if enterpirse supervisor found 
                    if (orgType.equals("BirthdayParty")) {
                        List<PSH_Celebration_Bday> org1 = list.get(i).getListOfBirthdayParty();    // add organisation managers for each org
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addManager(name, location.getName(), username, password);
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                enterpriseAdmin.addUser(username, password, "BirthdayParty");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else if (orgType.equals("Wedding")) {
                        List<PSH_Celebration_Wedding> org2 = list.get(i).getListOfWeddings();

                        for (int j = 0; j < org2.size(); j++) {
                            System.out.println(org2.get(i).getName() + "name of Wedding org");
                            if (org2.get(j).getName().equals(orgName1)) {
                                org2.get(j).addManager(name, location.getName(), username, password);
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                enterpriseAdmin.addUser(username, password, "Wedding");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else {
                        List<PSH_Celebration_Anniversary> org3 = list.get(i).getListOfAnniversaries();
                        for (int j = 0; j < org3.size(); j++) {
                            if (org3.get(j).getName().equals(orgName1)) {
                                org3.get(j).addManager(name, location.getName(), username, password);
                                row[0] = location.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                enterpriseAdmin.addUser(username, password, "Anniversary");
                                JOptionPane.showMessageDialog(this, " Organisation Supervisor added successfully");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "username already exists");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
         if (jTable1.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {

            String orgType = orgCombo.getSelectedItem().toString();
            String orgname = orgName.getSelectedItem().toString();
            String userName = usernameField.getText();
            String password = passwordField.getText();

            PSH_EnterpriseCatalogDirectory enterCatalogueDirectory = location.getEnterpriseCatalogDirectory();
            for (PSH_EnterCatag_Celebration celeb : enterCatalogueDirectory.getListOfCelebrations()) {
                if (orgType.equals("BirthdayParty") && celeb.getListOfBirthdayParty() != null) {
                    for (PSH_Celebration_Bday birthday : celeb.getListOfBirthdayParty()) {
                        for (PSH_Manager mgr : birthday.getListOfManager()) {
                            if (mgr.getUsername().equals(usernameField.getText())) {
                                mgr.setName(nameField.getText());
                                mgr.setPassword(passwordField.getText());
                                enterpriseAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Anniversary") && celeb.getListOfAnniversaries() != null) {
                    for (PSH_Celebration_Anniversary ann : celeb.getListOfAnniversaries()) {
                        for (PSH_Manager mgr : ann.getListOfManager()) {
                            if (mgr.getUsername().equals(usernameField.getText())) {
                                mgr.setName(nameField.getText());
                                mgr.setPassword(passwordField.getText());
                                enterpriseAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Wedding") && celeb.getListOfWeddings() != null) {
                    for (PSH_Celebration_Wedding wed : celeb.getListOfWeddings()) {
                        for (PSH_Manager mgr : wed.getListOfManager()) {
                            if (mgr.getUsername().equals(usernameField.getText())) {
                                mgr.setName(nameField.getText());
                                mgr.setPassword(passwordField.getText());
                                enterpriseAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid organization");
                }
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String orgType = (String) model.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        PSH_EnterpriseCatalogDirectory enterCatalogueDirectory = location.getEnterpriseCatalogDirectory();
        for (PSH_EnterCatag_Celebration celeb : enterCatalogueDirectory.getListOfCelebrations()) {
            if (celeb.findManager(user) != null) {
                if (orgType.equals("BirthdayParty") && celeb.getListOfBirthdayParty() != null) {
                    for (PSH_Celebration_Bday birthday : celeb.getListOfBirthdayParty()) {
                        if (birthday.getName().equals(OrgName)) {
                            for (PSH_Manager mgr : birthday.getListOfManager()) {
                                if (mgr.getUsername().equals(selectedUser)) {
                                    birthday.deleteSupervisor(mgr);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager deleted successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Wedding") && celeb.getListOfWeddings() != null) {
                    for (PSH_Celebration_Wedding wed : celeb.getListOfWeddings()) {
                        if (wed.getName().equals(OrgName)) {
                            for (PSH_Manager mgr : wed.getListOfManager()) {
                                if (mgr.getUsername().equals(selectedUser)) {
                                    wed.deleteSupervisor(mgr);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager deleted successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    for (PSH_Celebration_Anniversary ann : celeb.getListOfAnniversaries()) {
                        if (ann.getName().equals(OrgName)) {
                            for (PSH_Manager mgr : ann.getListOfManager()) {
                                if (mgr.getUsername().equals(selectedUser)) {
                                    ann.deleteSupervisor(mgr);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager deleted successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        orgName.removeAllItems();

        String orgType = orgCombo.getSelectedItem().toString();
        PSH_EnterpriseCatalogDirectory enterCatalogueDirectory = location.getEnterpriseCatalogDirectory();
        List<PSH_EnterCatag_Celebration> list = enterCatalogueDirectory.getListOfCelebrations();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {
                if (orgType.equals("BirthdayParty")) {
                    List<PSH_Celebration_Bday> org1 = list.get(i).getListOfBirthdayParty();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                    }
                } else if (orgType.equals("Anniversary")) {
                    List<PSH_Celebration_Anniversary> org2 = list.get(i).getListOfAnniversaries();
                    for (int j = 0; j < org2.size(); j++) {
                        orgName.addItem(org2.get(j).getName());
                    }
                } else {
                    List<PSH_Celebration_Wedding> org3 = list.get(i).getListOfWeddings();
                    for (int j = 0; j < org3.size(); j++) {
                        orgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }
    }//GEN-LAST:event_orgComboActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        PSH_location location1 = enterpriseAdmin.findServiceLocation(location.getName());
        PSH_EnterpriseCatalogDirectory businessCatalogueDirectory = location.getEnterpriseCatalogDirectory();
        if (businessCatalogueDirectory == null) {
            return;
        }
        for (PSH_EnterCatag_Celebration event : businessCatalogueDirectory.getListOfCelebrations()) {
            if (event.findManager(user) != null) {
                if (event.getListOfBirthdayParty() != null) {
                    row[0] = "BirthdayParty";
                    for (PSH_Celebration_Bday birthday : event.getListOfBirthdayParty()) {
                        for (PSH_Manager supervisor : birthday.getListOfManager()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "BirthdayParty";
                            row[2] = birthday.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (event.getListOfAnniversaries() != null) {
                    row[0] = "Anniversary";
                    for (PSH_Celebration_Anniversary meeting : event.getListOfAnniversaries()) {
                        for (PSH_Manager supervisor : meeting.getListOfManager()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "Anniversary";
                            row[2] = meeting.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (event.getListOfWeddings() != null) {
                    row[0] = "Wedding";
                    for (PSH_Celebration_Wedding wed : event.getListOfWeddings()) {
                        for (PSH_Manager supervisor : wed.getListOfManager()) {       //add supervisor 
                            row[0] = location1.getName();
                            row[1] = "Wedding";
                            row[2] = wed.getName();
                            row[3] = supervisor.getName();
                            row[4] = supervisor.getUsername();
                            row[5] = supervisor.getPassword();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationName;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
