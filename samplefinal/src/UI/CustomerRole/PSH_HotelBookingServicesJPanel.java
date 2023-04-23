/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerRole;

import Model.PSH_Business;
import Model.PSH_Customer;
import Model.PSH_EnterCatag_Hotel;
import Model.PSH_Manager;
import Model.PSH_RoomBooking;
import Model.PSH_RoomType;
import Model.PSH_RoomType.RoomType;
import Model.PSH_location;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import main.DateUtilities;

/**
 *
 * @author keerthanajagana
 */
public class PSH_HotelBookingServicesJPanel extends javax.swing.JPanel {

    private PSH_Business systems;
    private Runnable callOnCreateMethod1;
    private String username;
    /**
     * Creates new form PSH_HotelBookingServicesJPanel
     */
    public PSH_HotelBookingServicesJPanel(PSH_Business systems, Runnable callOnCreateMethod1, String username) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        for (PSH_location location : systems.getListOfLocation()) {
            cityCombo.addItem(location.getName());
        }
        for (RoomType type : RoomType.values()) {
            roomtypeComboBox.addItem(type);
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
        lblbookservices = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        DCcheckin = new com.toedter.calendar.JDateChooser();
        DCcheckout = new com.toedter.calendar.JDateChooser();
        cmbResort = new javax.swing.JComboBox<>();
        cityCombo = new javax.swing.JComboBox<>();
        lblcity = new javax.swing.JLabel();
        lblhotel = new javax.swing.JLabel();
        btnnoofpeople = new javax.swing.JLabel();
        peopleField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        roomtypeComboBox = new javax.swing.JComboBox<>();
        lblroom = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        priceBtn = new javax.swing.JButton();
        priceField = new javax.swing.JTextField();
        bookRoomBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblbookservices.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        lblbookservices.setText("HOTEL BOOKING AND SERVICES");

        lbldate.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        lbldate.setText("CHECK-IN & CHECK-OUT");

        cmbResort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbResort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a hotel", " " }));

        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        lblcity.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        lblcity.setText("CITY");

        lblhotel.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        lblhotel.setText("RESORT");

        btnnoofpeople.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnnoofpeople.setText("NO OF PEOPLE");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("HALL TYPE ");

        roomtypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeComboBoxActionPerformed(evt);
            }
        });

        lblroom.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        lblroom.setText("NO OF ROOMS");

        priceBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        priceBtn.setText("TOTAL PRICE");
        priceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBtnActionPerformed(evt);
            }
        });

        bookRoomBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        bookRoomBtn.setText("BOOK");
        bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblroom)
                                    .addComponent(btnnoofpeople))
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbldate)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(peopleField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbResort, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(DCcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(DCcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(roomtypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(priceBtn)
                        .addGap(40, 40, 40)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(548, 548, 548)
                        .addComponent(bookRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backBtn)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblbookservices, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblbookservices)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DCcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DCcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldate, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcity)
                    .addComponent(lblhotel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbResort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnoofpeople)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roomtypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peopleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lblroom)
                .addGap(26, 26, 26)
                .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceBtn)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(bookRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        String city = cityCombo.getSelectedItem().toString();
        PSH_location location = systems.findServiceLocation(city);
        cmbResort.removeAllItems();
        if (location != null) {
            for (PSH_EnterCatag_Hotel resort : location.getEnterpriseCatalogDirectory().getListOfHotels()) {  //populate all resort in that city
                cmbResort.addItem(resort.getName());
            }
        }
    }//GEN-LAST:event_cityComboActionPerformed

    private void roomtypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeComboBoxActionPerformed

    }//GEN-LAST:event_roomtypeComboBoxActionPerformed

    private void priceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBtnActionPerformed
        final String roomNum = roomField.getText();
        if (roomNum != null && !roomNum.isEmpty()) {
            int roomCount = Integer.parseInt(roomNum);
            RoomType selectType = (RoomType) roomtypeComboBox.getSelectedItem();
            priceField.setText(selectType.getRate() * roomCount + "$");
        } else {
            JOptionPane.showMessageDialog(this, "Please provide number of rooms to calculate price.");
        }
    }//GEN-LAST:event_priceBtnActionPerformed

    private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtnActionPerformed
        Date checkinDate = DCcheckin.getDate();
        Date checkoutdate = DCcheckout.getDate();
        String city = cityCombo.getSelectedItem().toString();
        int roomCount = Integer.parseInt(roomField.getText());
        RoomType roomType = (RoomType) roomtypeComboBox.getSelectedItem();

        if (checkinDate.compareTo(DateUtilities.now()) < 0 || checkoutdate.compareTo(DateUtilities.now()) < 0) {
            JOptionPane.showMessageDialog(this, "Checkin and checkout dates cannot be in the past.");
            return;
        }

        if (checkinDate.compareTo(checkoutdate) > 0) {
            JOptionPane.showMessageDialog(this, "Checkout date should be after checkin date.");
            return;
        }

        PSH_location location = systems.findServiceLocation(city);

        PSH_EnterCatag_Hotel hotel = location.getEnterpriseCatalogDirectory().findHotel(cmbResort.getSelectedItem().toString());
        List<PSH_RoomType> availableRooms = hotel.availableRooms(checkinDate, checkoutdate, roomType);
        if (availableRooms.size() < roomCount) {
            JOptionPane.showMessageDialog(this, "Rooms not available for the specified date.");
            return;
        }

        hotel.bookRooms(checkinDate, checkoutdate, roomCount, roomType);
        PSH_Customer customer = systems.getCustomerDirectory().findCustomerUsername(username);
        PSH_RoomBooking booking = customer.addBooking(hotel, location);  //add bookings in customer class
        booking.getResortService().getRoomslist().createHallRoom(roomType);     // add rooms in booking class
        booking.setCheckin(checkinDate);
        booking.setCheckout(checkoutdate);
        booking.setStatus("Booked");
        booking.setCost(roomType.getRate());

        JOptionPane.showMessageDialog(this, "Room booked successfully. The total cost for your booking is "
            + (roomCount * roomType.getRate()) + "$");
        callOnCreateMethod1.run();
    }//GEN-LAST:event_bookRoomBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCcheckin;
    private com.toedter.calendar.JDateChooser DCcheckout;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookRoomBtn;
    private javax.swing.JLabel btnnoofpeople;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> cmbResort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblroom;
    private javax.swing.JTextField peopleField;
    private javax.swing.JButton priceBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField roomField;
    private javax.swing.JComboBox<RoomType> roomtypeComboBox;
    // End of variables declaration//GEN-END:variables
}
