/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Vaccine.Vaccine;

/**
 *
 * @author Deepak
 */
public class ReportVaccineWorkRequest extends WorkRequest {

    private Vaccine vaccine;
    private String issueReport;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getIssueReport() {
        return issueReport;
    }

    public void setIssueReport(String issueReport) {
        this.issueReport = issueReport;
    }

    @Override
    public String toString() {
        return vaccine.getVaccineName();
    }

}
