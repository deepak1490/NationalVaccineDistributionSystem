/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Deepak
 */
public class ManufactureRequest extends WorkRequest {

    private int vaccineId;
    private int orderId;
    private int quantity;
    private static int count = 0;
    private int orderProcessId;

    public ManufactureRequest() {
        count++;
        orderId = count;
    }

    public int getOrderProcessId() {
        return orderProcessId;
    }

    public void setOrderProcessId(int orderProcessId) {
        this.orderProcessId = orderProcessId;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
