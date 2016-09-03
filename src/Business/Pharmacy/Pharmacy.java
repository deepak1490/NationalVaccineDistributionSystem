/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.Clinic.ClinicDirectory;
import Business.Patient.PatientDirectory;

/**
 *
 * @author Deepak
 */
public class Pharmacy {

    private int PharmacyID;
    private String PharmacyName;
    private String PharmacyAddress;
    private String Admin;
    private String FinanaceUser;
    private String OrderUser;
    private String InventoryUser;
    private String RegistrationStatus = "P";
    private static int count = 0;

    private PatientDirectory patientDirectory;
    private ClinicDirectory clinicDirectory;

    public Pharmacy() {
        patientDirectory = new PatientDirectory();
        clinicDirectory = new ClinicDirectory();
        count++;
        PharmacyID = count;
    }

    public int getPharmacyID() {
        return PharmacyID;
    }

    public void setPharmacyID(int PharmacyID) {
        this.PharmacyID = PharmacyID;
    }

    public String getPharmacyName() {
        return PharmacyName;
    }

    public void setPharmacyName(String PharmacyName) {
        this.PharmacyName = PharmacyName;
    }

    public String getPharmacyAddress() {
        return PharmacyAddress;
    }

    public void setPharmacyAddress(String PharmacyAddress) {
        this.PharmacyAddress = PharmacyAddress;
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

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public ClinicDirectory getClinicDirectory() {
        return clinicDirectory;
    }

    public void setClinicDirectory(ClinicDirectory clinicDirectory) {
        this.clinicDirectory = clinicDirectory;
    }

    @Override
    public String toString() {
        return getPharmacyName();
    }

}
