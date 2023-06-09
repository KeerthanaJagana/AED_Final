/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerRole;

import Model.PSH_Business;
import Model.PSH_EnterCatag_Restaurant;
import Model.PSH_Restaurant_Menu;
import Model.PSH_RoomBooking;
import PSH_Model.EnterpriseServices.PSH_EnterCatag_RestaurantService;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import main.DateUtilities;

/**
 *
 * @author keerthanajagana
 */
public class PSH_RestaurantServicesJPanel extends javax.swing.JPanel {

     private PSH_Business systems;
    private Consumer<PSH_RoomBooking> callOnCreateMethod1;
    private String username;
    private PSH_RoomBooking booking;
    /**
     * Creates new form PSH_RestaurantServicesJPanel
     */
    public PSH_RestaurantServicesJPanel(PSH_Business systems, Consumer<PSH_RoomBooking> callOnCreateMethod1, String username, PSH_RoomBooking booking) {
        initComponents();
         initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (PSH_EnterCatag_Restaurant res : booking.getLocation().getEnterpriseCatalogDirectory().getListOfRestaurants()) {
            cmbCatering.addItem(res);
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

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCatering = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        menuItem = new javax.swing.JComboBox();
        placeOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("MENU ITEMS IN RESTAURANT");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("SELECT A CATERING NAME: ");

        cmbCatering.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCateringActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT ITEM FROM LIST: ");

        menuItem.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActionPerformed(evt);
            }
        });

        placeOrder.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        placeOrder.setText("PLACE ORDER");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbCatering, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn)))
                .addGap(0, 163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(placeOrder)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(cmbCatering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cmbCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCateringActionPerformed
        menuItem.removeAllItems();
        PSH_EnterCatag_Restaurant restaurant = (PSH_EnterCatag_Restaurant) cmbCatering.getSelectedItem();
        if (restaurant != null) {
            for (PSH_Restaurant_Menu item : restaurant.getListOfMenuItem()) {
                menuItem.addItem(item);
            }
        }
    }//GEN-LAST:event_cmbCateringActionPerformed

    private void menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActionPerformed

    }//GEN-LAST:event_menuItemActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        Date date = DateUtilities.formatDate(new Date());
        PSH_Restaurant_Menu item = (PSH_Restaurant_Menu) menuItem.getSelectedItem();
        PSH_EnterCatag_Restaurant restaurant = (PSH_EnterCatag_Restaurant) cmbCatering.getSelectedItem();

        PSH_EnterCatag_RestaurantService service = new PSH_EnterCatag_RestaurantService(restaurant, date, item.getDetails(), item.getPrice());
        booking.addService(service);
        JOptionPane.showMessageDialog(this, "Order placed successfully");

        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_placeOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cmbCatering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox menuItem;
    private javax.swing.JButton placeOrder;
    // End of variables declaration//GEN-END:variables
}
