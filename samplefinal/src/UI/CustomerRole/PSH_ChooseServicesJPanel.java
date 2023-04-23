/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerRole;

import Model.PSH_Business;
import Model.PSH_RoomBooking;
import java.util.function.Consumer;

/**
 *
 * @author keerthanajagana
 */
public class PSH_ChooseServicesJPanel extends javax.swing.JPanel {

    private PSH_Business systems;
    private Consumer<PSH_RoomBooking> callOnCelebrationBooking;
    private Consumer<PSH_RoomBooking> callOnRestaurantBooking;
    private Consumer<PSH_RoomBooking> callOnTheatreBooking;
    private Consumer<PSH_RoomBooking> callOnHotelServiceBooking;
    private Runnable backButton4;
    private String username;
    private String hotelName;
    private PSH_RoomBooking booking;
    /**
     * Creates new form PSH_ChooseServicesJPanel
     */
    public PSH_ChooseServicesJPanel(PSH_Business systems, Consumer<PSH_RoomBooking> callOnCelebrationBooking, Consumer<PSH_RoomBooking> callOnOrderBooking,
            Consumer<PSH_RoomBooking> callOnTheatreBooking, Consumer<PSH_RoomBooking> callOnHotelServiceBooking, Runnable backButton, String username, PSH_RoomBooking booking) {
        initComponents();
         this.systems = systems;
        this.callOnCelebrationBooking = callOnCelebrationBooking;
        this.callOnRestaurantBooking = callOnOrderBooking;
        this.callOnTheatreBooking = callOnTheatreBooking;
        this.callOnHotelServiceBooking = callOnHotelServiceBooking;
        this.backButton4 = backButton;
        this.username = username;
        this.booking = booking;
        
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
        btnEvent = new javax.swing.JButton();
        btnCatering = new javax.swing.JButton();
        btnEntertainment = new javax.swing.JButton();
        btnOthers = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW SERVICES DETAILS");

        btnEvent.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEvent.setText("CELEBRATION");
        btnEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventActionPerformed(evt);
            }
        });

        btnCatering.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnCatering.setText("RESTAURANT");
        btnCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCateringActionPerformed(evt);
            }
        });

        btnEntertainment.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEntertainment.setText("THEATRE");
        btnEntertainment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntertainmentActionPerformed(evt);
            }
        });

        btnOthers.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnOthers.setText("HOTEL SERVICES");
        btnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOthersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(backBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(btnCatering, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(btnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnCatering, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        backButton4.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventActionPerformed
        callOnCelebrationBooking.accept(booking);
    }//GEN-LAST:event_btnEventActionPerformed

    private void btnCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCateringActionPerformed
        callOnRestaurantBooking.accept(booking);
    }//GEN-LAST:event_btnCateringActionPerformed

    private void btnEntertainmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntertainmentActionPerformed
        callOnTheatreBooking.accept(booking);
    }//GEN-LAST:event_btnEntertainmentActionPerformed

    private void btnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOthersActionPerformed
        callOnHotelServiceBooking.accept(booking);
    }//GEN-LAST:event_btnOthersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCatering;
    private javax.swing.JButton btnEntertainment;
    private javax.swing.JButton btnEvent;
    private javax.swing.JButton btnOthers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
