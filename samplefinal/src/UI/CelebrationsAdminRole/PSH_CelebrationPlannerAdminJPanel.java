/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CelebrationsAdminRole;

import Model.PSH_Business;

/**
 *
 * @author keerthanajagana
 */
public class PSH_CelebrationPlannerAdminJPanel extends javax.swing.JPanel {

    PSH_Business business;
    private Runnable callMethod1;
    private Runnable callMethod2;
    private Runnable callMethod3;
    private Runnable callMethod4;
    /**
     * Creates new form PSH_CelebrationPlannerAdminJPanel
     */
    public PSH_CelebrationPlannerAdminJPanel(PSH_Business business, Runnable callMethod1, Runnable callMethod2, Runnable callMethod3, Runnable callMethod4) {
        initComponents();
        this.business=business;
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

        locationBtn = new javax.swing.JButton();
        entCatBtn = new javax.swing.JButton();
        entManagerBtn = new javax.swing.JButton();
        customerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        locationBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        locationBtn.setText("Locations");
        locationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationBtnActionPerformed(evt);
            }
        });

        entCatBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        entCatBtn.setText("Enterprise Catalogue");
        entCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entCatBtnActionPerformed(evt);
            }
        });

        entManagerBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        entManagerBtn.setText("Enterprise Manager");
        entManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entManagerBtnActionPerformed(evt);
            }
        });

        customerBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        customerBtn.setText("Customer");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Celebration Planner Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(entManagerBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(361, 361, 361)
                            .addComponent(locationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(309, 309, 309)
                            .addComponent(entCatBtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(customerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1)))
                .addGap(0, 277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(locationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(entCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(entManagerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(customerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void locationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBtnActionPerformed
        // TODO add your handling code here:
        callMethod1.run();
    }//GEN-LAST:event_locationBtnActionPerformed

    private void entCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entCatBtnActionPerformed
        // TODO add your handling code here:
        callMethod2.run();
    }//GEN-LAST:event_entCatBtnActionPerformed

    private void entManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entManagerBtnActionPerformed
        // TODO add your handling code here:
        callMethod3.run();
    }//GEN-LAST:event_entManagerBtnActionPerformed

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        // TODO add your handling code here:
        callMethod4.run();
    }//GEN-LAST:event_customerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerBtn;
    private javax.swing.JButton entCatBtn;
    private javax.swing.JButton entManagerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton locationBtn;
    // End of variables declaration//GEN-END:variables
}
