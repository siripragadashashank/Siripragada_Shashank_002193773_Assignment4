/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JPanel;
import model.City;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.CityList;
import model.Community;
import model.House;

/**
 *
 * @author sirip
 */
public class AddCommunityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunityJPanel
     */
    private JPanel displayJPanel;
    private City city;
    
    public AddCommunityJPanel(JPanel displayJPanel, City city) {
        this.displayJPanel=displayJPanel;
        this.city = city;
        initComponents();
    }
    String regxCommunityName = "^[a-zA-Z\\s]+$";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddCommunity = new javax.swing.JLabel();
        lblCommunityName = new javax.swing.JLabel();
        txtAddCommunity = new javax.swing.JTextField();
        bntAddCommunity = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblAddCommunity.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAddCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddCommunity.setText("Add Community");

        lblCommunityName.setText("Community Name :");

        bntAddCommunity.setText("Add");
        bntAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddCommunityActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(lblAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblCommunityName)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(bntAddCommunity)))
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityName)
                    .addComponent(txtAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bntAddCommunity)
                .addGap(168, 168, 168))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bntAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddCommunityActionPerformed
        // TODO add your handling code here:

        
        if (txtAddCommunity.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please enter a Community name");
            return;
        }
        
        if (txtAddCommunity.getText().matches(regxCommunityName)){
 
       
            String communityName = txtAddCommunity.getText();
            ArrayList<House> houses = new ArrayList<>();
            Community community = new Community(communityName, houses);
            city.getCommunities().add(community);
            JOptionPane.showMessageDialog(this, "Successfully Saved");
            txtAddCommunity.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter a valid Community Name\nOnly alphabets and spaces allowed");
        }
        
        

    }//GEN-LAST:event_bntAddCommunityActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        CommunityJPanel communityJPanel = (CommunityJPanel) component;
        communityJPanel.populateTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAddCommunity;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAddCommunity;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JTextField txtAddCommunity;
    // End of variables declaration//GEN-END:variables
}
