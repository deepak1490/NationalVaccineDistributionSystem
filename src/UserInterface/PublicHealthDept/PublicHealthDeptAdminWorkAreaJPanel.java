/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PublicHealthDept;

import Business.Cdc;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Deepak
 */
public class PublicHealthDeptAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PublicHealthDeptAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private Cdc system;
    private DB4OUtil db4o;

    public PublicHealthDeptAdminWorkAreaJPanel(JPanel userProcessContainer,
            UserAccount userAccount, Organization organization,
            Enterprise enterprise, Cdc system, DB4OUtil db4o) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
        this.db4o = db4o;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approveHospitalButton = new javax.swing.JButton();
        approveOrdersButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        approvePharmacyButton = new javax.swing.JButton();
        approvePharmacyOrdersButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reportJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approveHospitalButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        approveHospitalButton.setText("Approve Hospitals");
        approveHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveHospitalButtonActionPerformed(evt);
            }
        });
        add(approveHospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 190, -1));

        approveOrdersButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        approveOrdersButton.setText("Approve Hospital Orders");
        approveOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveOrdersButtonActionPerformed(evt);
            }
        });
        add(approveOrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 190, -1));

        logoutJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 113, -1));

        approvePharmacyButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        approvePharmacyButton.setText("Approve Pharmacy");
        approvePharmacyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvePharmacyButtonActionPerformed(evt);
            }
        });
        add(approvePharmacyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 190, -1));

        approvePharmacyOrdersButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        approvePharmacyOrdersButton.setText("Approve Pharmacy Orders");
        approvePharmacyOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvePharmacyOrdersButtonActionPerformed(evt);
            }
        });
        add(approvePharmacyOrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Public Health Department Admin Page");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setText("Order Approval");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel3.setText("Registration Approval");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        reportJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reportJButton.setText("Report Vaccines ");
        reportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportJButtonActionPerformed(evt);
            }
        });
        add(reportJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void approveHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveHospitalButtonActionPerformed

        ApproveHospitalsJPanel approve = new ApproveHospitalsJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("ApproveHospitalsJPanel", approve);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approveHospitalButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed

        db4o.storeSystem(system);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void approveOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveOrdersButtonActionPerformed
        ApproveHospitalOrdersJPanel approve = new ApproveHospitalOrdersJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("ApproveHospitalOrdersJPanel", approve);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approveOrdersButtonActionPerformed

    private void approvePharmacyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvePharmacyButtonActionPerformed
        ApprovePharmacyJPanel approve = new ApprovePharmacyJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("ApprovePharmacyJPanel", approve);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approvePharmacyButtonActionPerformed

    private void approvePharmacyOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvePharmacyOrdersButtonActionPerformed
        ApprovePharmacyOrdersJPanel approve = new ApprovePharmacyOrdersJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("ApprovePharmacyOrdersJPanel", approve);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approvePharmacyOrdersButtonActionPerformed

    private void reportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportJButtonActionPerformed
        ReportVaccinesToCDCJPanel report = new ReportVaccinesToCDCJPanel(userProcessContainer, system, enterprise, userAccount);
        userProcessContainer.add("ReportVaccinesToCDCJPanel", report);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reportJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveHospitalButton;
    private javax.swing.JButton approveOrdersButton;
    private javax.swing.JButton approvePharmacyButton;
    private javax.swing.JButton approvePharmacyOrdersButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton reportJButton;
    // End of variables declaration//GEN-END:variables
}
