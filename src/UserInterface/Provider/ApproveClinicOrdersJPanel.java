/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Provider;

import Business.Cdc;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PHDEnterprise;
import Business.Inventory.InventoryItem;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinanceRequest;
import Business.WorkQueue.OrderProcessingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepak
 */
public class ApproveClinicOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Cdc system;
    boolean finalflag;
    public boolean IsPrevOrderSuccess = true;
    private static int count = 0;
    private Order order;
    FinanceRequest financeRequest;

    public ApproveClinicOrdersJPanel(JPanel userProcessContainer,
            UserAccount userAccount,
            Enterprise enterprise, Cdc system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
        populateTable();
        populateVaccineInventoryTable();
    }

    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) ordersJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {

            if (request instanceof OrderProcessingRequest) {
                if (request.getRequestType().equals("Clinic")) {
                    OrderProcessingRequest req = (OrderProcessingRequest) request;
                    Object[] row = new Object[4];
                    row[0] = req.getOrderProcessId();
                    row[1] = req.getSender().getEmployee();
                    row[2] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getFname();
                    row[3] = req;
                    dtm.addRow(row);
                }
            }
        }
    }

    public void populateVaccineInventoryTable() {

        DefaultTableModel dtm = (DefaultTableModel) inventoryDetailsTable.getModel();
        dtm.setRowCount(0);
        for (InventoryItem inventoryItem : userAccount.getInventoryDirectory().getInventoryList()) {
            Object[] row = new Object[7];
            row[0] = inventoryItem.getVaccine();
            row[1] = inventoryItem.getVaccine().getID();
            row[2] = inventoryItem.getVaccine().getDiseaseName();
            row[3] = inventoryItem.getVaccine().getManufactureDate();
            row[4] = inventoryItem.getVaccine().getExpiryDate();
            row[5] = inventoryItem.getQuantity();
            row[6] = inventoryItem.getVaccine().getPrice();
            dtm.addRow(row);
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
        ordersJTable = new javax.swing.JTable();
        assignToMeJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        approveOrderJButton = new javax.swing.JButton();
        orderDetailsJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineCatalogJTable = new javax.swing.JTable();
        titleJLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inventoryDetailsTable = new javax.swing.JTable();
        generateBillJbutton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Requester Name", " Approver Name", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(ordersJTable);
        if (ordersJTable.getColumnModel().getColumnCount() > 0) {
            ordersJTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 505, 88));

        assignToMeJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assignToMeJButton.setText("Assign To Me");
        assignToMeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButtonActionPerformed(evt);
            }
        });
        add(assignToMeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 670, -1, -1));

        approveOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        approveOrderJButton.setText("Ship Order");
        approveOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveOrderJButtonActionPerformed(evt);
            }
        });
        add(approveOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        orderDetailsJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderDetailsJButton.setText("View Order Details");
        orderDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDetailsJButtonActionPerformed(evt);
            }
        });
        add(orderDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        vaccineCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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
        jScrollPane2.setViewportView(vaccineCatalogJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 375, 92));

        titleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleJLabel.setText("Approve Vaccine Orders Page");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        inventoryDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccine ID", "Disease Name", "Manufacture Date", "Expiry Date", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(inventoryDetailsTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 810, 180));

        generateBillJbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        generateBillJbutton.setText("Generate Bill");
        generateBillJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBillJbuttonActionPerformed(evt);
            }
        });
        add(generateBillJbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignToMeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        OrderProcessingRequest request = (OrderProcessingRequest) ordersJTable.getValueAt(selectedRow, 3);
        if (ordersJTable.getValueAt(selectedRow, 2) == null) {
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
    }//GEN-LAST:event_assignToMeJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void approveOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveOrderJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersJTable.getSelectedRow();
        Employee emp = userAccount.getEmployee();
        Network n = null;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a order to approve");
            return;
        }
        OrderProcessingRequest request = (OrderProcessingRequest) ordersJTable.getValueAt(selectedRow, 3);
        if (request.getStatus().equals("Approved") || request.getStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Order Request already processed");
            return;
        }
        if (request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Request has to be assigned first");
            return;
        }

        UserAccount ua = request.getSender();
        Employee employee = ua.getEmployee();
        Order ord = null;
        for (Order order1 : employee.getMasterOrderCatalog().getOrderCatalog()) {
            if (request.getOrderProcessId() == order1.getOrderNumber()) {
                ord = order1;
                break;
            }
        }
        boolean flag = true;
        boolean orderFlag = true;
        if (!request.isBill()) {
            JOptionPane.showMessageDialog(null, "Bill has to be generated!!!");
            return;
        }
        if (financeRequest != null) {
            if (!financeRequest.getStatus().equals("Paid")) {
                JOptionPane.showMessageDialog(null, "Provider has not paid");
                return;
            }
        }

        for (InventoryItem inventoryItem : userAccount.getInventoryDirectory().getInventoryList()) {
            for (OrderItem oi : ord.getOrderItemList()) {
                if (inventoryItem.getVaccine() == oi.getVaccine()) {
                    if (inventoryItem.getQuantity() >= oi.getQuantity()) {
                        JOptionPane.showMessageDialog(null, oi.getVaccine().getVaccineName() + " exits in the inventory");
                    } else {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Not enough " + oi.getVaccine().getVaccineName() + "!!! Order has been placed");
                        if (order == null) {
                            order = new Order();
                        } else {
                            ArrayList<OrderItem> oi1 = order.getOrderItemList();
                            for (OrderItem orderItem : oi1) {
                                if (orderItem.getVaccine().equals(oi.getVaccine())) {
                                    orderItem.setQuantity(oi.getQuantity() - inventoryItem.getQuantity());
                                    orderFlag = false;
                                }

                            }
                        }
                        if (orderFlag == true) {
                            OrderItem oItem = order.addOrderItem(oi.getVaccine(), oi.getQuantity() - inventoryItem.getQuantity(), 0);
                        }

                        Order addedOrder = emp.getMasterOrderCatalog().addOrder(order);
                        int orderNo = 1;
                        for (Order ord1 : emp.getMasterOrderCatalog().getOrderCatalog()) {
                            if (orderNo == ord1.getOrderNumber()) {
                                orderNo++;
                            }
                        }
                        if (addedOrder != null) {
                            order.setOrderNumber(orderNo);
                            order.setOrderStatus("Processing");
                            order = new Order();
                            OrderProcessingRequest request1 = new OrderProcessingRequest();
                            request1.setStatus("Processing");
                            request1.setOrderProcessingStatus("Processing");
                            request1.setSender(userAccount);
                            request1.setOrderProcessId(orderNo);
                            request1.setRequestType("Hospital Order Request");
                            Organization org = null;
                            Enterprise e1 = null;
                            for (Network network : system.getNetworkDirectory().getNetworkList()) {
                                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                                    if (e == enterprise) {
                                        n = network;
                                        break;
                                    }
                                }
                            }
                            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                                if (e instanceof PHDEnterprise) {
                                    e1 = e;
                                }
                            }
                            if (e1 != null) {
                                e1.getWorkQueue().getWorkRequestList().add(request1);
                                userAccount.getWorkQueue().getWorkRequestList().add(request1);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        if (!flag) {
            request.setOrderProcessingStatus("Approved");
            request.setStatus("Pending with Manufacturer");
        } else {
            request.setOrderProcessingStatus("Approved");
            request.setStatus("Approved");
            for (Order order : emp.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getOrderNumber() == request.getOrderProcessId()) {
                    order.setOrderStatus("Approved & Shipped");
                }
            }
            float totalprice = 0;
            for (Order order : emp.getMasterOrderCatalog().getOrderCatalog()) {
                if (request.getOrderProcessId() == order.getOrderNumber()) {
                    for (OrderItem item : order.getOrderItemList()) {

                        totalprice = totalprice + item.getQuantity() * item.getVaccine().getPrice();
                    }
                }
                for (InventoryItem inventoryItem : userAccount.getInventoryDirectory().getInventoryList()) {
                    for (OrderItem oi : ord.getOrderItemList()) {
                        if (inventoryItem.getVaccine() == oi.getVaccine()) {
                            if (inventoryItem.getQuantity() >= oi.getQuantity()) {
                                inventoryItem.setQuantity(inventoryItem.getQuantity() - oi.getQuantity());
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Request processed ");
            populateTable();
            populateVaccineInventoryTable();
        }
    }//GEN-LAST:event_approveOrderJButtonActionPerformed

    private void orderDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = ordersJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an order to view");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) vaccineCatalogJTable.getModel();
        dtm.setRowCount(0);
        OrderProcessingRequest request = (OrderProcessingRequest) ordersJTable.getValueAt(selectedRow, 3);
        Order ord = null;
        UserAccount ua = request.getSender();
        Employee employee = (Employee) ua.getEmployee();

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
    }//GEN-LAST:event_orderDetailsJButtonActionPerformed

    private void generateBillJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBillJbuttonActionPerformed

        int selectedRow = ordersJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a order to approve");
            return;
        }

        OrderProcessingRequest request = (OrderProcessingRequest) ordersJTable.getValueAt(selectedRow, 3);
        if (request.getStatus().equals("Approved") || request.getStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Order Request already processed");
            return;
        }
        if (request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Request has to be assigned first");
            return;
        }
        financeRequest = new FinanceRequest();
        if (request.isBill()) {
            JOptionPane.showMessageDialog(null, "Bill already generated!!!");
            return;
        }
        request.setBill(true);
        financeRequest.setStatus("Payment Pending");
        request.setStatus("Payment Pending");
        float totalprice = 0;

        UserAccount ua = request.getSender();
        Employee emp = ua.getEmployee();

        for (Order order : emp.getMasterOrderCatalog().getOrderCatalog()) {
            if (request.getOrderProcessId() == order.getOrderNumber()) {
                for (OrderItem item : order.getOrderItemList()) {

                    totalprice = totalprice + item.getQuantity() * item.getVaccine().getPrice();
                }
            }
            financeRequest.setOrderId(request.getOrderProcessId());
            financeRequest.setPrice(totalprice);
            financeRequest.setSender(userAccount);
            financeRequest.setEmployee(emp);

        }
        ua.getWorkQueue().getWorkRequestList().add(financeRequest);
        JOptionPane.showMessageDialog(null, "Bill has been generated to Clinic");
    }//GEN-LAST:event_generateBillJbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveOrderJButton;
    private javax.swing.JButton assignToMeJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton generateBillJbutton;
    private javax.swing.JTable inventoryDetailsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton orderDetailsJButton;
    private javax.swing.JTable ordersJTable;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JTable vaccineCatalogJTable;
    // End of variables declaration//GEN-END:variables
}
