/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Community;
import model.City;
import model.CityList;
import model.House;
import model.System;
/**
 *
 * @author sirip
 */
public class AddCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCityJPanel
     */
    private JPanel displayJPanel;
    private City city;
    private System system;
    
    public AddCityJPanel(JPanel displayJPanel, System system) {
        this.displayJPanel=displayJPanel;
        this.system = system;
        initComponents();
    }
    
    String regxCity = "^[a-zA-Z\\s]+$";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddCommunity = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        txtAddCity = new javax.swing.JTextField();
        btnAddCity = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblAddCommunity.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAddCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddCommunity.setText("Add City");

        lblCityName.setText("City Name :");

        btnAddCity.setText("Add");
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
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
                        .addComponent(lblCityName)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnAddCity)))
                .addGap(304, 304, 304))
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
                    .addComponent(lblCityName)
                    .addComponent(txtAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddCity)
                .addGap(211, 211, 211))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        // TODO add your handling code here:

        if (txtAddCity.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please enter a city name");
            return;
        }
        for (City city : CityList.getCitiesList()){
            if (city.getCityName().equals(txtAddCity.getText())){
                JOptionPane.showMessageDialog(this, "City already present");
                return;
            }
        }
        
        if (txtAddCity.getText().matches(regxCity)){
            CityList.addCity(new City(txtAddCity.getText()));
            system.addCity(new City(txtAddCity.getText()));
            JOptionPane.showMessageDialog(this, "City added successfully");
            txtAddCity.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter a valid City Name\nOnly alphabets and spaces allowed");
        }
        
//        String cityName = txtAddCity.getText();
//        ArrayList<Community> communities = new ArrayList<>();
//        City city = new City(cityName, communities);       
//        system.getCities().add(city);
//        JOptionPane.showMessageDialog(this, "Successfully Saved");
//        txtAddCity.setText("");
        

    }//GEN-LAST:event_btnAddCityActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        SystemJPanel sysJPanel = (SystemJPanel) component;
        sysJPanel.populateTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAddCommunity;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JTextField txtAddCity;
    // End of variables declaration//GEN-END:variables
}