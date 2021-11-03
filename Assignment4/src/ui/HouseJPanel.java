/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.House;
import model.Patient;
import model.Person;
/**
 *
 * @author sirip
 */
public class HouseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HouseJPanel
     */
    private JPanel displayJPanel;
    private model.System system;
    private Community community;
    
    public HouseJPanel(JPanel displayJPanel, model.System system, Community community) {
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.community=community;
        initComponents();
        populateHouses();
    }

    public void populateHouses() {
        
        DefaultTableModel model = (DefaultTableModel) housesJTable.getModel();
        model.setRowCount(0);
        
        for(House house:community.getCommunityHouses()){
            Object[] row = new Object[4];
            row[0] = house;
            model.addRow(row);
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

        btnNext = new javax.swing.JButton();
        housesJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        housesJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        housesJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        housesJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        housesJLabel.setText("Houses List");

        housesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "House Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(housesJTable);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setText("View/Update");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(housesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnDelete)
                    .addComponent(btnView)
                    .addComponent(btnAdd))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        int selectedRow = housesJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(this, "Please Select any Community to View the Houses");
            return;
        }

        showPersonsInCommunity(selectedRow);
    }//GEN-LAST:event_btnNextActionPerformed
    private void showPersonsInCommunity(int selectedRow) {
        
        DefaultTableModel model = (DefaultTableModel) housesJTable.getModel();
        House house = (House) model.getValueAt(selectedRow, 0);
        navigateToPersons(house);
    }
    
    private void navigateToPersons(House house) {
        
        PersonJPanel personJPanel = new PersonJPanel(displayJPanel,system,house);
        displayJPanel.add("PersonsInformation", personJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout cardLayout =  (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = housesJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(this, "Please Select any Community to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) housesJTable.getModel();
        House house  = (House) model.getValueAt(selectedRow, 0);
        community.getCommunityHouses().remove(house);
        system.getPersonDirectory().getPersonList().removeAll(house.getPersons());

        ArrayList<Patient> patientsToRemove = new ArrayList<>();
        for(Person person:house.getPersons()){
            patientsToRemove.add(person.getPatient());
        }

        system.getPatientDirectory().getPatientList().removeAll(patientsToRemove);
        JOptionPane.showMessageDialog(this, "Successfully deleted the House");
        populateHouses();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = housesJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(this, "Please Select any Community to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) housesJTable.getModel();
        House house  = (House) model.getValueAt(selectedRow, 0);
        ViewHouseJPanel viewHouseJPanel = new ViewHouseJPanel(displayJPanel, system, house);
        displayJPanel.add("ViewHousePanel", viewHouseJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddHouseJPanel addHouseJPanel = new AddHouseJPanel(displayJPanel, system, community);
        displayJPanel.add("AddHousePanel",addHouseJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel housesJLabel;
    private javax.swing.JTable housesJTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}