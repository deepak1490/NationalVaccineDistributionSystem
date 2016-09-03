/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer;

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
public class ManufacturerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    Cdc ecoSystem;
    DB4OUtil db4o;

    public ManufacturerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Cdc ecoSystem, DB4OUtil db4o) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        this.db4o = db4o;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approveJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approveJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        approveJButton.setText("Approve Orders");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        add(approveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        logoutJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 113, -1));

        titleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleJLabel.setText("Manufacturer Work Area");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("View Vaccine Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        ApproveOrdersJPanel approve = new ApproveOrdersJPanel(userProcessContainer, account, organization, enterprise, ecoSystem);
        userProcessContainer.add("", approve);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed

        db4o.storeSystem(ecoSystem);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewReportsJPanel view = new ViewReportsJPanel(userProcessContainer, enterprise, ecoSystem, account);
        userProcessContainer.add("ViewReportsJPanel", view);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
