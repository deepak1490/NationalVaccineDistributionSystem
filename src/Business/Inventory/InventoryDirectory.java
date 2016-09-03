/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Network.Network;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class InventoryDirectory {

    private ArrayList<InventoryItem> inventoryList;

    public InventoryDirectory() {
        inventoryList = new ArrayList<InventoryItem>();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public InventoryItem addInventory(Network network, Vaccine vaccine, int qty) {
        InventoryItem inventory = new InventoryItem();
        inventory.setNetwork(network);
        inventory.setVaccine(vaccine);
        inventory.setQuantity(qty + inventory.getQuantity());
        inventory.setAvailability((int) ((network.getPopulation() * 0.6) - inventory.getQuantity()));
        inventoryList.add(inventory);
        return inventory;
    }

    public InventoryItem addAndUpdate(Vaccine vaccine, int quantity) {
        boolean flag = false;
        InventoryItem item1 = null;
        for (InventoryItem item : inventoryList) {
            if (item.getVaccine() == vaccine) {
                item.setQuantity(item.getQuantity() + quantity);
                flag = true;
                item1 = item;
            }
        }
        if (!flag) {
            InventoryItem inventory = new InventoryItem();
            inventory.setVaccine(vaccine);
            inventory.setQuantity(quantity);
            inventoryList.add(inventory);
            item1 = inventory;
        }
        return item1;
    }
}
