/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Address.Address;
import Business.Hospital.Hospital;
import Business.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageHospitalJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageHospitalJPanel(JPanel userProcessContainer, Business.Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;

        populateTable();
    }

    private void populateTable() {
        int rowCount = hospitallist_jTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) hospitallist_jTable.getModel();
        model.setRowCount(0);
        for (Hospital hospital : network.getHospitalDirectory().getHospitalDirectory()) {
            Object[] row = new Object[5];
            row[0] = hospital.getHospitalName();
            row[1] = hospital.getAddress();
            row[2] = hospital.getAddress().getZipCode();
            row[3] = hospital.getHospitalcontactNumber();
            row[4] = hospital.getHospitalemailId();
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

        networkJComboBox = new javax.swing.JComboBox();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitallist_jTable = new javax.swing.JTable();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        hospitalemail_jText = new javax.swing.JTextField();
        hospitalState_jText = new javax.swing.JTextField();
        hospitalZipCode_jText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hospitalCity_jText = new javax.swing.JTextField();
        hospitalStreetAddress_jText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hospitalContactNumber_jText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hospitalName_jText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Network");

        jLabel3.setText("Enterprise Type");

        jLabel2.setText("Name");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitallist_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Address", "Zip Code", "Contact Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hospitallist_jTable);
        if (hospitallist_jTable.getColumnModel().getColumnCount() > 0) {
            hospitallist_jTable.getColumnModel().getColumn(0).setResizable(false);
            hospitallist_jTable.getColumnModel().getColumn(1).setResizable(false);
            hospitallist_jTable.getColumnModel().getColumn(2).setResizable(false);
            hospitallist_jTable.getColumnModel().getColumn(3).setResizable(false);
            hospitallist_jTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 124, 953, 95));

        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Valid-Green-icon.png"))); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 431, 137, -1));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Fast-Rewind-icon.png"))); // NOI18N
        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 431, 130, -1));

        jLabel8.setText("Email Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 282, 130, -1));
        add(hospitalemail_jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 276, 175, -1));

        hospitalState_jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalState_jTextActionPerformed(evt);
            }
        });
        add(hospitalState_jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 384, 137, -1));

        hospitalZipCode_jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalZipCode_jTextActionPerformed(evt);
            }
        });
        add(hospitalZipCode_jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 384, 86, -1));

        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 387, 50, -1));

        hospitalCity_jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalCity_jTextActionPerformed(evt);
            }
        });
        add(hospitalCity_jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 384, 137, -1));

        hospitalStreetAddress_jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalStreetAddress_jTextActionPerformed(evt);
            }
        });
        add(hospitalStreetAddress_jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 384, 175, -1));

        jLabel11.setText("Street Address");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 387, 130, -1));

        jLabel12.setText("City");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 387, 50, -1));

        jLabel13.setText("Zip Code");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 387, 50, -1));

        jLabel9.setText("Contact Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 320, -1, -1));

        jLabel10.setText("Address ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 352, 50, -1));
        add(hospitalContactNumber_jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 314, 175, -1));

        jLabel7.setText("Hospital Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 244, 98, -1));
        add(hospitalName_jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 238, 175, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Hospital Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 28, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/watermark_1.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if (hospitalCity_jText.getText().equals("") || hospitalContactNumber_jText.getText().equals("") || hospitalemail_jText.getText().equals("") || hospitalStreetAddress_jText.getText().equals("") || hospitalCity_jText.getText().equals("") || hospitalZipCode_jText.getText().equals("") || hospitalState_jText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all fields");           
        } else {
            Hospital hospital = network.getHospitalDirectory().addHospital();
            hospital.setHospitalName(hospitalName_jText.getText());
            hospital.setHospitalcontactNumber(hospitalContactNumber_jText.getText());
            hospital.setHospitalemailId(hospitalemail_jText.getText());
            Address address = new Address();
            address.setStreetAddress(hospitalStreetAddress_jText.getText());
            address.setCity(hospitalCity_jText.getText());
            address.setZipCode(hospitalZipCode_jText.getText());
            address.setState(hospitalState_jText.getText());
            address.setCountry("United States of America");
            hospital.setAddress(address);
            populateTable();
            clearFields();
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    public void clearFields() {
        hospitalName_jText.setText("");
        hospitalContactNumber_jText.setText("");
        hospitalemail_jText.setText("");
        hospitalStreetAddress_jText.setText("");
        hospitalCity_jText.setText("");
        hospitalZipCode_jText.setText("");
        hospitalState_jText.setText("");
    }

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void hospitalState_jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalState_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalState_jTextActionPerformed

    private void hospitalZipCode_jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalZipCode_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalZipCode_jTextActionPerformed

    private void hospitalCity_jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalCity_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalCity_jTextActionPerformed

    private void hospitalStreetAddress_jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalStreetAddress_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalStreetAddress_jTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JTextField hospitalCity_jText;
    private javax.swing.JTextField hospitalContactNumber_jText;
    private javax.swing.JTextField hospitalName_jText;
    private javax.swing.JTextField hospitalState_jText;
    private javax.swing.JTextField hospitalStreetAddress_jText;
    private javax.swing.JTextField hospitalZipCode_jText;
    private javax.swing.JTextField hospitalemail_jText;
    private javax.swing.JTable hospitallist_jTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}