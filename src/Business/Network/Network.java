/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Inventory.InventoryDirectory;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class Network {

    private String name;
    private int population = 0;
    private EnterpriseDirectory enterpriseDirectory;
    private InventoryDirectory inventoryDirectory;
    private ArrayList<Vaccine> vaccineList;
    private int maxVaccine;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        inventoryDirectory = new InventoryDirectory();
        vaccineList = new ArrayList<>();
    }

    public int getMaxVaccine() {
        return maxVaccine;
    }

    public void setMaxVaccine(int maxVaccine) {
        this.maxVaccine = maxVaccine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public Vaccine addVaccineToList(Vaccine vaccine) {
        Vaccine v = new Vaccine();
        v.setID(vaccine.getID());
        v.setVaccineName(vaccine.getVaccineName());
        vaccineList.add(v);
        return v;
    }

    public void removeVaccine(Vaccine vaccine) {
        vaccineList.remove(vaccine);
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return name;
    }

}
