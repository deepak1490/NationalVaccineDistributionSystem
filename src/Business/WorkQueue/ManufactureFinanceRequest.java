/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Vaccine.Vaccine;

/**
 *
 * @author Deepak
 */
public class ManufactureFinanceRequest extends WorkRequest {

    private int orderId;
    private float price;
    private static int count = 0;
    private Vaccine vaccine;
    private int quantity;

    public ManufactureFinanceRequest() {
        count++;
        orderId = count;
        vaccine = new Vaccine();
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
