/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package UserInterface.SysAdmin;

import Business.Cdc;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Deepak
 */
public class SearchForVaccineJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Cdc system;

    /**
     * Creates new form CreateProductJPanel
     */
    public SearchForVaccineJPanel(JPanel upc, Cdc s) {

        initComponents();
        userProcessContainer = upc;
        system = s;
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
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search for Vaccine");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, 52));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Vaccine Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        nameField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 250, -1));

        searchButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchButton.setText("Search Now >>");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 160, -1));

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        Vaccine vaccine;
        if (nameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields can't be empty");
            return;
        }
        String name = nameField.getText();
        vaccine = system.getVaccineCatalog().searchVaccine(name);
        ViewVaccineDetailJPanel vpdjp = new ViewVaccineDetailJPanel(userProcessContainer, vaccine);
        userProcessContainer.add("ViewProductDetailJPanelSupplier", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

}//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
