/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.TheatreManagerRole;

import Model.PSH_Business;
import Model.PSH_Customer;
import Model.PSH_CustomerDirectory;
import Model.PSH_EnterCatag_Theatre;
import Model.PSH_Organization;
import Model.PSH_RoomBooking;
import Model.PSH_Theatre_MagicianOrg;
import Model.PSH_Theatre_MusicBandOrg;
import Model.PSH_Theatre_StandUpComedyOrg;
import PSH_Model.EnterpriseServices.PSH_EnterCatagService;
import PSH_Model.EnterpriseServices.PSH_EnterCatag_TheatreService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keerthanajagana
 */
public class PSH_DashboardJPanel extends javax.swing.JPanel {

    private PSH_Business enterpriseAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private PSH_EnterCatag_Theatre theatre;
    /**
     * Creates new form PSH_DashboardJPanel
     */
    public PSH_DashboardJPanel(PSH_Business enterpriseAdmin, Runnable callOnCreateMethod, String user, String type, PSH_EnterCatag_Theatre entertainment) {
        initComponents();
        this.enterpriseAdmin = enterpriseAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.theatre = entertainment;
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

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbmagicianORG = new javax.swing.JComboBox();
        cmbsingerORG = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbstandupcomORG = new javax.swing.JComboBox();
        btnassignWork = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        backButton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel1.setText("DISPLAY DASHBOARD ");

        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "NAME", "STATUS", "SINGER", "MAGICIAN", "CHOREOGRAPHER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("SELECT A SINGER");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("SELECT A MAGICIAN");

        cmbmagicianORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbsingerORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A STAND UP COMEDY");

        cmbstandupcomORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbstandupcomORG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstandupcomORGActionPerformed(evt);
            }
        });

        btnassignWork.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnassignWork.setText("ADD AND CONFIRM");
        btnassignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignWorkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btnassignWork)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(cmbsingerORG, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(211, 211, 211)
                                        .addComponent(cmbmagicianORG, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(backButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(cmbstandupcomORG, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backButton)
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsingerORG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbmagicianORG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbstandupcomORG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnassignWork, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void cmbstandupcomORGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstandupcomORGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstandupcomORGActionPerformed

    private void btnassignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignWorkActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        PSH_RoomBooking booking = (PSH_RoomBooking) model.getValueAt(selectedRowIndex, 0);

        PSH_EnterCatag_TheatreService theatreService = null;
        for (PSH_EnterCatagService service : booking.getServices()) {
            if (theatre.getName().equals(service.getEnterpriseCatalog().getName())) {
                theatreService = (PSH_EnterCatag_TheatreService) service;
                break;
            }
        }

        if (theatreService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find Entertainment");
            return;
        }
        if (!theatreService.getStatus().equals(PSH_EnterCatagService.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                booking.getId()));
        return;
        }

        PSH_Theatre_MusicBandOrg singer = (PSH_Theatre_MusicBandOrg) cmbsingerORG.getSelectedItem();
        PSH_Theatre_MagicianOrg magician = (PSH_Theatre_MagicianOrg) cmbmagicianORG.getSelectedItem();
        PSH_Theatre_StandUpComedyOrg choreographer = (PSH_Theatre_StandUpComedyOrg) cmbstandupcomORG.getSelectedItem();

        List<PSH_Organization> organizations = new ArrayList<>();
        for (PSH_EnterCatag_TheatreService.TheatreServiceType type : theatreService.getTheatreServices()) {
            switch (type) {
                case MUSICBAND:
                if (singer == null) {
                    JOptionPane.showMessageDialog(this, "Please select MUSIC BAND organization to be assinged for the booking.");
                    return;
                } else {
                    organizations.add(singer);
                }
                break;
                case MAGICIAN:
                if (magician == null) {
                    JOptionPane.showMessageDialog(this, "Please select magician organization to be assinged for the booking.");
                    return;
                } else {
                    organizations.add(magician);
                }
                break;
                case STANDUPCOMEDY:
                if (choreographer == null) {
                    JOptionPane.showMessageDialog(this, "Please select stand up comedy organization to be assinged for the booking.");
                    return;
                } else {
                    organizations.add(choreographer);
                }
                break;
            }
        }

        for (PSH_Organization organization : organizations) {
            theatreService.addOrganization(organization);
        }
        theatreService.setStatus(PSH_EnterCatagService.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all entertainment services to the booking: " + booking.getId());

        return;
    }//GEN-LAST:event_btnassignWorkActionPerformed


    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        PSH_CustomerDirectory customerDirec = enterpriseAdmin.getCustomerDirectory(); //get all customers
        for (PSH_Customer customer : customerDirec.getListOfCustomer()) {
            for (PSH_RoomBooking booking : customer.getRoombookingList()) {      //get booking details each customer
                for (PSH_EnterCatagService service : booking.getServices()) {       //get services under booking

                    if (service.getEnterpriseCatalog().getName().equals(theatre.getName())) {

                        PSH_EnterCatag_TheatreService entertainmentService = (PSH_EnterCatag_TheatreService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = entertainmentService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (PSH_EnterCatag_TheatreService.TheatreServiceType type : entertainmentService.getTheatreServices()) {
                            switch (type) {
                                case MUSICBAND:
                                    row[3] = "YES";
                                    break;
                                case MAGICIAN:
                                    row[4] = "YES";
                                    break;
                                case STANDUPCOMEDY:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                    
                }
            }
        }

    }

    private void populateComboBox() {
        cmbsingerORG.addItem(null);
        cmbmagicianORG.addItem(null);
        cmbstandupcomORG.addItem(null);

        for (PSH_Theatre_MusicBandOrg singer : theatre.getListOfMusicBand()) {
            if (singer != null) {
                cmbsingerORG.addItem(singer);
            }
        }
        for (PSH_Theatre_MagicianOrg magician : theatre.getListOfMagicians()) {
            if (magician != null) {
                cmbmagicianORG.addItem(magician);
            }
        }
        for (PSH_Theatre_StandUpComedyOrg com : theatre.getListOfComedians()) {
            if (com != null) {
                cmbstandupcomORG.addItem(com);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnassignWork;
    private javax.swing.JComboBox cmbmagicianORG;
    private javax.swing.JComboBox cmbsingerORG;
    private javax.swing.JComboBox cmbstandupcomORG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
