/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Vaccine.VaccineCatalog;

/**
 *
 * @author Deepak
 */
public class Patient {

    private int age;
    private String name;
    private String insuranceStatus;
    private int insuranceCoverage;
    private int patientID;
    private static int count = 1;
    private float billAmount = 0;
    boolean alreadyClaimed = false;
    private VaccineCatalog vaccineCatalog;

    public Patient() {
        patientID = count;
        count++;
        vaccineCatalog = new VaccineCatalog();
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public boolean isAlreadyClaimed() {
        return alreadyClaimed;
    }

    public void setAlreadyClaimed(boolean alreadyClaimed) {
        this.alreadyClaimed = alreadyClaimed;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(int insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(VaccineCatalog vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }

    @Override
    public String toString() {
        return String.valueOf(patientID);
    }

}
