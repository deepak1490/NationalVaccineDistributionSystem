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
public class RegistrationRequest extends WorkRequest {

    private String registrationStatus;
    private int registrationProcessId;

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public int getRegistrationProcessId() {
        return registrationProcessId;
    }

    public void setRegistrationProcessId(int registrationProcessId) {
        this.registrationProcessId = registrationProcessId;
    }

}
