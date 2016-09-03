/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysAdmin;

import Business.Cdc;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Inventory.InventoryDirectory;
import Business.NationalDistributor.NationalDistributor;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderProcessingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepak
 */
public class ApproveVaccineOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Cdc system;
    private InventoryDirectory inventoryDirectory;

    public ApproveVaccineOrdersJPanel(JPanel userProcessContainer,
            Cdc system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        populateTable();
    }

    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) ordersTable.getModel();
        dtm.setRowCount(0);
        Enterprise e1 = null;

        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {

            if (request.getRequestType().equals("CDC Approval Request")) {
                OrderProcessingRequest req = (OrderProcessingRequest) request;
                Object[] row = new Object[4];
                row[0] = req.getOrderProcessId();
                row[1] = req.getSender().getEmployee().getFname();
                row[2] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getFname();
                row[3] = req;
                dtm.addRow(row);

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
        ordersTable = new javax.swing.JTable();
        assignToMeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        approveOrder = new javax.swing.JButton();
        rejectOrder = new javax.swing.JButton();
        orderDetailsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineCatalog = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Sender Name", "Approver Name", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(ordersTable);
        if (ordersTable.getColumnModel().getColumnCount() > 0) {
            ordersTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 505, 88));

        assignToMeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assignToMeButton.setText("Assign To Me");
        assignToMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeButtonActionPerformed(evt);
            }
        });
        add(assignToMeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        approveOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        approveOrder.setText("Approve Order");
        approveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveOrderActionPerformed(evt);
            }
        });
        add(approveOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        rejectOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rejectOrder.setText("Reject Order");
        rejectOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectOrderActionPerformed(evt);
            }
        });
        add(rejectOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, -1, -1));

        orderDetailsButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderDetailsButton.setText("View Order Details");
        orderDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDetailsButtonActionPerformed(evt);
            }
        });
        add(orderDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        vaccineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(vaccineCatalog);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 375, 92));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Approve Vaccine Orders Page");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignToMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        OrderProcessingRequest request = (OrderProcessingRequest) ordersTable.getValueAt(selectedRow, 3);
        if (ordersTable.getValueAt(selectedRow, 2) == null) {
            request.setReceiver(userAccount);
            request.setStatus("Pending for approval");
            JOptionPane.showMessageDialog(null, "Request has been assigned");
            Employee employee = (Employee) request.getEmployee();
            for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getOrderNumber() == request.getOrderProcessId()) {
                    order.setOrderStatus("Pending for Approval");
                }
            }
            request.setOrderProcessingStatus("Pending for approval with " + userAccount.getEmployee().getFname());
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Request has been assigned already");
        }
    }//GEN-LAST:event_assignToMeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void approveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a order to approve");
            return;
        }
        OrderProcessingRequest request = (OrderProcessingRequest) ordersTable.getValueAt(selectedRow, 3);
        if (request.getStatus().equals("Approved") || request.getStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Order Request already processed");
            return;
        }
        if (request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Request has to be assigned first");
            return;
        }
        if (!(request.getReceiver() == userAccount)) {
            JOptionPane.showMessageDialog(null, "Request has been assigned to another sales rep");
            return;
        }
        UserAccount ua = request.getSender();
        Employee employee = (Employee) request.getEmployee();

        Network net = null;
        for (Network network : system.getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationList().getOrganizationList()) {
                    for (Employee employee1 : organization.getEmployeeDirectory().getEmployeeList()) {
                        if (request.getEmployee().getId() == employee1.getId()) {
                            net = network;
                        }
                    }
                }
            }
        }
        Order ord = null;
        for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
            if (request.getOrderProcessId() == order.getOrderNumber()) {
                ord = order;
                break;
            }
        }

        boolean check = false;
        int totalQuanity = (int) (net.getPopulation() * 0.4);
        int total = 0;
        for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
            if (request.getOrderProcessId() == order.getOrderNumber()) {
                for (OrderItem oi : order.getOrderItemList()) {
                    total = oi.getQuantity() + net.getMaxVaccine();
                }
            }
        }
        if (total > totalQuanity) {
            JOptionPane.showMessageDialog(null, "The ordered quantity exceded the limit for the state! The maximum quantity allocated for the state is " + totalQuanity);
            check = true;
        }
        if (check) {
            for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getOrderNumber() == request.getOrderProcessId()) {
                    order.setOrderStatus("Order rejected by CDC");
                }
            }
            request.setStatus("Rejected");
            request.setOrderProcessingStatus("Rejected");
        } else {

            net.setMaxVaccine(total);
            request.setOrderProcessingStatus("Approved");
            request.setStatus("Approved");
            for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getOrderNumber() == request.getOrderProcessId()) {
                    order.setOrderStatus("Approved by CDC");
                }
            }
            JOptionPane.showMessageDialog(null, "Request processed");
            populateTable();

            OrderProcessingRequest shippingRequest = new OrderProcessingRequest();
            shippingRequest.setStatus("Approved waiting to be shipped");
            shippingRequest.setOrderProcessingStatus("Approved waiting to be shipped");
            shippingRequest.setSender(userAccount);
            shippingRequest.setOrderProcessId(request.getOrderProcessId());
            shippingRequest.setRequestType("Shipping Request");
            shippingRequest.setEmployee(employee);
            NationalDistributor e1 = system.getNationalDistributor();
            if (e1 != null) {
                e1.getWorkQueue().getWorkRequestList().add(shippingRequest);
                ua.getWorkQueue().getWorkRequestList().add(shippingRequest);
            }
        }
        populateTable();
    }//GEN-LAST:event_approveOrderActionPerformed

    private void rejectOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a order to approve");
            return;
        }
        OrderProcessingRequest request = (OrderProcessingRequest) ordersTable.getValueAt(selectedRow, 3);
        if (request.getStatus().equals("Approved") || request.getStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Enrollment Request already processed");
            return;
        }
        if (request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Request has to be assigned first");
            return;
        }
        if (!(request.getReceiver() == userAccount)) {
            JOptionPane.showMessageDialog(null, "Request has been assigned to another sales rep");
            return;
        }
        request.setOrderProcessingStatus("Rejected");
        request.setStatus("Rejected");
        UserAccount ua = request.getSender();
        Employee employee = (Employee) request.getEmployee();
        for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
            if (order.getOrderNumber() == request.getOrderProcessId()) {
                order.setOrderStatus("Rejected");
            }
        }
        JOptionPane.showMessageDialog(null, "Request processed");
        populateTable();
    }//GEN-LAST:event_rejectOrderActionPerformed

    private void orderDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDetailsButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an order to view");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) vaccineCatalog.getModel();
        dtm.setRowCount(0);
        OrderProcessingRequest request = (OrderProcessingRequest) ordersTable.getValueAt(selectedRow, 3);
        Order ord = null;

        Employee employee = request.getEmployee();
        for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
            if (request.getOrderProcessId() == order.getOrderNumber()) {
                ord = order;
                break;
            }
        }
        for (OrderItem oi : ord.getOrderItemList()) {
            Object row[] = new Object[3];
            row[0] = oi;
            row[1] = oi.getVaccine().getID();
            row[2] = oi.getQuantity();
            dtm.addRow(row);
        }
    }//GEN-LAST:event_orderDetailsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveOrder;
    private javax.swing.JButton assignToMeButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton orderDetailsButton;
    private javax.swing.JTable ordersTable;
    private javax.swing.JButton rejectOrder;
    private javax.swing.JTable vaccineCatalog;
    // End of variables declaration//GEN-END:variables
}