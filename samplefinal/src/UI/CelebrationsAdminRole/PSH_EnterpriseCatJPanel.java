/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CelebrationsAdminRole;

import Model.PSH_Business;
import Model.PSH_EnterCatag_Celebration;
import Model.PSH_EnterCatag_Hotel;
import Model.PSH_EnterCatag_Restaurant;
import Model.PSH_EnterCatag_Theatre;
import Model.PSH_EnterpriseCatalog;
import Model.PSH_EnterpriseCatalogDirectory;
import Model.PSH_location;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keerthanajagana
 */
public class PSH_EnterpriseCatJPanel extends javax.swing.JPanel {

    private PSH_Business enterpriseAdmin;
    private Runnable callMethod;
    /**
     * Creates new form PSH_EnterpriseCatJPanel
     */
    public PSH_EnterpriseCatJPanel(PSH_Business enterpriseAdmin,Runnable callMethod) {
        initComponents();
        this.enterpriseAdmin=enterpriseAdmin;
        this.callMethod = callMethod;
        for (PSH_location location : enterpriseAdmin.getListOfLocation()) {      //populate items in location combobox
            cmbLocation.addItem(location.getName());
        }
        for (PSH_location location : enterpriseAdmin.getListOfLocation()) {
            locName.addItem(location.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        locName = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtBCName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbLocationType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setText("Back");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Enterprise Catalogue");

        jLabel2.setText("Choose Location");

        locName.setToolTipText("SELECT");
        locName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locNameActionPerformed(evt);
            }
        });

        jButton2.setText("Display");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Loaction", "Enterprise Catalogue", "Enterprise Catalogue Type", "Contact no"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        BtnUpdate.setText("UPDATE");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("LOCATION:");

        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });

        jLabel4.setText("BUSNIESS CATALOGUE NAME:");

        txtBCName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setText("MOBILE NO:");

        cmbLocationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Celebration", "Hotel", "Restaurant", "Theatre" }));
        cmbLocationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("CATALOGUE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2)
                        .addGap(118, 118, 118)
                        .addComponent(locName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtBCName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbLocationType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton2)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(locName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLocationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean validateName() {
        if (txtBCName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean validateContactNum() {
        if (txtMobile.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contact: contact should contain only 10 digits");
            return false;
        }
    }
    private void locNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locNameActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select 1 row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String locationName = cmbLocation.getSelectedItem().toString();
        String enterpriseCatalogueType1 = cmbLocationType.getSelectedItem().toString();
        String enterpriseCatalogueName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        PSH_location location = enterpriseAdmin.findServiceLocation(locationName);
        PSH_EnterpriseCatalogDirectory enterpriseCatalogueDirectory = location.getEnterpriseCatalogDirectory();

        PSH_EnterpriseCatalog ECToUpdate = null;
        if (enterpriseCatalogueType1.equals("Theatre") && enterpriseCatalogueDirectory != null) {

            for (PSH_EnterCatag_Theatre list : enterpriseCatalogueDirectory.getListOfTheatre()) {
                if (list.getName().equals(enterpriseCatalogueName)) {  //if enterprise name matches
                    ECToUpdate = list;
                }
            }
            JOptionPane.showMessageDialog(this, "Enterprise updated successfully");
            return;
        } else if (enterpriseCatalogueType1.equals("Celebration") && enterpriseCatalogueDirectory != null) {
            for (PSH_EnterCatag_Celebration list : enterpriseCatalogueDirectory.getListOfCelebrations()) {
                if (list.getName().equals(enterpriseCatalogueName)) {
                    ECToUpdate = list;
                }
            }
        } else if (enterpriseCatalogueType1.equals("Hotel") && enterpriseCatalogueDirectory != null) {
            for (PSH_EnterCatag_Hotel list : enterpriseCatalogueDirectory.getListOfHotels()) {
                if (list.getName().equals(enterpriseCatalogueName)) {           //if enterprise name matches
                    ECToUpdate = list;
                }
            }
        } else if (enterpriseCatalogueType1.equals("Restaurant") && enterpriseCatalogueDirectory != null) {
            for (PSH_EnterCatag_Restaurant list : enterpriseCatalogueDirectory.getListOfRestaurants()) {
                if (list.getName().equals(enterpriseCatalogueName)) {           //if enterprise name matches
                    ECToUpdate = list;
                }
            }
        }

        if (ECToUpdate == null) {
            JOptionPane.showMessageDialog(this, "Unknown Business Catalogue.");
            return;
        }

        ECToUpdate.setName(txtBCName.getText());
        ECToUpdate.setContact(txtMobile.getText());
        populateTable();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String locationName = (String) model.getValueAt(selectedRowIndex, 0);
        String businessCatalogueType = (String) model.getValueAt(selectedRowIndex, 2);
        String businessCatalogueName = (String) model.getValueAt(selectedRowIndex, 1);
        PSH_location network = enterpriseAdmin.findServiceLocation(locationName);
        PSH_EnterpriseCatalogDirectory enterpriseDirec = network.getEnterpriseCatalogDirectory();
        if (businessCatalogueType.equals("Celebration") && enterpriseDirec.getListOfCelebrations() != null) {
            for (PSH_EnterCatag_Celebration event : enterpriseDirec.getListOfCelebrations()) {
                if (event.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueCelebration(event);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (businessCatalogueType.equals("Hotel") && enterpriseDirec.getListOfHotels() != null) {
            for (PSH_EnterCatag_Hotel resort : enterpriseDirec.getListOfHotels()) {
                if (resort.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueResort(resort);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (businessCatalogueType.equals("Restaurant") && enterpriseDirec.getListOfRestaurants() != null) {
            for (PSH_EnterCatag_Restaurant cat : enterpriseDirec.getListOfRestaurants()) {
                if (cat.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueCatering(cat);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (businessCatalogueType.equals("Theatre") && enterpriseDirec.getListOfTheatre() != null) {
            for (PSH_EnterCatag_Theatre ent : enterpriseDirec.getListOfTheatre()) {
                if (ent.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueTheatre(ent);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "not found");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed

    }//GEN-LAST:event_cmbLocationActionPerformed

    private void cmbLocationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationTypeActionPerformed

    }//GEN-LAST:event_cmbLocationTypeActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
         String contact = txtMobile.getText();
        String name = txtBCName.getText();
        String locationName = cmbLocation.getSelectedItem().toString();
        String businessCatalogueType1 = cmbLocationType.getSelectedItem().toString();
        PSH_location network = enterpriseAdmin.findServiceLocation(locationName);

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Invalid input: Enterprise name should be atleast 2 characters long.");
            return;
        }

        PSH_EnterpriseCatalogDirectory businessCatalogueDirectory = network.getEnterpriseCatalogDirectory();
        if (businessCatalogueType1.equals("Theatre") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addTheatre(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        } else if (businessCatalogueType1.equals("Restaurant") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addRestaurant(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (businessCatalogueType1.equals("Celebration") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addCelebration(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (businessCatalogueType1.equals("Hotel") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addHotel(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        }
        txtBCName.setText("");
        txtMobile.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String locationName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String bcName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String bcType1 = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String bcContact = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        cmbLocation.setSelectedItem(locationName);
        cmbLocationType.setSelectedItem(bcType1);
        txtBCName.setText(bcName);
        txtMobile.setText(bcContact);
    }//GEN-LAST:event_jTable1MouseClicked


    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String locationItem = locName.getSelectedItem().toString();
        PSH_location location = enterpriseAdmin.findServiceLocation(locationItem);

        List<PSH_EnterCatag_Celebration> eventList = location.getEnterpriseCatalogDirectory().getListOfCelebrations();
        if (eventList != null) {
            for (int i = 0; i < eventList.size(); i++) {
                row[0] = locationItem;
                row[1] = eventList.get(i).getName();
                row[2] = "Celebration";
                row[3] = eventList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<PSH_EnterCatag_Restaurant> cateringList = location.getEnterpriseCatalogDirectory().getListOfRestaurants();
        if (cateringList != null) {
            for (int i = 0; i < cateringList.size(); i++) {
                row[0] = locationItem;
                row[1] = cateringList.get(i).getName();
                row[2] = "Restaurant";
                row[3] = cateringList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<PSH_EnterCatag_Theatre> entertainmentList = location.getEnterpriseCatalogDirectory().getListOfTheatre();
        if (entertainmentList != null) {
            for (int i = 0; i < entertainmentList.size(); i++) {
                row[0] = locationItem;
                row[1] = entertainmentList.get(i).getName();
                row[2] = "Theatre";
                row[3] = entertainmentList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<PSH_EnterCatag_Hotel> resortList = location.getEnterpriseCatalogDirectory().getListOfHotels();
        if (resortList != null) {
            for (int i = 0; i < resortList.size(); i++) {
                row[0] = locationItem;
                row[1] = resortList.get(i).getName();
                row[2] = "Hotel";
                row[3] = resortList.get(i).getContact();
                model.addRow(row);
            }
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbLocationType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> locName;
    private javax.swing.JTextField txtBCName;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables
}
