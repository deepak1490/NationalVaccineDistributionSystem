/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;

/**
 *
 * @author Deepak
 */
public class FinanceRequest extends WorkRequest {

    private int orderId;
    private float price;
    private static int count = 0;
    private Employee employee;

    public FinanceRequest() {
        count++;
        orderId = count;
        employee = new Employee();
    }

    public float getPrice() {
        return price;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
