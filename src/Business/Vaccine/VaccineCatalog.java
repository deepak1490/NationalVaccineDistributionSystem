/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class VaccineCatalog {

    private ArrayList<Vaccine> vaccineCatalog;

    public VaccineCatalog() {
        vaccineCatalog = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineCatalog() {
        return vaccineCatalog;
    }

    public Vaccine addVaccine() {
        Vaccine vaccine = new Vaccine();
        vaccineCatalog.add(vaccine);
        return vaccine;
    }

    public void removeVaccine(Vaccine v) {
        vaccineCatalog.remove(v);
    }

    public Vaccine searchVaccine(String name) {

        for (Vaccine v : vaccineCatalog) {
            if (v.getVaccineName().equals(name)) {
                return v;
            }
        }
        return null;
    }
}
