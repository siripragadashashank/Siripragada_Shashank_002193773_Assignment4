/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Encounter;
import model.EncounterHistory;
import model.Person;
import model.System;
import model.VitalSigns;

/**
 *
 * @author sirip
 */
public class VitalSignsAddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignsEditAddJPanel
     */
    
    private JPanel displayJPanel;
    private System system;
    private Person person;
    
    public VitalSignsAddJPanel(JPanel displayJPanel, System system, Person person) {
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.person=person;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddVitalSigns = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblTemperature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblRespirationRate = new javax.swing.JLabel();
        txtSPO2 = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        lblSPO2 = new javax.swing.JLabel();
        txtBmi = new javax.swing.JTextField();
        lblBmi = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        btnAddVitalSigns = new javax.swing.JButton();

        lblAddVitalSigns.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblAddVitalSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddVitalSigns.setText("Add Vital Signs");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTemperature.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTemperature.setText("Temperature:");

        lblBloodPressure.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBloodPressure.setText("Blood Pressure:");

        lblRespirationRate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblRespirationRate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRespirationRate.setText("Respiration Rate:");

        lblPulse.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPulse.setText("Pulse:");

        lblSPO2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSPO2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSPO2.setText("SpO2:");

        lblBmi.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblBmi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBmi.setText("BMI:");

        btnAddVitalSigns.setText("Add");
        btnAddVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalSignsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblAddVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblBmi)))
                            .addGap(82, 82, 82)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(126, 126, 126)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblRespirationRate))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(119, 119, 119)
                                    .addComponent(lblTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(82, 82, 82)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnAddVitalSigns))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnBack)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblAddVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnAddVitalSigns)
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        EncounterHistoryJPanel vitalSignsViewJPanel = (EncounterHistoryJPanel) component;
        vitalSignsViewJPanel.populateTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalSignsActionPerformed
        // TODO add your handling code here:

        VitalSigns vitalSigns = new VitalSigns(Double.valueOf(txtTemperature.getText()), 
                                               Integer.valueOf(txtPulse.getText()),
                                               Double.valueOf(txtBloodPressure.getText()), 
                                               Integer.valueOf(txtRespirationRate.getText()), 
                                               Double.valueOf(txtSPO2.getText()), 
                                               Double.valueOf(txtBmi.getText()));

        Encounter encounter = new Encounter(vitalSigns);

        EncounterHistory encounterHistory = person.getPatient().getEncounterHistory();
        encounterHistory.getEncounterHistory().add(encounter);

        JOptionPane.showMessageDialog(this, "Successfully Added the Vital Signs");
        resetData();
    }//GEN-LAST:event_btnAddVitalSignsActionPerformed

    private void resetData() {
        
        txtTemperature.setText("");
        txtPulse.setText("");
        txtBloodPressure.setText("");
        txtRespirationRate.setText("");
        txtSPO2.setText("");
        txtBmi.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVitalSigns;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAddVitalSigns;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBmi;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblRespirationRate;
    private javax.swing.JLabel lblSPO2;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBmi;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextField txtSPO2;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
