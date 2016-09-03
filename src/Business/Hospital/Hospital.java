/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Clinic.ClinicDirectory;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author Deepak
 */
public class Hospital {

    private int HospitalID;
    private String HospitalName;
    private String HospitalAddress;
    private String Admin;
    private String FinanaceUser;
    private String OrderUser;
    private String InventoryUser;
    private String RegistrationStatus = "P";
    private static int count = 0;

    private PatientDirectory patientDirectory;
    private ClinicDirectory clinicDirectory;
    private UserAccountDirectory userAccountDirectory;

    public Hospital() {
        patientDirectory = new PatientDirectory();
        clinicDirectory = new ClinicDirectory();
        userAccountDirectory = new UserAccountDirectory();
        count++;
        HospitalID = count;
    }

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    public int getHospitalID() {
        return HospitalID;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getHospitalAddress() {
        return HospitalAddress;
    }

    public void setHospitalAddress(String HospitalAddress) {
        this.HospitalAddress = HospitalAddress;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public ClinicDirectory getClinicDirectory() {
        return clinicDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public String getFinanaceUser() {
        return FinanaceUser;
    }

    public void setFinanaceUser(String FinanaceUser) {
        this.FinanaceUser = FinanaceUser;
    }

    public String getOrderUser() {
        return OrderUser;
    }

    public void setOrderUser(String OrderUser) {
        this.OrderUser = OrderUser;
    }

    public String getInventoryUser() {
        return InventoryUser;
    }

    public void setInventoryUser(String InventoryUser) {
        this.InventoryUser = InventoryUser;
    }

    @Override
    public String toString() {
        return getHospitalName();
    }

}
