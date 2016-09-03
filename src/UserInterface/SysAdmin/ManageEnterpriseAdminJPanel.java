/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysAdmin;

import Business.Cdc;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Deepak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Cdc system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, Cdc system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : system.getNetworkDirectory().getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);

        }

    }

    private void populateRoleComboBox(Enterprise enterprise) {
        roleJComboBox.removeAllItems();

        for (Role role : enterprise.getSupportedRole()) {
            roleJComboBox.addItem(role);
        }

    }

    public void toExcel(JTable table, File file) {
        try {
            TableModel model = table.getModel();
            FileWriter excel = new FileWriter(file);

            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i) + ",");
            }

            excel.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString() + ",");
                }
                excel.write("\n");
            }

            excel.close();

        } catch (IOException e) {
            System.out.println(e);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fnameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJField = new javax.swing.JPasswordField();
        lnameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        exportButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 523, 95));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 160, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        usernameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        enterpriseJComboBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 160, -1));

        submitJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        fnameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(fnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 160, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("First Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        passwordJField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(passwordJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 160, -1));

        lnameJTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(lnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 160, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Last Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Role");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        roleJComboBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 160, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        refreshButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Manage Enterprise Admin Page");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        exportButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exportButton.setText("Export to Excel");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });
        add(exportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        String userName = usernameJTextField.getText();

        char[] passwordCharArray = passwordJField.getPassword();
        String password = String.valueOf(passwordCharArray);

        boolean userAccount = system.getUserAccountDirectory().checkIfUsernameIsUnique(userName);

        boolean inEnterprise = true;
        boolean inOrganization = true;
        if (userAccount == true) {
            for (Network network : system.getNetworkDirectory().getNetworkList()) {
                for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise1.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                    if (userAccount == true) {
                        for (Organization organization : enterprise1.getOrganizationList().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                            if (userAccount != true) {
                                inEnterprise = false;
                                inOrganization = false;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = false;
                        break;
                    }
                    if (inOrganization != true) {
                        userAccount = false;
                        break;
                    }
                }
                if (inEnterprise != true) {
                    userAccount = false;
                    break;
                }
            }
        }
        if (userAccount == false) {
            JOptionPane.showMessageDialog(null, "Please enter a unique User Name");
            usernameJTextField.setText(null);
            passwordJField.setText(null);
            return;
        }
        String username = usernameJTextField.getText();
        String fname = fnameJTextField.getText();
        String lname = lnameJTextField.getText();

        if (usernameJTextField.getText().equals("") || passwordJField.getPassword().equals("") || fnameJTextField.getText().equals("") || lnameJTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Field's can't be empty");
            return;
        }
        Employee employee = enterprise.getEmployeeDirectory().createEmployee();
        employee.setFname(fname);
        employee.setLname(lname);
        Role role = (Role) roleJComboBox.getSelectedItem();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
        JOptionPane.showMessageDialog(null, "Enterprise Admin created sucessfully");
        usernameJTextField.setText(null);
        passwordJField.setText(null);
        fnameJTextField.setText(null);
        lnameJTextField.setText(null);
        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed

        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        if (enterprise != null) {
            populateRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        toExcel(enterpriseJTable, new File("M:\\result.csv"));
    }//GEN-LAST:event_exportButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JButton exportButton;
    private javax.swing.JTextField fnameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}