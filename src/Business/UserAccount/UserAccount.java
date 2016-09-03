/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Clinic.ClinicDirectory;
import Business.Employee.Employee;
import Business.Inventory.InventoryDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Deepak
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private InventoryDirectory inventoryDirectory;
    private PatientDirectory patientDirectory;
    private ClinicDirectory clinicDirectory;

    public UserAccount() {
        workQueue = new WorkQueue();
        inventoryDirectory = new InventoryDirectory();
        patientDirectory = new PatientDirectory();
        clinicDirectory = new ClinicDirectory();
    }

    public ClinicDirectory getClinicDirectory() {
        return clinicDirectory;
    }

    public void setClinicDirectory(ClinicDirectory clinicDirectory) {
        this.clinicDirectory = clinicDirectory;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }
}
