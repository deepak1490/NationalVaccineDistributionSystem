/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Provider;

import Business.Employee.Employee;
import Business.Enterprise.ProvidersEnterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepak
 */
public class ManagePharmacyEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private ProvidersEnterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManagePharmacyEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir, ProvidersEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        populatePharmacyComboBox();
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();
        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationEmpJComboBox.addItem(organization);
        }
    }

    public void populatePharmacyComboBox() {
        pharmacyComboBox.removeAllItems();
        for (Pharmacy pharmacy : enterprise.getPharmacyDirectory().getPharmacyDirectory()) {
            pharmacyComboBox.addItem(pharmacy);
        }
    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            if (employee.getPharmacy() != null) {
                Object[] row = new Object[3];
                row[0] = employee.getId();
                row[1] = employee.getFname();
                row[2] = employee.getPharmacy().getPharmacyName();
                model.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fnameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lnameJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pharmacyComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Associated Pharmacy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
            organizationJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 480, 92));

        addJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        organizationJComboBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 150, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        fnameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(fnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 150, -1));

        organizationEmpJComboBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        lnameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(lnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 150, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Manage Pharmacy Employees Page");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Associated Pharmacy");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        pharmacyComboBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pharmacyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(pharmacyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String fname = fnameJTextField.getText();
        String lname = lnameJTextField.getText();

        Pharmacy associatedPharmacy = (Pharmacy) pharmacyComboBox.getSelectedItem();
        if (associatedPharmacy.getAdmin().equals("Assigned") && (organization.toString().contains("Admin"))) {
            JOptionPane.showMessageDialog(null, "Admin has been assigned already");
            return;
        }
        if (associatedPharmacy.getFinanaceUser().equals("Assigned") && (organization.toString().contains("Finance"))) {
            JOptionPane.showMessageDialog(null, "Finanace User been assigned already");
            return;
        }
        if (associatedPharmacy.getInventoryUser().equals("Assigned") && (organization.toString().contains("Inventory"))) {
            JOptionPane.showMessageDialog(null, "Inventory User has been assigned already");
            return;
        }
        if (associatedPharmacy.getOrderUser().equals("Assigned") && (organization.toString().contains("Order"))) {
            JOptionPane.showMessageDialog(null, "Order User has been assigned already");
            return;
        }

        if ((!associatedPharmacy.getAdmin().equals("Assigned")) && (organization.toString().contains("Admin"))) {

            Employee employee = organization.getEmployeeDirectory().createEmployee();
            employee.setFname(fname);
            employee.setLname(lname);
            employee.setPharmacy(associatedPharmacy);
            associatedPharmacy.setAdmin("Assigned");
            JOptionPane.showMessageDialog(null, "Pharmacy Admin added successfully");
            fnameJTextField.setText(null);
            lnameJTextField.setText(null);
            return;

        }

        if ((!associatedPharmacy.getFinanaceUser().equals("Assigned")) && (organization.toString().contains("Finance"))) {
            Employee employee = organization.getEmployeeDirectory().createEmployee();
            employee.setFname(fname);
            employee.setLname(lname);
            employee.setPharmacy(associatedPharmacy);
            associatedPharmacy.setFinanaceUser("Assigned");
            JOptionPane.showMessageDialog(null, "Pharmacy Finance User added successfully");
            fnameJTextField.setText(null);
            lnameJTextField.setText(null);
            return;
        }

        if ((!associatedPharmacy.getInventoryUser().equals("Assigned")) && (organization.toString().contains("Inventory"))) {
            Employee employee = organization.getEmployeeDirectory().createEmployee();
            employee.setFname(fname);
            employee.setLname(lname);
            employee.setPharmacy(associatedPharmacy);
            associatedPharmacy.setInventoryUser("Assigned");
            JOptionPane.showMessageDialog(null, "Pharmacy Inventory User added successfully");
            fnameJTextField.setText(null);
            lnameJTextField.setText(null);
            return;
        }

        if ((!associatedPharmacy.getOrderUser().equals("Assigned")) && (organization.toString().contains("Order"))) {
            Employee employee = organization.getEmployeeDirectory().createEmployee();
            employee.setFname(fname);
            employee.setLname(lname);
            employee.setPharmacy(associatedPharmacy);
            associatedPharmacy.setOrderUser("Assigned");
            JOptionPane.showMessageDialog(null, "Pharmacy Order User added successfully");
            fnameJTextField.setText(null);
            lnameJTextField.setText(null);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField fnameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JComboBox pharmacyComboBox;
    // End of variables declaration//GEN-END:variables
}
