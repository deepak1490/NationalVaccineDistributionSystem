/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package UserInterface.SysAdmin;

import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Deepak
 */
public class ViewVaccineDetailJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Vaccine vaccine;

    /**
     * Creates new form CreateProductJPanel
     *
     * @param upc
     * @param v
     */
    public ViewVaccineDetailJPanel(JPanel upc, Vaccine v) {
        initComponents();
        userProcessContainer = upc;
        vaccine = v;
        nameField.setText(v.getVaccineName());
        diseaseNameField.setText(v.getDiseaseName());
        idField.setText(convertInteger(v.getID()));
        priceField.setText(Float.toString(v.getPrice()));
        avalabilityText.setText(convertInteger(v.getAvailability()));
        manufactureDateField.setText(v.getManufactureDate());
        expiryDateField.setText(v.getExpiryDate());
    }

    public static String convertInteger(int i) {
        return Integer.toString(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        availabilityLabel = new javax.swing.JLabel();
        expiryDateField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diseaseNameField = new javax.swing.JTextField();
        manufactureDateField = new javax.swing.JTextField();
        availabilityLabel1 = new javax.swing.JLabel();
        avalabilityText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("View Vaccine Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Vaccine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 159, -1));

        availabilityLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        availabilityLabel.setText("Expiry Date:");
        add(availabilityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, 30));

        expiryDateField.setEditable(false);
        expiryDateField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        expiryDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(expiryDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 159, -1));

        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateButton.setText("Update Product");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 176, -1));

        backButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 159, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Vaccine ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, 30));

        saveButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 70, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Manufacture Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Disease Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, 30));

        diseaseNameField.setEditable(false);
        diseaseNameField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        diseaseNameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(diseaseNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 159, -1));

        manufactureDateField.setEditable(false);
        manufactureDateField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manufactureDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(manufactureDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 159, -1));

        availabilityLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        availabilityLabel1.setText("Availablity:");
        add(availabilityLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, 30));

        avalabilityText.setEditable(false);
        avalabilityText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        avalabilityText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(avalabilityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 159, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Product Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 30));

        priceField.setEditable(false);
        priceField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        priceField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 159, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        nameField.setEditable(true);
        diseaseNameField.setEditable(true);
        saveButton.setEnabled(true);
        expiryDateField.setEditable(true);
        priceField.setEditable(true);
        manufactureDateField.setEditable(true);
        avalabilityText.setEditable(true);

}//GEN-LAST:event_updateButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        int avalability;
        int price;
        if (nameField.getText().equals("") || diseaseNameField.getText().equals("") || priceField.getText().equals("") || expiryDateField.getText().equals("") || manufactureDateField.getText().equals("") || avalabilityText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields can't be empty");
            return;
        }
        try {

            price = Integer.parseInt(priceField.getText());

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Invalid Price");
            priceField.setText(null);
            return;
        }
        try {
            avalability = Integer.parseInt(avalabilityText.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Availability");
            avalabilityText.setText(null);
            return;
        }
        if (price > 0) {

            vaccine.setVaccineName(nameField.getText());
            vaccine.setDiseaseName(diseaseNameField.getText());
            vaccine.setAvailability(avalability);
            vaccine.setPrice(price);
            vaccine.setManufactureDate(manufactureDateField.getText());
            vaccine.setExpiryDate(expiryDateField.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Invalid price");
            priceField.setText(null);
            return;
        }
        JOptionPane.showMessageDialog(null, "Vaccine Updated Successfully");
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JLabel availabilityLabel1;
    private javax.swing.JTextField avalabilityText;
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField diseaseNameField;
    private javax.swing.JTextField expiryDateField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField manufactureDateField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
