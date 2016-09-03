/*
 * ManageHospitalCatalogJPanel.java
 *
 * Created on September 24, 2008, 2:40 PM
 */
package UserInterface.Provider;

import Business.Clinic.Clinic;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Role.ClinicAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepak
 */
public class ManageClinicCatalogJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Organization organization;
    UserAccount userAccount;
    Enterprise enterprise;

    /**
     * Creates new form ManageProductCatalogJPanel
     */
    public ManageClinicCatalogJPanel(JPanel upc, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        userProcessContainer = upc;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        refreshTable();
    }

    private void refreshTable() {
        int rowCount = cliniclCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) cliniclCatalog.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Clinic c : userAccount.getEmployee().getHospital().getClinicDirectory().getClinicList()) {
            Object row[] = new Object[2];
            row[0] = c;
            row[1] = userAccount.getEmployee().getHospital();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cliniclCatalog = new javax.swing.JTable();
        createPButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Clinic Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        cliniclCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clinic Name", "Associated Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cliniclCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 530, 89));

        createPButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        createPButton.setText("Create New Clinic");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });
        add(createPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 220, -1));

        backButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 110, -1));

        refreshButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        refreshButton.setMargin(new java.awt.Insets(2, 1, 2, 1));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 80, -1));

        delButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delButton.setText("Delete Clinic(s)");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });
        add(delButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed

        JTextField clinicNameTextField = new JTextField();

        Object[] addPatient = {"Clinic Name:", clinicNameTextField};
        int option = JOptionPane.showConfirmDialog(null, addPatient, "Add Clinic", JOptionPane.OK_CANCEL_OPTION, -1);

        if (option == JOptionPane.YES_OPTION) {
            Clinic clinic = userAccount.getEmployee().getHospital().getClinicDirectory().addClinic();
            if (clinicNameTextField.getText() == null) {
                JOptionPane.showMessageDialog(null, "Please provide a valid entry");
                return;
            }
            try {
                String fname = clinicNameTextField.getText();
                clinic.setFname(fname);
                Organization org = null;
                for (Organization organization1 : enterprise.getOrganizationList().getOrganizationList()) {
                    if (organization1 instanceof ClinicOrganization) {
                        org = organization1;
                    }
                }
                UserAccount ua = org.getUserAccountDirectory().createUserAccount(fname, fname + 1, clinic, new ClinicAdminRole());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide a valid entry");
                return;
            }
            JOptionPane.showMessageDialog(null, "Clinic details added successfully");
            refreshTable();
        }

    }//GEN-LAST:event_createPButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refreshTable();
}//GEN-LAST:event_refreshButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
        int row = cliniclCatalog.getSelectedRow();
        int selectedRowCount = cliniclCatalog.getSelectedRowCount();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a clinic");
            return;
        }
        if (selectedRowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one clinic");
        }
        Clinic c = (Clinic) cliniclCatalog.getValueAt(row, 0);
        userAccount.getEmployee().getHospital().getClinicDirectory().removeClinic(c);
        refreshTable();
        JOptionPane.showMessageDialog(null, "Clinic deleted successfully");
    }//GEN-LAST:event_delButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JTable cliniclCatalog;
    private javax.swing.JButton createPButton;
    private javax.swing.JButton delButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}