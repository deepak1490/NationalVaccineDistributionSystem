/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class ClinicDirectory {

    private ArrayList<Clinic> clinicList;

    public ClinicDirectory() {
        clinicList = new ArrayList<>();
    }

    public ArrayList<Clinic> getClinicList() {
        return clinicList;
    }

    public void setClinicList(ArrayList<Clinic> clinicList) {
        this.clinicList = clinicList;
    }

    public Clinic addClinic() {
        Clinic c = new Clinic();
        clinicList.add(c);
        return c;
    }

    public void removeClinic(Clinic c) {
        clinicList.remove(c);
    }
}
