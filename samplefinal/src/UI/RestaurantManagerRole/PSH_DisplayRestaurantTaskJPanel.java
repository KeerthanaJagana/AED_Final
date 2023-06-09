/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.RestaurantManagerRole;

import Model.PSH_Business;
import Model.PSH_Customer;
import Model.PSH_CustomerDirectory;
import Model.PSH_DeliveryAgentOrg;
import Model.PSH_EnterCatag_Restaurant;
import Model.PSH_RoomBooking;
import PSH_Model.EnterpriseServices.PSH_EnterCatagService;
import PSH_Model.EnterpriseServices.PSH_EnterCatag_RestaurantService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keerthanajagana
 */
public class PSH_DisplayRestaurantTaskJPanel extends javax.swing.JPanel {

    private PSH_Business enterpriseAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private PSH_EnterCatag_Restaurant restaurant;
    /**
     * Creates new form PSH_DisplayRestaurantTaskJPanel
     */
    public PSH_DisplayRestaurantTaskJPanel(PSH_Business enterpriseAdmin, Runnable callOnCreateMethod, String user, String type, PSH_EnterCatag_Restaurant restaurant) {
        initComponents();
        this.enterpriseAdmin = enterpriseAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.restaurant = restaurant;
        populateComboBox();
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

        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        deliveryOrg = new javax.swing.JComboBox();
        acceptBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("VIEW ORDER DETAILS FOR RESTAURANT");

        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "ORDER DETAIL", "ADDRESS", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("SELECT AN ORGANIZATION FOR DELIVERY AGENT:");

        deliveryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        acceptBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        acceptBtn.setText("ACCEPT ORDER");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        denyBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        denyBtn.setText("DENY ORDER");
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(denyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deliveryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(deliveryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(denyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
         int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        PSH_RoomBooking booking = (PSH_RoomBooking) model.getValueAt(selectRowIndex, 0);

        PSH_EnterCatag_RestaurantService resService = null;
        for (PSH_EnterCatagService service : booking.getServices()) {
            if (restaurant.getName().equals(service.getEnterpriseCatalog().getName())) {
                resService = (PSH_EnterCatag_RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }

        if (!resService.getStatus().equals(PSH_EnterCatagService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        PSH_DeliveryAgentOrg delivery = (PSH_DeliveryAgentOrg) deliveryOrg.getSelectedItem();
        if (delivery == null) {
            JOptionPane.showMessageDialog(this, "Please select delivery organization to be assinged.");
            return;
        }

        resService.addOrganization(delivery);
        resService.setStatus(PSH_EnterCatagService.Status.CONFIRMED);

        JOptionPane.showMessageDialog(this, String.format("Booking %s is assigned to delivery ord '%s'",
                booking.getId(), delivery));

        populateTable();
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void denyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyBtnActionPerformed
         int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        PSH_RoomBooking booking = (PSH_RoomBooking) model.getValueAt(selectRowIndex, 0);

        PSH_EnterCatag_RestaurantService resService = null;
        for (PSH_EnterCatagService service : booking.getServices()) {
            if (service instanceof PSH_EnterCatag_RestaurantService) {
                resService = (PSH_EnterCatag_RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }
        if (!resService.getStatus().equals(PSH_EnterCatagService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        resService.setStatus(PSH_EnterCatagService.Status.REJECTED);
        JOptionPane.showMessageDialog(this, String.format("Booking '%s' is denied.", booking.getId()));
        populateTable();
    }//GEN-LAST:event_denyBtnActionPerformed


    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        PSH_CustomerDirectory clientDirectory = enterpriseAdmin.getCustomerDirectory(); //get all customers
        for (PSH_Customer customer : clientDirectory.getListOfCustomer()) {
            for (PSH_RoomBooking booking : customer.getRoombookingList()) {      //get booking details each customer
                for (PSH_EnterCatagService service : booking.getServices()) {       //get services under booking
                    if (service.getEnterpriseCatalog().getName().equals(restaurant.getName())) {
                        PSH_EnterCatag_RestaurantService cateringService = (PSH_EnterCatag_RestaurantService) service;
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = booking.getStatus();
                        row[3] = customer.getAddress();
                        row[4] = cateringService.getStatus();
                        model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        deliveryOrg.addItem(null);
        for (PSH_DeliveryAgentOrg delivery : restaurant.getListOfDeliveryAgentOrganisation()) {
            if (delivery != null) {
                deliveryOrg.addItem(delivery);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox deliveryOrg;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
