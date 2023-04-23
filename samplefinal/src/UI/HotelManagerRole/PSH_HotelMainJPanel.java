/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HotelManagerRole;

import Model.PSH_Business;

/**
 *
 * @author keerthanajagana
 */
public class PSH_HotelMainJPanel extends javax.swing.JPanel {

    private PSH_Business enterpriseAdmin;
    private Runnable callMethod1;
    private Runnable callMethod2;
    private Runnable callMethod3;
    private Runnable callMethod4;
    
    /**
     * Creates new form PSH_HotelMainJPanel
     */
    public PSH_HotelMainJPanel(PSH_Business enterpriseAdmin, Runnable callMethod1, Runnable callMethod2, Runnable callMethod3, Runnable callMethod4) {
        initComponents();
        this.enterpriseAdmin=enterpriseAdmin;
        this.callMethod1 = callMethod1;
        this.callMethod2 = callMethod2;
        this.callMethod3 = callMethod3;
        this.callMethod4 = callMethod4;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dashBtn = new javax.swing.JButton();
        manageOrgBtn = new javax.swing.JButton();
        orgAdBtn = new javax.swing.JButton();
        manageHotelBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Hotel Manager");

        dashBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        dashBtn.setText("Dashboard");
        dashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBtnActionPerformed(evt);
            }
        });

        manageOrgBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageOrgBtn.setText("Manage Organization");
        manageOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgBtnActionPerformed(evt);
            }
        });

        orgAdBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orgAdBtn.setText("Organization Admin");
        orgAdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdBtnActionPerformed(evt);
            }
        });

        manageHotelBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageHotelBtn.setText("Manage Hotel");
        manageHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHotelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(dashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orgAdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(manageHotelBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(dashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(manageOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(orgAdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(manageHotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashBtnActionPerformed
        // TODO add your handling code here:
        callMethod1.run();
    }//GEN-LAST:event_dashBtnActionPerformed

    private void manageOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgBtnActionPerformed
        // TODO add your handling code here:
        callMethod2.run();
    }//GEN-LAST:event_manageOrgBtnActionPerformed

    private void orgAdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdBtnActionPerformed
        // TODO add your handling code here:
        callMethod3.run();
    }//GEN-LAST:event_orgAdBtnActionPerformed

    private void manageHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHotelBtnActionPerformed
        // TODO add your handling code here:
        callMethod4.run();
    }//GEN-LAST:event_manageHotelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageHotelBtn;
    private javax.swing.JButton manageOrgBtn;
    private javax.swing.JButton orgAdBtn;
    // End of variables declaration//GEN-END:variables
}
