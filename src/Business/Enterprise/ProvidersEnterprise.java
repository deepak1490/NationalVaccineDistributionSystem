/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Hospital.HospitalDirectory;
import Business.Inventory.InventoryDirectory;
import Business.Patient.PatientDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.ProviderAdminRole;
import java.util.ArrayList;
import Business.Role.Role;
import Business.Vaccine.Vaccine;

/**
 *
 * @author Deepak
 */
public class ProvidersEnterprise extends Enterprise {

    private HospitalDirectory hospitalDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private InventoryDirectory inventoryDirectory;
    private PatientDirectory patientDirectory;
    private ArrayList<Vaccine> vaccineList;

    public ProvidersEnterprise(String name) {
        super(name, EnterpriseType.Providers);
        hospitalDirectory = new HospitalDirectory();
        pharmacyDirectory = new PharmacyDirectory();
        inventoryDirectory = new InventoryDirectory();
        patientDirectory = new PatientDirectory();
        vaccineList = new ArrayList<>();

    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public Vaccine addVaccineToList(Vaccine vaccine) {
        vaccineList.add(vaccine);
        return vaccine;
    }

    public void removeVaccine(Vaccine vaccine) {
        vaccineList.remove(vaccine);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderAdminRole());
        return roles;
    }
}
