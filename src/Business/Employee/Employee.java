/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.MasterOrder.MasterOrderCatalog;
import Business.Pharmacy.Pharmacy;
import Business.Vaccine.VaccineCatalog;

/**
 *
 * @author Deepak
 */
public class Employee {

    private String fname;
    private String lname;
    private Hospital hospital;
    private Pharmacy pharmacy;
    private float amount;
    private int id;
    private static int count = 1;
    private HospitalDirectory hospitalDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private VaccineCatalog vaccineCatalog;

    public Employee() {
        id = count;
        count++;
        hospitalDirectory = new HospitalDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        vaccineCatalog = new VaccineCatalog();
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return fname;
    }

}
