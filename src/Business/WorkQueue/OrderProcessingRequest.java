/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Patient.Patient;

/**
 *
 * @author Deepak
 */
public class OrderProcessingRequest extends WorkRequest {

    private String orderProcessingStatus;
    private int orderProcessId;
    private Employee employee;
    private Patient patient;
    private boolean bill = false;

    public OrderProcessingRequest() {
        employee = new Employee();
        patient = new Patient();
    }

    public boolean isBill() {
        return bill;
    }

    public void setBill(boolean bill) {
        this.bill = bill;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getOrderProcessId() {
        return orderProcessId;
    }

    public void setOrderProcessId(int orderProcessId) {
        this.orderProcessId = orderProcessId;
    }

    public String getOrderProcessingStatus() {
        return orderProcessingStatus;
    }

    public void setOrderProcessingStatus(String orderProcessingStatus) {
        this.orderProcessingStatus = orderProcessingStatus;
    }

}
