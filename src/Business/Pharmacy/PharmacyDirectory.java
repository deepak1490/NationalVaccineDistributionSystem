/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class PharmacyDirectory {

    private ArrayList<Pharmacy> pharmacyDirectory;

    public PharmacyDirectory() {
        pharmacyDirectory = new ArrayList<>();
    }

    public ArrayList<Pharmacy> getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(ArrayList<Pharmacy> pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }

    public Pharmacy addPharmacy() {
        Pharmacy p = new Pharmacy();
        pharmacyDirectory.add(p);
        return p;
    }

    public void removePharmacy(Pharmacy p) {
        pharmacyDirectory.remove(p);
    }

    public Pharmacy searchPharmacy(String name) {

        for (Pharmacy p : pharmacyDirectory) {
            if (p.getPharmacyName().equals(name)) {
                return p;
            }
        }
        return null;
    }
}
