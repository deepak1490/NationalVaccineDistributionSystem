/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Network.Network;
import Business.Vaccine.Vaccine;

/**
 *
 * @author Deepak
 */
public class InventoryItem {

    private Vaccine vaccine;
    private int quantity;
    private Network network;
    private int availability;
    private float ratio = (float) 0.6;

    public float getRatio() {
        return ratio;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return vaccine.getVaccineName();
    }

}
